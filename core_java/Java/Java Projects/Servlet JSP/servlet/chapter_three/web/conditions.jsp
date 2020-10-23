
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL Conditions</title>

        <style>
            body, td {font-family: verdana; font-size: 10pt;}
        </style>

    </head>
    <body>
        <h1>EL Conditions</h1>
        <table border="1">
            <tr>
                <td><b>Concept</b></td>
                <td><b>Condition</b></td>
                <td><b>Result</b></td>
            </tr>

            <tr>
                <td>Numeric less than</td>
                <td>${'${'}1 &lt; 2}</td>
                <td>${1 < 2}</td>
            </tr>

            <tr>
                <td>Numeric greater than</td>
                <td>${'${'}1 &gt; 2}</td>
                <td>${1 > 2}</td>
            </tr>

            <tr>
                <td>Numeric less than</td>
                <td>${'${'}1 lt 2}</td>
                <td>${1 lt 2}</td>
            </tr>

            <tr>
                <td>Numeric greater than</td>
                <td>${'${'}1 gt 2}</td>
                <td>${1 gt 2}</td>
            </tr>

            <tr>
                <td>Numeric greater than or equal</td>
                <td>${'${'}1 &gt;= 1}</td>
                <td>${1 >= 1}</td>
            </tr>

            <tr>
                <td>Numeric less than or equal</td>
                <td>${'${'}1 &lt;= 1}</td>
                <td>${1 <= 1}</td>
            </tr>

            <tr>
                <td>Numeric less than or equal</td>
                <td>${'${'}1 le 1}</td>
                <td>${1 le 1}</td>
            </tr>

            <tr>
                <td>Numeric greater than or equal</td>
                <td>${'${'}1 ge 1}</td>
                <td>${1 ge 1}</td>
            </tr>

            <tr>
                <td>Numeric equal to</td>
                <td>${'${'}1 == 1}</td>
                <td>${1 == 1}</td>
            </tr>

            <tr>
                <td>Numeric equal to</td>
                <td>${'${'}1 eq 1}</td>
                <td>${1 eq 1}</td>
            </tr>

            <tr>
                <td>Numeric not equal to</td>
                <td>${'${'}1 != 2}</td>
                <td>${1 != 2}</td>
            </tr>

            <tr>
                <td>Numeric not equal to</td>
                <td>${'${'}1 ne 2}</td>
                <td>${1 ne 2}</td>
            </tr>

            <tr>
                <td>Alphabetic less than</td>
                <td>${'${'}'abc' &lt; 'ade'}</td>
                <td>${'abc' < 'ade'}</td>
            </tr>

            <tr>
                <td>Alphabetic greater than</td>
                <td>${'${'}'abc' &gt; 'ade'}</td>
                <td>${'abc' > 'ade'}</td>
            </tr>

            <tr>
                <td>Alphabetic equal to</td>
                <td>${'${'}'abc' eq 'ade'}</td>
                <td>${'abc' eq 'ade'}</td>
            </tr>

            <tr>
                <td>Alphabetic not equal to</td>
                <td>${'${'}'abc' ne 'ade'}</td>
                <td>${'abc' ne 'ade'}</td>
            </tr>
        </table>
    </body>
</html>
