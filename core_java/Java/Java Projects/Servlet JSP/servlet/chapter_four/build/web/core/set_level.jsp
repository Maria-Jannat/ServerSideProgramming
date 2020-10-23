<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="level" value="Beginner" scope="session" />

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Your level is <c:out value="${level}" />
        <form action="core_remove.jsp" method="post">
            <input type="submit" name="beginner" value="Stay as Beginner"/>
            <input type="submit" name="expert" value="Change to Expert"/>
        </form>
    </body>
</html>
