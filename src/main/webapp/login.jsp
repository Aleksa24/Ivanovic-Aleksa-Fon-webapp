<%-- 
    Document   : login.jsp
    Created on : Mar 31, 2020, 8:21:45 PM
    Author     : Dusan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    
    <body>
        <h1>This is login page!</h1>
        ${message}
        <form action="/FISweb/appp/login" method="post">
            Email:
            <div>
                <input type="text" id="email" name="email"/>
            </div>
            <p/>
            Password:
            <div>
                <input type="password" id="password" name="password"/>
            </div>
            <p/>
            <input type="submit" id="Login" value="Log in"/>
        </form>
    </body>
</html>
