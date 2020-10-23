<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.apress.projs.CalendarBean" %>
<jsp:useBean id="cal" class="com.apress.projs.CalendarBean" />

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        The current time is : <br><br>
        <c:out value="${cal.time}"/>

        <c:set var="hour" value="${cal.hour}" scope="request" />

        <b>
            <c:if test="${hour > 0 && hour <=11}">Good Morning!</c:if>

            <c:if test="${hour >= 12 && hour <=17}">Good Afternoon!</c:if>

            <c:if test="${hour >= 18 && hour <=23}">Good Evening!</c:if>
        </b>
    </body>
</html>
