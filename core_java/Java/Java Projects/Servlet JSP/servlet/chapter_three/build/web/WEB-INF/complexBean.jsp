<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body, td {font-family: verdana; font-size: 10pt;}
        </style>
    </head>
    <body>
        <h1>EL and Complex JavaBeans</h1>
        <table border="1">
            <tr>
                <td>${person.name}</td>
                <td>${person.age}</td>
                <td>${person["address"].line1}</td>
                <td>${person["address"].town}</td>
                <td>${person.address.phoneNumber[0].std}
                    ${person.address.phoneNumber[0].number}</td>
                <td>${person.address.phoneNumber[1].std}
                    ${person.address.phoneNumber[1].number}</td>
            </tr>
        </table>
    </body>
</html>
Simple