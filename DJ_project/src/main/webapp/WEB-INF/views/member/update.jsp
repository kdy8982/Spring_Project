<%--
  Created by IntelliJ IDEA.
  User: starblood
  Date: 13. 8. 11.
  Time: 오후 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title></title>
</head>
<body>
<a href="<c:url value='/member/list'/>">List</a>
<form:form commandName="member" action="/member/update" method="POST">
    <p>
        <label>이름</label>
        <form:input path="name" size="50"/>
        <form:errors path="name"/>
    </p>
    <input type="submit" value="저장"/>
</form:form>
</body>
</html>