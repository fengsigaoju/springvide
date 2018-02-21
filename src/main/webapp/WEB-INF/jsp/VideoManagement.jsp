<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  Date: 2018/2/16
  Time: 下午3:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>视频管理系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/bootstrap-theme.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/bootstrap-notify.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="">视频管理系统</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="/location?id=1&page=1">大陆电影</a></li>
                <li><a href="/location?id=2&page=1">港台电影</a></li>
                <li><a href="/location?id=3&page=1">美国电影</a></li>
                <li><a href="/location?id=4&page=1">英国电影</a></li>
                <li><a href="/location?id=5&page=1">日本电影</a></li>
                <li><a href="/location?id=6&page=1">泰国电影</a></li>
                <li><a href="/location?id=7&page=1">其他</a></li>
            </ul>
        </div>
        <div class="pull-right">
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" name="studentId" class="form-control" placeholder="请输入电影或者演员名字">
                </div>
                <button type="submit" class="btn btn-default">搜索</button>
            </form>
        </div>
    </div>
</nav>
<!--时间导航栏-->
<%
    Calendar now = Calendar.getInstance();
    int year = now.get(Calendar.YEAR);
    int month = now.get(Calendar.MONTH) + 1;
    int day = now.get(Calendar.DAY_OF_MONTH);
%>
<ol class="breadcrumb">
    <li><%=year%>
    </li>
    <li><%=month%>
    </li>
    <li class="active"><%=day%>
    </li>
</ol>
</div>
</body>
</html>
