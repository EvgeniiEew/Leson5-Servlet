<%--
  Created by IntelliJ IDEA.
  User: Jack
  Date: 11.10.2020
  Time: 0:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>My super web-app!</title>
  </head>
  <body>
   <h1>name ${ko}  </h1>
   <p><%= request.getParameter("name") %></p> <%-- Получение данных из строки запроса--%>
  <h1> Random namber</h1>
  <%= Math.random()%>
  </body>
</html>
