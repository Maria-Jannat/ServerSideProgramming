<%-- 
    Document   : newjsp
    Created on : Sep 21, 2020, 10:53:08 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSSP Page 20</title>
    </head>
    <body>
        <!--        <h1>Hello World!</h1>-->

        <%
            User user = (User) request.getAttribute("User");
            if (user != null) {
        %>
        Welcome, you have been successful to run this page!
        <%
            }
        %>
    </body>
</html>
