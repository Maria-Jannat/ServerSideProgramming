<%-- 
    Document   : templateText
    Created on : Sep 27, 2020, 4:41:43 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                
        <style>
            body, td {font-family: verdana; font-size: 10pt;}
        </style>
    </head>
    <body>
        <h2>El and Template Text</h2>
        <table border="1">
            <tr>
                <td colspan="2">Hello ${param['name']}</td>
            </tr>
            <tr>
            <form action="tempalteText.jsp" method="post">
                <td><input type="text" name="name"></td>
                <td><input type="submit"></td>
            </form>
            </tr>
        </table>
    </body>
</html>
