<%-- 
    Document   : all
    Created on : Mar 31, 2020, 9:10:09 PM
    Author     : Dusan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User: add</title>
    </head>
    <body>
        <%@include file="../template/header.jsp" %>
        <%@include file="../template/menu.jsp" %>
        
        <h1>This is page add.jsp for user!</h1>
        <form action="/njt/app/user/save" method="POST">
            ${message}
            <table>
                <tbody>
                    <tr>
                        <td>Firstname:</td>
                        <td><input type="text" name="firstname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Lastname:</td>
                        <td><input type="text" name="lastname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" name="username" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="password" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Save"/></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>

        </form>
        
        <%@include file="../template/footer.jsp" %>
    </body>
</html>
