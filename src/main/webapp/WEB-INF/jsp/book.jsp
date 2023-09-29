<%@ page import="it.academy_class.home.model.entity.Book" %><%--
  Created by IntelliJ IDEA.
  User: Valentin
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Book</title>
<%--        <style>--%>
<%--            body {background-image: url('/pictures/education_library.jpg');--%>
<%--                background-size: cover;--%>
<%--                /*height: 650px;*/--%>
<%--            }--%>
<%--        </style>--%>
    </head>
        <body>
            <%
                String id = request.getParameter("id");
                Book book = (Book)request.getAttribute("book");
                if(book != null){
            %>
            <p>
                Book with id = <%=id%>: Title -
                <%=book.getTitle()%>, author - <%=book.getAuthor()%>
                </p>
            <%
                } else {
            %>
                <p>Book with id = <%=id%> not found.</p>
            <%
                }
            %>
            <p><a href="/books">Back to the books list</a></p>
            <form method="post" action="/logout">
                <p><input type="submit" value="Log out"></input></p>
            </form>
        </body>
</html>
