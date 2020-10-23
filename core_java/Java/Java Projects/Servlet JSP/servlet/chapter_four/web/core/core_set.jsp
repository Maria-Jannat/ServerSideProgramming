<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="browser" value="${header['User-Agent']}" scope="session"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Your Browser User Agent is : <c:out value="${browser}"/>
    </body>
</html>
