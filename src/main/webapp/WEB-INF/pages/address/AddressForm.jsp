<%--
  Created by IntelliJ IDEA.
  User: nicky
  Date: 2019-09-13
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Address</title>
</head>
<body>
    <h1>New Address</h1>
    <form action="Address" method="post">
        <input type="text" name="naam" placeholder="Geef uw naam in aub"><br />
        <input type="text" name="achternaam" placeholder="Geef uw achternaam in aub"><br />
        <input type="text" name="straat" placeholder="Geef uw straat in aub"><br />
        <input type="number" name="huisnummer" placeholder="Geef uw huisnummer in aub"><br />
        <input type="text" name="postcode" placeholder="Geef uw postcode in aub"><br />
        <input type="text" name="gemeente" placeholder="Geef uw gemeente in aub"><br />
        <input type="text" name="land" placeholder="Geef uw land in aub"><br />
        <input type="text" name="telefoon" placeholder="Geef uw telefoon nummer in aub"><br />
        <input type="email" name="email" placeholder="Geef uw e-mail in aub"><br />
        <input type="submit" value="Submit" name="submit">
    </form>
</body>
</html>
