<%-- 
    Document   : new
    Created on : Apr 22, 2020, 11:53:02 PM
    Author     : Aleksa
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nova katedra</title>
    </head>
    <body>
        <%@include file="../template/header.jsp" %>
        <%@include file="../template/menu.jsp" %>
        
        <form action="/FISweb/appp/department/newDepartment" method="POST">
            ID:
            <div>
                <input type="text" id="id" name="id" />
            </div>
            <p/>
            Short name:
            <div>
                <input type="text" id="short name" name="short name"/>
            </div>
            <p/>
            Name:
            <div>
                <input type="text" id="name" name="name"/>
            </div>
            <p/>
            <input type="submit" id="NewDepartment" value="Submit"/>
        </form>
        
        <%@include file="../template/footer.jsp" %>
    </body>
</html>
