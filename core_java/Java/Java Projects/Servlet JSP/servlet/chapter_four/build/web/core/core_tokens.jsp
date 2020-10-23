<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="queryResult" value="Dan,Jepp,Male,26,Java Developer,London"
       scope="request"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Sex</th>
                <th>Age</th>
                <th>Occupation</th>
                <th>Location</th>
            </tr>

            <tr>
                <c:forTokens items="${queryResult}" delims="," var="token">
                    <td><c:out value="${token}"/></td>
                </c:forTokens>
            </tr>
        </table>
    </body>
</html>
