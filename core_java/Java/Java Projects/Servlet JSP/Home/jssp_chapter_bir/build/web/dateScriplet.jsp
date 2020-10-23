<%-- 
    Document   : dateScriplet
    Created on : Sep 22, 2020, 8:54:31 AM
    Author     : HP
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listing 1-4 Professional JSP Page 36</title>
    </head>
    <body style="font-family: verdana; font-size: 10pt;">
        <h1>Hello Guzelim!</h1>
        <%
            DateFormat df = DateFormat.getDateInstance();
            Date today = new Date();
        %>

        <h2>Today's date is <%= df.format(today) %></h2>
    </body>
</html>
