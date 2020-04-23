<%-- 
    Document   : all
    Created on : Apr 22, 2020, 11:52:51 PM
    Author     : Aleksa
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sve katedre</title>
    </head>
    <body>
        <%@include file="../template/header.jsp" %>
        <%@include file="../template/menu.jsp" %>

        <table border="0">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Short Name</th>
                    <th>Name</th>
                    <th>Update</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="department" items="${applicationScope.departments}">
                    <tr>
                        <td>${department.id}</td>
                        <td>${department.shortName}</td>
                        <td>${department.name}</td>
                        <td><a href="/FISweb/appp/department/update?id=${department.id}">Update</a></td>
                        <td><a href="/FISweb/appp/department/delete?id=${department.id}">Delete</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <%@include file="../template/footer.jsp" %>
    </body>
</html>
