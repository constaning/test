<%--
  Created by IntelliJ IDEA.
  User: const
  Date: 2020/7/11
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>topic</title>
    <link href="${pageContext.request.contextPath}/view/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/view/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/view/css/topic.css" rel="stylesheet">
    <link href="" rel="stylesheet">
</head>
<body>
    <div class="container-fluid">
        <div class="row" id="top">
            <div class=""></div>
        </div>
        <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1 col-sm-10 col-sm-offset-1 col-xs-12" id="middle">
            <div id="meddiu_box" v-if="sites.qtid">
                <div class="row h2 ">
                    {{sites.qtid.qname}}
                </div>
                <div class="row h3 text-center">
                    {{sites.tname}}
                </div>
                <ul class="row">
                    <li v-for="question in sites.questions" class="list-inline h4" id="list_form">
                        <input type="radio" v-bind:value="question.qid" name="aanswer">{{question.choose}}
                    </li>
                </ul>
                <span id="one"></span>
            </div>
        </div>
    </div>



<script src=${pageContext.request.contextPath}/view/js/vue.js></script>
<script src=${pageContext.request.contextPath}/view/js/jquery-3.1.1.js></script>
</body>
<script>
    new Vue({
        el: '#one',
        data: {
            sites: []
        },
    })
    new Vue({
        el: '#meddiu_box',
        data: {
            sites: []
        },
        created: function () {
            var self = this;
            $.ajax({
                url: 'topic/'+${param.cid},
                type: 'get',
                data: {},
                dataType: 'json'
            }).then(function (res) {
                console.log(res)
                self.sites = res;
            }).fail(function () {
                console.log('失败');
            })
        }
    })

</script>
</html>
