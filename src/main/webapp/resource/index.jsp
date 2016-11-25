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
    <script src="<%request.getContextPath();%>/resources/pagejs/utils.js"></script>
    <script src="<%request.getContextPath();%>/resources/pagejs/resources.js"></script>
</head>
<body>
<!-- 内容部分-->
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <jsp:include page="../common/leftmenu.jsp"></jsp:include>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">后台授权url</h1>
                <div class="form-group">
                    <div class="col-sm-2">
                        <input id="searchFile" class="form-control" type="text" name="searchFile" placeholder="请输入url...">
                    </div>

                    <div class="col-sm-5">
                        <button id="btnSearch" class="btn btn-primary ladda-button" data-style="expand-right" type="button">
                            <span class="ladda-label">搜索</span>
                        </button>
                    </div>
                </div>
            <div id="content" class="highlight">
                <!--table 内容 -->
            </div>
            <div class="row placeholders">
                <script id="test" type="text/html">
                    <%-- <h1>{{data.totalRow}}</h1>--%>
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
                            <th width="100px;">操作</th>
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
                            <td><a href="#">修改</a>&nbsp;<a href="#">删除</a></td>
                        </tr>
                        {{/each}}
                        </tbody>
                    </table>
                </script>
                <ul class="pagination pull-right">

                </ul>
            </div>
        </div>
    </div>
<!-- 内容部分结束-->
</body>
</html>
