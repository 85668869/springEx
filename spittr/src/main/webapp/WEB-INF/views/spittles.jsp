<%--
  Created by IntelliJ IDEA.
  User: chun
  Date: 2017/3/25
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Recent Spittles</h1>
    <c:forEach items="${spittleList}" var="spittle">
        <li id="spittle_<c:out value="spittle.id" /> ">
            <div>
                <c:out value="${spittle.message}"/>
            </div>
            <div>
                <span><c:out value="${spittle.time}"/></span>
                <span>(<c:out value="${spittle.latiude}"/>,<c:out value="${spittle.longitude}"/>)</span>
            </div>
        </li>
    </c:forEach>
</body>
</html>
