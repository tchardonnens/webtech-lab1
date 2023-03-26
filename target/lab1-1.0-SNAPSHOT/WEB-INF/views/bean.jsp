<%@ page import="com.example.lab1.bean.Person" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bean</title>
</head>
<body>
    <%
        Person person = new Person();
        person.setFirstName(request.getParameter("first_name"));
        person.setLastName(request.getParameter("last_name"));
        person.setBirthDay(request.getParameter("birth_date"));
        person.setSex(request.getParameter("gender"));

        out.println("First name: " + person.getFirstName() + "<br>");
        out.println("Last name: " + person.getLastName() + "<br>");
        out.println("Birth date: " + person.getBirthDay() + "<br>");
        out.println("Gender: " + person.getSex() + "<br>");
    %>
</body>
</html>
