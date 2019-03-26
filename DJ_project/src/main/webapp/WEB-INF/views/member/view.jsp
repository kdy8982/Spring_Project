<%--
  Created by IntelliJ IDEA.
  User: starblood
  Date: 13. 8. 11.
  Time: 오후 10:45
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
${member.id} | ${member.name} | ${member.joined} |
<a href="/member/update/${member.id}">Update</a> |
<a href="/member/delete/${member.id}">Delete</a>

</body>
</html>