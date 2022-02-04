<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
            <p>
                <label for="userName">Username: </label>
                <input type="text" name="userName" id="userName">
            </p>
            <p>
                <label for="password">Password: </label>
                <input type="password" name="password" id="password">
            </p>
            
            <button type="submit">Log in</button>
        </form>
        
    </body>
</html>
