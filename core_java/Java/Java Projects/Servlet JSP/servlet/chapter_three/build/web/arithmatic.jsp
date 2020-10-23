
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic</title>

        <style>
            body, td {font-family: verdana; font-size: 10pt;}
        </style>

    </head>
    <body>
        <h2>EL Arithmetic</h2>
        <table border="1">
            <tr>
                <td><b>Concept</b></td>
                <td><b>EL Expression</b></td>
                <td><b>Result</b></td>
            </tr>

            <tr>
                <td>Literal</td>
                <td>${'${'}10}</td>
                <td>${10}</td>
            </tr>

            <tr>
                <td>Addition</td>
                <td>${'${'}10+10}</td>
                <td>${10+10}</td>
            </tr>

            <tr>
                <td>Subtraction</td>
                <td>${'${'}10-10}</td>
                <td>${10-10}</td>
            </tr>

            <tr>
                <td>Multiplication</td>
                <td>${'${'}10*10}</td>
                <td>${10*10}</td>
            </tr>

            <tr>
                <td>Division / </td>
                <td>${'${'}10/3}</td>
                <td>${10/3}</td>
            </tr>

            <tr>
                <td>Division DIV</td>
                <td>${'${'}10 div 3}</td>
                <td>${10 div 3}</td>
            </tr>

            <tr>
                <td>Modulus</td>
                <td>${'${'}10 % 3}</td>
                <td>${10 % 3}</td>
            </tr>

            <tr>
                <td>Modulus</td>
                <td>${'${'}10 mod 3}</td>
                <td>${10 mod 3}</td>
            </tr>

            <tr>
                <td>Precedence</td>
                <td>${'${'}2 * 5 mod 3}</td>
                <td>${2 * 5 mod 3}</td>
            </tr>

            <tr>
                <td>Precedence With parens</td>
                <td>${'${'}2 * (5 mod 3)}</td>
                <td>${2 * (5 mod 3)}</td>
            </tr>   

            <tr>
                <td>Division by Zero </td>
                <td>${'${'}10 / 0}</td>
                <td>${10 / 0}</td>
            </tr>

            <tr>
                <td>Exponential</td>
                <td>${'${'}2E2}</td>
                <td>${2E2}</td>
            </tr>   

            <tr>
                <td>Unary Minus</td>
                <td>${'${'}-10}</td>
                <td>${-10}</td>
            </tr>
        </table>
    </body>
</html>
