

<%@page import="com.apress.projs.store.Product"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 

HashMap products = (HashMap) application.getAttribute("products");
Iterator it = products.values().iterator();
out.println("<table>");
while(it.hasNext()){
    out.println("<tr>");
    Product product = (Product) it.next();
}

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <td>
        <a href='CartAction?add=true&id=<%=product.getId()%>'><%=product.getName()%></a>
    </td>
    
    <td>
        <%=product.getPrice()%>
    </td>
</tr>
<%]%>
</table>
</body>
</html>
