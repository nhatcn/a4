<%-- 
    Document   : ShowInfo
    Created on : Sep 13, 2023, 8:46:45 AM
    Author     : NGMINHAT
--%>
<%@taglib  uri="/WEB-INF/newtag_library.tld" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
            table,tr th,td{
                text-align: center;
                border: 1px solid black;
                border-collapse: collapse;
                padding: 4px;
            }
            table{
                margin: 0 auto;
            }
            h1{
                text-align: center;
            }
            <c:NewTagHandler/>
        </style>
    <body>
        <h1>Your information</h1>
        <table>
            <tr>
                <th>Name</th>
                <th>Day of Birth</th>
                <th>Phone</th>
            </tr>
            <tr>
                <td><%=request.getParameter("name")%></td>
                <td><%=request.getParameter("birth")%></td>
                <td><%=request.getParameter("phone")%></td>
            </tr>
        </table>
    </body>
</html>
