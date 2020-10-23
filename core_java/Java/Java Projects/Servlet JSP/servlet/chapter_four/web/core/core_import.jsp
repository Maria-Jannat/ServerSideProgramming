<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        The tag <code>&lt;pre&gt;&lt;c:import url="/xml/books.xml"/&gt;&lt;/pre&gt;</code> 
        causes the XML file named in the url attribute to be included in this 
        page. (Although the browser does not display the xml tags.)<p/>
        <pre><c:import url="/xml/books.xml"/></pre>
    </body>
</html>
