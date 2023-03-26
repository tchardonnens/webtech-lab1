<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>You are born before 1990</title>
</head>
<body>
<jsp:useBean id="person" type="com.example.lab1.mvc.model.Person" scope="request"/>
<h1>YOU ARE YOUNG</h1>
<p>First name: <jsp:getProperty name="person" property="firstName"/></p>
<p>Last name: <jsp:getProperty name="person" property="lastName"/></p>
<p>Birth day: <jsp:getProperty name="person" property="birthDay"/></p>
<p>Sex: <jsp:getProperty name="person" property="sex"/></p>
</body>
</html>
