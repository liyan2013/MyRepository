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
    <title>Post Student</title>
</head>
<body>
<p><h1>Post Student</h1></p>

<s:form action="post">
    <s:textfield name="stuName" label="Name"/>
    <s:textfield name="age" label="Age"/>
    <s:submit value="Post"/>
</s:form>

</body>
</html>