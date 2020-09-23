<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>员工管理系统</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="stylesheet" href="../css/font.css">
    <link rel="stylesheet" href="../css/index.css">
    <link rel="stylesheet" href="../css/iconfont.css">
    <script src="../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../js/index.js"></script>
    <script src="../js/tools.js"></script>
    <style>
        .show_list {
            display: block !important;
        }

        .hide_lits {
            display: none;
        }

    </style>

</head>
<body class="index">
<!-- 顶部开始 -->
<div class="container">
    <div class="logo">
        <a href=getRootPath()+"/home/index">员工管理系统</a></div>
    <div class="left_open">
        <a><i title="展开左侧栏" class="iconfont">&#xe699;</i></a>
    </div>

    <ul class="layui-nav right" lay-filter="">
        <li class="layui-nav-item">
            <a href="javascript:;">admin</a>
            <dl class="layui-nav-child">
                <!-- 二级菜单 -->
                <dd>
                    <a onclick="xadmin.open('个人信息',getRootPath()+'/home/personal.do')">个人信息</a></dd>
                <dd>
                    <a onclick="xadmin.open('切换帐号',getRootPath()+'/user/quit.do')">切换帐号</a></dd>
                <dd>
                    <a href=getRootPath()+"/home/quit.do">退出</a></dd>
            </dl>
        </li>
    </ul>


</div>
<!-- 顶部结束 -->
<!-- 中部开始 -->
<!-- 左侧菜单开始 -->
<div class="left-nav show_list" id="table1">
    <div id="side-nav">
        <ul id="nav">
            <li>
                <a href="javascript:;" onclick="xadmin.add_tab('我的桌面',getRootPath()+'/home/welcome.do')">
                    <i class="layui-icon left-nav-li" lay-tips="首页">&#xe68e;</i>
                    <cite>首页</cite>
                    <i class="iconfont nav_right">&#xe697;</i></a>

            </li>

            <li class="layui-nav-item">
                <a href="javascript:;">
                    <i class="iconfont left-nav-li icon-shangpinguanli" lay-tips="员工管理"></i>
                    <cite>员工管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i></a>
                <ul class="sub-menu">
                    <li>
                        <a onclick="xadmin.add_tab('员工信息列表',getRootPath()+'/employee/getEmployeeInfo.do')">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>商品列表</cite></a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</div>

</div>

<!-- 左侧菜单结束 -->
<!-- 右侧主体开始 -->
<div class="page-content">
    <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
        <ul class="layui-tab-title">
            <li class="home">
                <i class="layui-icon">&#xe68e;</i>我的桌面
            </li>
        </ul>
        <div class="layui-unselect layui-form-select layui-form-selected" id="tab_right">
            <dl>
                <dd data-type="this">关闭当前</dd>
                <dd data-type="other">关闭其它</dd>
                <dd data-type="all">关闭全部</dd>
            </dl>
        </div>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src= "welcome.do" frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
        </div>
        <div id="tab_show"></div>
    </div>
</div>
<div class="page-content-bg"></div>
<style id="theme_style"></style>
<!-- 右侧主体结束 -->
<!-- 中部结束 -->
</body>
<script src="../js/jquerymin.js"></script>
</html>

<script>
    $(".daohang").click(function () {
        var table = $(this).attr("ids");
        var ids = $(".show_list").attr("id");
        $("#" + ids + "").addClass("hide_lits");
        $("#" + ids + "").removeClass("show_list");
        $("" + table + "").removeClass("hide_lits");
        $("" + table + "").addClass("show_list");
    })


    window.onload = function () {
        var click = document.getElementById('new-nav');
        var news = document.getElementById('news');
        click.addEventListener('mousemove', function () {
            news.style.display = 'block';
        });
        click.addEventListener('mouseout', function () {
            news.style.display = 'none';
        });

        var gonggao = document.getElementById('gonggao');
        var gonggaos = document.getElementById('gonggaos');
        gonggao.addEventListener('mousemove', function () {
            gonggaos.style.display = 'block';
        });
        gonggao.addEventListener('mouseout', function () {
            gonggaos.style.display = 'none';
        });
    }


</script>


