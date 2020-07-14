<%--
  Created by IntelliJ IDEA.
  User: const
  Date: 2020/7/4
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>第一个项目</title>
    <link href="${pageContext.request.contextPath}/view/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/view/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/view/css/index.css" rel="stylesheet">
</head>
<body>

<div class="container-fluid">
    <div class="row" id="top">
        <div class="col-lg-2">首页</div>
        <div class="col-lg-6"></div>
        <div class="col-lg-4"  >
            <ul class="list-inline text-right  visible-lg" id="top_message">
                <li><a href="#">加入</a></li>
                <li><a href="#">帮助</a></li>
                <li><a href="#">反馈</a></li>
            </ul>
        </div>
    </div>
    <div class="row" id="medinu">
        <form action="login" class="col-lg-4 col-lg-offset-7 col-md-4 col-md-offset-7 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2">
            <div class="form-group col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1 col-sm-10 col-sm-offset-1 col-xs-10 col-xs-offset-1">
                <label for="exampleInputEmail1" class="sr-only"></label>
                <input type="text" class="form-control input-lg" id="exampleInputEmail1" placeholder="手机号" name="uphone" value="13699418536">
            </div>
            <div class="form-group col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1 col-sm-10 col-sm-offset-1 col-xs-10 col-xs-offset-1">
                <label for="exampleInputEmail1" class="sr-only"></label>
                <input type="password" class="form-control input-lg" id="" placeholder="密码" name="upassword" value="123456">
            </div>
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1 col-sm-10 col-sm-offset-1 col-xs-10 col-xs-offset-1 " id="button">
                <input type="submit" value="登录" class="col-lg-4 col-lg-offset-1 col-md-4 col-md-offset-1 col-sm-4 col-sm-offset-1 col-xs-4 col-xs-offset-1 button_style">
                <button type="button" class="col-lg-4 col-lg-offset-2 col-md-4 col-md-offset-2 col-sm-4 col-sm-offset-2 col-xs-4 col-xs-offset-2 button_style">注册</button>
            </div>

        </form>


    </div>
</div>

</body>
<script src=${pageContext.request.contextPath}/view/js/jquery-3.1.1.js></script>
<script src="${pageContext.request.contextPath}/view/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/view/js/index.js"></script>
</html>
