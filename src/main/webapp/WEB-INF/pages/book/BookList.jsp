<%--
  Created by IntelliJ IDEA.
  User: nicky
  Date: 2019-09-17
  Time: 09:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>
<h1>Book List</h1>
<table>
    <c:forEach items="${BOOKS}" var="book" varStatus="status">
        <tr>
            <td>${status.index}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>
                <a href="BookList?ISBN=${book.isbn}">Show Details</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
