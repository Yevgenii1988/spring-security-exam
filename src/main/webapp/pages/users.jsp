<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
    <h2>Users</h2>
    <c:forEach items="${users}" var="user">
        Id: ${user.id}<br/>
        Username: ${user.username}<br/>
        Password: ${user.password}<br/>
        Amount: ${user.amount}<br/>
        <br/><br/>
    </c:forEach>
</body>
</html>
