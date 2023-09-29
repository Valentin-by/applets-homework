<%@ page import="it.academy_class.home.model.entity.Book" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Valentin
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
  <body>
    <h2>Books list:</h2>
      <%
        List<Book> bkList = (List<Book>)request.getAttribute("bkList");
        for(Book book : bkList){
      %>
    <p><a href="/book?id=<%= book.getId()%>"> <%=book.getTitle()%> </a> - <%=book.getAuthor()%></p>
    <%
        }
    %>

    <form method="post" action="/logout">
      <p>
        <input type="submit" value="Log out"></input>
      </p>
    </form>

  </body>
</html>
