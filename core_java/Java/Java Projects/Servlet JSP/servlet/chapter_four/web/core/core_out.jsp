<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:useBean id="book" class="com.apress.projs.Book">
    <jsp:setProperty name="book" property="title" value="Pro JSP 2, latest Edition"/>
    <jsp:setProperty name="book" property="author" value="Brown et al."/>
    <jsp:setProperty name="book" property="isbn" value="1-2f3345"/>
    <jsp:setProperty name="book" property="url" value="http://www.apress.com/book/bookDisplay.html?bID=464"/>   
</jsp:useBean>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>The latest offering from Apress is <i><c:out value="${book.title}"/></i></h1>
        Author: <c:out value="${book.author}"/><br>
        ISBN: <c:out value="${book.isbn}"/><br>
        URL: <a href="<c:out value="${book.url}"/>"><c:out value="${book.author}"/></a>
    </body>
</html>
