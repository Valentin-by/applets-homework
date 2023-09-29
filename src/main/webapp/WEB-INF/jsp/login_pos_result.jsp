<%@ page import="it.academy_class.home.model.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Valentin
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <%
            User user = (User)request.getSession().getAttribute("user");
        %>
        <text>Hello  <%=user.getLogin()%> !</text>
        <br>
        <a href="/books">Go to the books list</a>
        <form method="post" action="/logout">
            <p><input type="submit" value="Log out"></input></p>
        </form>
    </body>
</html>
