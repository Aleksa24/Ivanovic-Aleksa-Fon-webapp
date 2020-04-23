<%-- 
    Document   : update
    Created on : Apr 23, 2020, 3:08:20 AM
    Author     : Aleksa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>update department</title>
    </head>
    <body>
        <%@include file="../template/header.jsp" %>
        <%@include file="../template/menu.jsp" %>
        
        <form action="/FISweb/appp/department/updateDepartment" method="POST">
            ID:
            <div>
                <input type="text" id="id" name="id" value="${requestScope.updateDepartment.id}"/>
            </div>
            <p/>
            Short name:
            <div>
                <input type="text" id="short name" name="short name" value="${requestScope.updateDepartment.shortName}" />
            </div>
            <p/>
            Name:
            <div>
                <input type="text" id="name" name="name" value="${requestScope.updateDepartment.name}"/>
            </div>
            <p/>
            <input type="submit" id="NewDepartment" value="Submit"/>
        </form>
        
        <%@include file="../template/footer.jsp" %>
    </body>
</html>
