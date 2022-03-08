<%--
  Created by IntelliJ IDEA.
  User: jihyun
  Date: 2022-03-08
  Time: 오후 5:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" import="java.util.*"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>에러 페이지 입니다~~~~~!!!!</h1>

    <h3> <c:out value="${exception.getMessage()}"></c:out> </h3>
    <hr>
    <ul>
        <c:forEach items="${exception.getStackTrace()}" var="stack">
            <li><c:out value="${stack}"> </c:out> </li>
        </c:forEach>
    </ul>
</body>
</html>
