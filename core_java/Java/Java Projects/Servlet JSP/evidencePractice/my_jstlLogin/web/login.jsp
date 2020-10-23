<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h2>Please Login</h2>
        <form action="loginAuthentication.jsp">
            Username: <input type="text" name="username" />
            Password: <input type="password" name="password" />
            <input type="submit" value="Login"/>
        </form>

        <font color="red">
        <c:if test="${not empty param.errMsg}">
            <c:out value="${param.errMsg}"/>
        </c:if>
        </font>

    </body>
</html>
