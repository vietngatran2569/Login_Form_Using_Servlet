<%--
  Created by IntelliJ IDEA.
  User: vietngatran
  Date: 04/11/2019
  Time: 09:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login Form</title>
  </head>
  <body>
 <form method="get" action="/login">
   <div class="login">
      <h2>Login</h2>
     <input type="text" name="username" size="30" placeholder="username" />
     <input type="password" name="password" size="30" placeholder="password" />
     <input type="submit" value="Sign in">
   </div>
 </form>
  </body>
</html>
