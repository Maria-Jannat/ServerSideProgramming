<%-- 
    Document   : template_text
    Created on : Sep 21, 2020, 10:31:44 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@page import="com.aprss.projsp.ClendarBean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listing 1-2 JSSP Page 18</title>
    </head>
    <body>
        <jsp:useBean id="cal" class="com.appress.projsp.CanlendarBean" />
        <c:set var="hour" value="${cal.hour}" scope="request" />

        <c:choose>
            <c:when test="${hour > 0 && hour <=22}">
                Good Morning!
            </c:when>

            <c:when test="${hour >=12 && hour <=17}">
                Good Afternoon!
            </c:when>

            <c:otherwise>
                Good Evening!
            </c:otherwise>
        </c:choose>
    </body>
</html>
