<%--
  Created by IntelliJ IDEA.
  User: OPtilex
  Date: 2016/11/2
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="../common/css.jsp"></jsp:include>
    <jsp:include page="../common/js.jsp"></jsp:include>
    <jsp:include page="../common/loading.jsp"></jsp:include>
    <jsp:include page="../common/validator.jsp"></jsp:include>

    <link rel="stylesheet" href="<%request.getContextPath();%>/resources/css/dashboard.css"/>

    <script src="<%request.getContextPath();%>/resources/pagejs/utils.js"></script>
    <script src="<%request.getContextPath();%>/resources/pagejs/resources.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">Dashboard</a></li>
                <li><a href="#">Settings</a></li>
                <li><a href="#">Profile</a></li>
                <li><a href="#">Help</a></li>
            </ul>
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="Search...">
            </form>
        </div>
    </div>
</nav>

<!-- 内容部分-->
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <jsp:include page="../common/leftmenu.jsp"></jsp:include>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">Dashboard</h1>

            <div id="content"></div>

            <div class="row placeholders">
                <script id="test" type="text/html">
                    <h1>{{data.totalRow}}</h1>
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th>resource_id</th>
                                <th>resource_name</th>
                                <th>resource_type</th>
                                <th>resource_string</th>
                                <th>resource_desc</th>
                                <th>enabled</th>
                                <th>resource_method</th>
                                <th>操作</th>
                            </tr>
                        </thead>
                        <tbody>
                            {{each data.list as value i}}
                                <tr>
                                      <td>{{value.resource_string}}</td>
                                      <td>{{value.resource_name}}</td>
                                      <td>{{value.resource_type}}</td>
                                      <td>{{value.resource_string}}</td>
                                      <td>{{value.resource_desc}}</td>
                                      <td>{{value.enabled}}</td>
                                      <td>{{value.resource_method}}</td>
                                      <td><a href="#">修改</a>&nbsp;<a href="#">删除</a> </td>
                                </tr>
                            {{/each}}
                        </tbody>
                    </table>
                    <ul class="pagination pull-right">
                        <%--<li class="disabled"><a href="javascript:void(0);"> &laquo;</a></li>
                            {{each data.totalRow as h j}}
                                <li><a href="javascript:void(0);">j</a></li>
                                <li><a href="javascript:void(0);"> 2</a></li>
                                <li><a href="javascript:void(0);">3</a></li>
                            {{/each}}
                        <li><a href="javascript:void(0);"> &raquo;</a></li>--%>
                    </ul>
                </script>
            </div>
        </div>
    </div>
</div>
<!-- 内容部分结束-->
</body>
</html>
