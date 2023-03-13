<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Who are you?" %>
</h1>
<br/>
<form method="post" action="login">
    <label for="firstname">First name</label>
    <input type="text" id="first_name" name="first_name" value="Your first name"/>
    <br/>
    <label for="lastname">Last name</label>
    <input type="text" id="last_name" name="last_name" value="Your last name"/>
    <br/>
    <label for="birthdate">Birth date</label>
    <input type="date" id="birth_date" name="birth_date" value="Your birth date"/>
    <br/>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>