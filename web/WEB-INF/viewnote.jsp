<%-- 
    Document   : viewnote
    Created on : Jun 6, 2021, 10:19:43 PM
    Author     : 816386
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <br>
        <h2>View Note</h2>
        <br>
        <p> Title: ${note.title}</p>
        <br>
        <p> Contents: ${note.content}</p>
        <br>
        <a href="note?editnote.jsp">Edit</a>

    </body>
</html>
