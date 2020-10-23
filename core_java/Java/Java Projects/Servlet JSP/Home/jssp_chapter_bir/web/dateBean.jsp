<%-- 
    Document   : DateFormatBean
    Created on : Sep 22, 2020, 9:04:22 AM
    Author     : HP
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listing 1-4 Professional JSP 2.1 Page 38</title>
    </head>
    
    <body style="font-family: verdana; font-size: 10pt;">
        <jsp:useBean id="date" class="com.apress.projs.DateFormatBean" />
        
        <h1>Today's Date is <%= date.getDate()%></h1>
        
    </body>
</html>
