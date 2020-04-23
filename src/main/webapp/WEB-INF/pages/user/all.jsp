<%-- 
    Document   : all
    Created on : Mar 31, 2020, 9:10:09 PM
    Author     : Dusan
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User: all</title>
    </head>
    <body>
        <%@include file="../template/header.jsp" %>
        <%@include file="../template/menu.jsp" %>
        <h1>This is page all.jsp for user!</h1>
        <table>
            <thead>
                <tr>
                    <th>Firstname</th>
                    <th>Lastname</th>
                    <th>Username</th>
                    <th>Delete</th>
                    <th>Edit</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="user" items="${applicationScope.users}">
                    <tr>
                        <td>${user.firstname}</td>
                        <td>${user.lastname}</td>
                        <td>${user.username}</td>
                        <td>
                            <a href="#">Delete</a>
                        </td>
                        <td>
                             <a href="#">Edit</a>
                        </td>
                    </tr>
                </c:forEach>

            </tbody>
        </table>



        <%@include file="../template/footer.jsp" %>
    </body>
</html>
