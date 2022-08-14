<%--
  Created by IntelliJ IDEA.
  User: Nadin Pethiyagoda
  Date: 8/14/2022
  Time: 7:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Customer Registration</title>
    <link href="./css/index.css" rel="stylesheet" type="text/css">
  </head>
  <body>
  <div class="container">
    <div class="form-wrapper">
      <h1>Customer Registration Form</h1>
      <form action="<%= request.getContextPath() %>/registercustomer" method="post">
        <label>First Name: </label><br>
          <input type="text" name="firstname" /><br>
        <label>Last Name:</label><br>
          <input type="text" name="lastname" /><br>
        <label>Username:</label><br>
          <input type="text" name="username" /><br>
        <label>Password:</label><br>
          <input type="password" name="password" /><br>
        <label>Address:</label><br>
          <input type="text" name="address" /><br>
        <label>Email:</label><br>
          <input type="text" name="email" /><br>
        <div class="submitBtn">
          <input type="submit" value="Submit" />
        </div>
      </form>
    </div>
  </div>
  </body>
</html>
