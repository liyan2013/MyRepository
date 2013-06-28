<%--
  Created by IntelliJ IDEA.
  User: liyanwang
  Date: 6/26/13
  Time: 5:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Get Student</title>
</head>
<body>
<p><h1>Get Student</h1></p>

<s:form action="get">
    <s:textfield name="id" label="Id"/>
    <s:submit value="Get"/>
</s:form>

</body>
</html>