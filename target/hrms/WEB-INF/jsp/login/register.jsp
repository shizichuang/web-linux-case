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
<link href="../css/bootstrap.min.css" type="text/css" rel="stylesheet">
<link href="../css/font-awesome.min.css" type="text/javascript" rel="stylesheet">
<link href="../css/bootsnav.css" type="text/css" rel="stylesheet">
<link href="../css/normalize.css" type="text/css" rel="stylesheet">
<link href="../css/css.css" rel="stylesheet" type="text/css">
<script src="../js/jquery-1.11.0.min.js" type="text/javascript"></script>
<script src="../js/jquery.step.js"></script>
<script src="../js/bootstrap.min.js" type="text/javascript"></script>
<script src="../js/bootsnav.js" type="text/javascript"></script>
<script src="../js/common.js" type="text/javascript"></script>
<title>注册</title>
</head>

<body class="logobg_style">
  <div id="large-header" class="large-header login-page">
  	<canvas id="demo-canvas" width="1590" height="711"></canvas>
  	<div class="Retrieve_style">
  	  <div class="Retrieve-content step-body" id="myStep">
  		<h1 class="title_name">用户注册</h1>
  		<div class="step-header"> <ul><li><p>输入电话</p></li><li><p>确认密码</p></li><li><p>成功</p></li></ul></div>
 		  <div class="step-content">
  			<div class="step-list login_padding">
  				<form  role="form" id="form_login" class="">
				 <div class="form-group clearfix">
					<div class="input-group col-lg-8 col-md-8 col-xs-8">
						<div class="input-group-addon"><i class="icon_phone"></i></div>
                        <input type="text" class="form-control text_phone" name="phone" id="phone" placeholder="你的手机号" autocomplete="off">
					</div>
                        <div class="col-lg-4 col-md-4 col-xs-4 fl"><input type="button" id="btn" class="btn_mfyzm" value="获取验证码" onclick="Sendpwd(this)"/></div>
				</div>
				<div class="form-group clearfix">
				 <div class="input-group">
					<div class="input-group-addon"><i class="icon_yanzhen"></i></div>
                    <input type="text"  class="form-control"  name="Verification" id="Verification"   placeholder="短信验证码" autocomplete="off">
					</div>
				</div>
             <div class="tishi"></div>
             </form> 
            <div class="form-group">
					<button  class="btn btn-danger btn-block btn-login" id="applyBtn" >下一步</button>
				</div>	
			
			</div>
			<div class="step-list">
				<form method="post" role="form" id="" class="login_padding">
				  <div class="form-group clearfix">
					<div class="input-group">
						<div class="input-group-addon">
							<i class="icon_password"></i>
						</div>
						<input type="password" class="form-control" name="password" id="password" placeholder="重置密码" autocomplete="off">
					</div>

				</div>
				<div class="form-group clearfix">
					<div class="input-group">
						<div class="input-group-addon">
							<i class="icon_password"></i>
						</div>
						<input type="password" class="form-control" name="confirmpwd" id="confirmpwd" placeholder="再次密码" autocomplete="off">
					</div>
				</div>
				 <div class="tishis"></div>
				<div class="form-group">
					<a href="javascript:void(0);" type="submit" class="btn btn-danger btn-block btn-login" id="submitBtn">下一步</a>
				</div>
				</form>
				</div>
					<div class="step-list">
					<div class="ok_style center">
                            <h2><img src="../images/ok.png"></h2>
	                        <h5 class="color2 mtb20">你已成功注册会员<b id="sec">5</b>秒后跳转到首页</h5>
	                        <a href="JavaScript：ovid()" class="btn btn-danger">首页</a>
	                        <a href="register" class="btn btn-primary">重新注册</a>
					</div>
				</div>
			</div>
  		</div> 			
  </div>
 </div> 	
<script src="../js/TweenLite/TweenLite.min.js"></script>
<script src="../js/TweenLite/EasePack.min.js"></script>
<script src="../js/TweenLite/rAF.js"></script>
<script src="../js/TweenLite/demo-1.js"></script>
</body>
</html>
<script type="text/javascript">
	//注册操作
	var validCode = true;
	function Sendpwd(sender) {
		var time = 30;
		var phones = $.trim($("#phone").val());
		if ($.trim(phones) == "") {
			Tip('请填写手机号码！');
			$("#phone").focus();
			return;
		}
		var code = $(sender);
		if (validCode) {
			validCode = false;
			code.addClass("msgs1").attr("disabled", true);
			;
			var t = setInterval(function () {
				time--;
				code.val(time + "秒");
				if (time == 0) {
					clearInterval(t);
					code.val("重新获取");
					validCode = true;
					code.removeClass("msgs1").attr("disabled", false);

				}
			}, 1000);
		}

	}
</script>
