<%-- 
    Document   : editnote
    Created on : Jun 6, 2021, 10:19:25 PM
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
        <h2>Edit Note</h2>
        <br>
        <form method="post" action="note">
        <label>Title:</label>
            <input type="text" name="title" value="${Note.title}" id="title"> 
            <br>
             <label>Contents:</label>
             <textarea name="content" value="${Note.content}" id="content"> </textarea>
             <br>
             <input type="submit" value="Save">
            
        </form>
    </body>
</html>
