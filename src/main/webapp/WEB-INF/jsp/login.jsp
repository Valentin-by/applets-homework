<%--
  Created by IntelliJ IDEA.
  User: Valentin
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
    </head>
        <body>
            <form method="post" action="/login">
                <label>Username</label>
                <input type="text" name="username"></input>
                 <br>
                <label>Password</label>
                <input type="password" name="password"></input>
                <br>
                <input type="submit" value="Log in"></input>
            </form>
        </body>
</html>
