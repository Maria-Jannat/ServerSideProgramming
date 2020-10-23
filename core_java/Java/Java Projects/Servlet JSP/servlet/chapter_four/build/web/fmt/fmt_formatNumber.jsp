<%--<%@page contentType="text/html;charset=ISO-8859-15" %>--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3 style="color: green;">Number Formatting Example</h3>
        Formatting <b>123.4</b> becomes :
        <fmt:formatNumber value="123.4" type="number"
                          minFractionDigits="3"/><br>
        
        <h3 style="color: azure;"> Formatting Example</h3>
    </body>
</html>
