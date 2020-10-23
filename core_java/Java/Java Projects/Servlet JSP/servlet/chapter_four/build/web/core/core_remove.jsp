<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${param.expert != null}">
    <c:remove var="level" scope="session" /> 
</c:if>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Your level is <c:out value="${level}" default="Expert"/>
        <c:choose>
            <c:when test="${level != null}">
                <p>Here are the things you need to do.....</p>
            </c:when>
            <c:otherwise>
                <p>You are the expert, you figure it out...</p>
            </c:otherwise>
        </c:choose>
    </body>
</html>


