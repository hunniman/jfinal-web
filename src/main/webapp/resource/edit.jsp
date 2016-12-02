<%--
  Created by IntelliJ IDEA.
  User: OPtilex
  Date: 2016/11/25
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
    <script src="<%request.getContextPath();%>/resources/pagejs/resourcesEdit.js"></script>
</head>
<body>
    <h1 class="page-header">后台授权url编辑</h1>
    <form id="roleForm" class="form-horizontal">
        <input id="id" type="hidden" name="resource_id" value="${resource.get("resource_id")}">
        <div class="form-group">
            <label class="col-sm-2 control-label">resource_name</label>
            <div class="col-sm-10">
                <input class="form-control"  type="text" name="resource_name" placeholder="请输入resource_name..." value="${resource.get("resource_name")}">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">resource_type</label>
            <div class="col-sm-10">
                <input class="form-control"  type="text" name="resource_type" placeholder="请输入resource_type..." value="${resource.get("resource_type")}">
            </div>
        </div>


        <div class="form-group">
            <label class="col-sm-2 control-label">resource_string</label>
            <div class="col-sm-10">
                <input class="form-control"  type="text" name="resource_string" placeholder="请输入resource_string..." value="${resource.get("resource_string")}">
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">resource_desc</label>
            <div class="col-sm-10">
                <input class="form-control"  type="text" name="resource_desc" placeholder="请输入resource_desc..." value="${resource.get("resource_desc")}">
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">enabled</label>
            <div class="col-sm-10">
                <div class="checkbox">
                    <label >
                        <input type="checkbox"  name="enabled" <c:if test="${resource.get('enabled')==1}"> checked="checked"</c:if> />
                    </label>
                </div>

              <%--  <input class="form-control"  type="text" name="enabled" placeholder="请输入resource_desc..." value="${resource.get("enabled")}">--%>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">resource_method</label>
            <div class="col-sm-10">
                <input class="form-control"  type="text" name="resource_method" placeholder="请输入resource_method..." value="${resource.get("resource_method")}">
            </div>
        </div>


        <div class="form-group">
            <div class="col-sm-8">
            </div>
            <div class="col-sm-4">
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
