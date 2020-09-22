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
        <title>Listing 1-12 Professional JSP 2.1 Page 40</title>
    </head>

    <body style="font-family:verdana;font-size:10pt;">
        <jsp:useBean id="date" class="com.apress.projs.DateFormatBean">
            <jsp:setProperty name="date" property="format"
                             value="EEE, d MMM yyyy HH:mm:ss z"/>
        </jsp:useBean>
        <h2>Today's Date is <jsp:getProperty name="date" property="date"/></h2>
    </body>
</html>
