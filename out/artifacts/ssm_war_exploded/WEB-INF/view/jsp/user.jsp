<%--
  Created by IntelliJ IDEA.
  User: const
  Date: 2020/7/4
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@  taglib  uri="http://java.sun.com/jstl/core"  prefix="c"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>课程</title>
    <link href="${pageContext.request.contextPath}/view/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/view/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/view/css/user.css" rel="stylesheet">
</head>
<body>
    <div class="container-fluid">
        <div class="row" id="top">
            <div class="col-lg-2">
                课程
            </div>
            <div class="col-lg-3 col-lg-offset-7 text-right visible-lg">
                <ul class="list-inline">
                    <li><a href="">我的</a></li>
                    <li><a href="">设置</a></li>
                </ul>
            </div>
        </div>
        <div class="row" id="meddinu">
            <div class="col-lg-8 col-lg-offset-2 text-center col-md-8 col-md-offset-2 col-sm-8 col-sm-offset-2 col-xs-10 col-xs-offset-1" >
                <div class="row" id="meddiu_box">

                    <div v-for="site in sites" class="col-lg-3 col-md-4 col-sm-5 col-sm-offset-1  col-xs-6 col-xs-offset-3">
                        <a v-bind:href=site.cid >
                        <div class="img"><img v-bind:src=site.cpicter></div>
                        <span>{{site.cname}}</span>
                        </a>
                    </div>

                </div>
            </div>

        </div>
    </div>

    <script src=${pageContext.request.contextPath}/view/js/vue.js></script>
    <script src=${pageContext.request.contextPath}/view/js/jquery-3.1.1.js></script>
</body>
<script>
    new Vue({
        el: '#meddiu_box',
        data: {
            sites: []
        },
        created: function () {
            var self = this;
            $.ajax({
                url: 'selectCourses',
                type: 'get',
                data: {},
                dataType: 'json'
            }).then(function (res) {
                console.log(res)
                for (var a in res){
                  res[a].cid="topicJsp/"+res[a].cid
                }
                self.sites = res;
            }).fail(function () {
                console.log('失败');
            })
        }
    })
    function topic() {
        // var cid = $(".topic").attr('name');
        // $('.topic').attr('href','topicJsp/'+ cid);
    }
</script>
</html>
