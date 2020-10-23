<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.apress.projs.CalendarBean"%>
<jsp:useBean id="cal" class="com.apress.projs.CalendarBean"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        The time is currently : <br><br>
        <c:out value="${cal.time}"/><br><br>

        <c:set var="hour" value="${cal.hour}" scope="request" />

        <b>
            <c:choose>
                <c:when test="${hour >= 0 && hour <=11}">Good Morning!</c:when>

                <c:when test="${hour >= 12 && hour <=17}">Good Afternoon!</c:when>

                <c:otherwise>Good Evening!</c:otherwise>
            </c:choose>
        </b>
    </body>
</html>
