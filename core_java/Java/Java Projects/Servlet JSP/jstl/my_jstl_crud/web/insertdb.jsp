<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${empty param.pname or empty param.qty}">
            <c:redirect url="insert.jsp" >
                <c:param name="errMsg" value="Please enter product name and quantity"/>
            </c:redirect>
        </c:if>
        
        <sql:setDataSource var="dbsource" driver="com.mysql.cj.jdbc.Driver"
                           url="jdbc:mysql://localhost/jstlcrud"
                           user="root" password="1234"/>
        
        <sql:update dataSource="${dbsource}" var="result">
            INSERT INTO product(pname, quantity) VALUES (?, ?);
            <sql:param value="${param.pname}"/>
            <sql:param value="${param.qty}"/>
        </sql:update>
            <c:if test="${result>=1}">
                <font size="5" color="green">Congrats! Data inserted
                </font>
                <c:redirect url="insert.jsp">
                    <c:param name="susMsg" value="Congrats! Data inserted"/>
                </c:redirect>
            </c:if>
    </body>
</html>
