<%--
  Created by IntelliJ IDEA.
  User: nicky
  Date: 2019-09-16
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BMI</title>
</head>
<body>
<h1>Body Mass Index</h1>
<form method="post">
    <input name="weight" value="${bmiObject.weight}" placeholder="Weight in kg" type="text" />
    <input name="height" value="${bmiObject.height}" placeholder="Height in m" type="text" />
    <input name="submit" value="Submit" type="submit" />
</form>

<div style="color: ${bmiObject.bmiValue>25?"red":"green"}">
    Your BMI is ${bmiObject.bmiValue} kg/m<sup>2</sup>
</div>
</body>
</html>
