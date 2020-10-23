<%-- 
    Document   : dateBean_getProperty
    Created on : Sep 22, 2020, 9:22:03 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listing 1-11 Professional JSP 2.1 Page 39</title>
    </head>

    <body style="font-family: verdana; font-size: 10pt;">
        <jsp:useBean id="date"
                     class="com.apress.projs.DateFormatBean" />
        <h1>Today's date is <jsp:getProperty name="date"
                         property="date"/></h1>
        <p>Gercektan mi?</p>
    </body>
</html>
