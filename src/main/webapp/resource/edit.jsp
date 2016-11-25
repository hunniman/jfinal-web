<%--
  Created by IntelliJ IDEA.
  User: OPtilex
  Date: 2016/11/25
  Time: 20:33
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
</head>
<body>
    <form id="roleForm" class="form-horizontal">
        <input id="id" type="hidden" name="id" value="${role.id}">

        <div class="form-group">
            <label class="col-sm-2 control-label">角色名字</label>
            <div class="col-sm-10">
                <input class="form-control"  type="text" name="roleName" placeholder="请输入角色名字..." value="${role.roleName}">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">描述</label>
            <div class="col-sm-10">
                <input class="form-control"  type="text" name="description" placeholder="请输入描述..." value="${role.description}">
            </div>
        </div>


        <div class="form-group">
            <label class="col-sm-2 control-label">权限</label>
            <div class="col-sm-10">
                <input class="form-control"  type="text" name="permissionStr" placeholder="请输入权限..." value="${role.permissionStr}">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-10">
            </div>
            <div class="col-sm-2">
                <div style="text-align: right;">

                    <button id="btnBack" class="btn btn-primary ladda-button" data-style="expand-right" type="button">
                        <span class="ladda-label">返回列表</span>
                    </button>
                    <button id="btnReg" class="btn btn-primary ladda-button" data-style="expand-right" type="button">
                        <span class="ladda-label">提交</span>
                    </button>
                </div>
            </div>
        </div>
    </form>

</body>
</html>
