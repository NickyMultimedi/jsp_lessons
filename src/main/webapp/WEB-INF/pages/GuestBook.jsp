<%--
  Created by IntelliJ IDEA.
  User: nicky
  Date: 2019-09-17
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Guest Book</title>
</head>
<body>
<h1>Guest Book</h1>
<c:forEach items="${ENTRIES}" var="entry" varStatus="stat">
    <p>
        ${entry.name} wrote on ${entry.date} :<br />
        ${entry.message}
    </p>
    <hr />
</c:forEach>
<form method="post">
    <input type="text" name="message" value="${message}" placeholder="Type a message to submit" /> <br />
    <input type="text" name="name" value="${name}" placeholder="Your name"><br />
    <input type="submit" value="Submit" name="submit">
</form>
</body>
</html>
