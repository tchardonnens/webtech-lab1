<%--
  Created by IntelliJ IDEA.
  User: thomas
  Date: 25/03/2023
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scriptlet</title>
</head>
<body>
<% out.println(new java.util.Date()); %>
<% out.println(request.getRemoteHost()); %>
</body>
</html>
