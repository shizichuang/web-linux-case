<%--
  Created by IntelliJ IDEA.
  User: zichuangshi
  Date: 2020/9/10
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link href="../css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="../css/font-awesome.min.css" type="text/javascript" rel="stylesheet">
    <link href="../css/bootsnav.css" type="text/css" rel="stylesheet">
    <link href="../css/normalize.css" type="text/css" rel="stylesheet">
    <link href="../css/css.css" rel="stylesheet" type="text/css">
    <script src="../js/jquery-1.11.0.min.js" type="text/javascript"></script>
    <script src="../js/bootstrap.min.js" type="text/javascript"></script>
    <script src="../js/bootsnav.js" type="text/javascript"></script>
    <script src="../js/common.js" type="text/javascript"></script>
    <title>登录</title>
</head>

<body class="logobg_style">
<div id="large-header" class="large-header login-page">
    <canvas id="demo-canvas" width="1590" height="711"></canvas>
    <div class="login-form">
        <div class="login-content">
            <h1 class="title_name">账户登录</h1>
            <form method="post" role="form" id="form_login" class="login_padding">
                <div class="form-group clearfix">

                    <div class="input-group">
                        <div class="input-group-addon">
                            <i class="icon_user"></i>
                        </div>

                        <input type="text" class="form-control" name="username" id="username" placeholder="手机号"
                               autocomplete="off">
                    </div>

                </div>

                <div class="form-group clearfix">

                    <div class="input-group">
                        <div class="input-group-addon">
                            <i class="icon_password"></i>
                        </div>

                        <input type="password" class="form-control" name="password" id="password" placeholder="密码"
                               autocomplete="off">
                    </div>

                </div>
                <div class=" textright"><a href="#" class="forget">忘记密码？</a></div>
                <div class="tishi"></div>
                <div class="form-group">
                    <a href="javascript:;" type="submit" class="btn btn-danger btn-block btn-login"
                       onClick="cliLogin()">
                        <i class="fa fa-sign-in"></i>
                        登录
                    </a>
                </div>
                <div class=" textright"><a href=getRootPath()+"/user/register" class="forget">立即注册</a></div>
                <!-- Implemented in v1.1.4 -->
                <div class="form-group">

                </div>


            </form>
        </div>

    </div>
</div>

<script src="../js/TweenLite/TweenLite.min.js"></script>
<script src="../js/TweenLite/EasePack.min.js"></script>
<script src="../js/TweenLite/rAF.js"></script>
<script src="../js/TweenLite/demo-1.js"></script>
<script src="../js/jquery-2.1.0.js"></script>
<script src="../js/tools.js"></script>
</body>
<script type="text/javascript">
    //登录操作
    $(document).ready(function () {
        if (screen.width < 780 && $(window).width() < 780) {
            $(".content_list").hide();

        } else {
            $(".content_list").show();
        }
        $(window).resize(function () {
            $(".content_list").show();
        });
    });
    //登录操作
    var phone = /[1][3-9][0-9]{9,9}/;
    function cliLogin() {
        var txtUser = $.trim($("#username").val());
        var txtPwd = $("#password").val();
        if ($.trim(txtUser) == "") {
            Tip('请输入你的手机号');
            $("#txtUser").focus();
            return;
        }
        if (!phone.exec(txtUser)) {
            Tip('手机输入格式不正确,请从新输入');
            $("#txtUser").focus();
            return;
        }
        if ($.trim(txtPwd) == "") {
            Tip('请输入密码！');
            $("#Userpwd").focus();
            return;
        }
        $.ajax({
            url: getRootPath()+"/user/authority.do",
            type: 'POST',
            data:{"phone":txtUser,userPassword:txtPwd},
            async: false,
            dataType: 'json',
            success: function (data) {
                if(data.code == "0"){
                    toUrl(getRootPath()+'/home/index.do');
                }else{
                    Tip('用户信息不存在，请注册后登录！');
                }
            }
        });
    }
</script>
</html>
