<%--
  Created by IntelliJ IDEA.
  User: chun
  Date: 2017/3/25
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Welcome to Spittr</h1>
    <a href="<c:url value="/spittles" />">spittles</a>
    <a href="<c:url value="/spitter/register" /> "> Register</a>
</body>
</html>
