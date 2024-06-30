<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 9/12/2023
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/3186023da8.js" crossorigin="anonymous"></script>
</head>
<body>
<div class="container w-100 d-flex flex-column position-relative justify-content-center align-items-center"
     style="height: 100vh;">
    <div class="col-7">
        <div class="border border-bottom-0 text-bg-light rounded-top">
            <div class="p-2 text-center"><h1>MEMBER LOGIN</h1></div>
        </div>
        <form class="p-3 border rounded-bottom" id="form-login" action="<%= request.getContextPath()%>/login"
              method="post">
            <input class="form-control mb-2" type="email" id="email" name="email" required placeholder="E-mail">
            <input class="form-control mb-2" type="password" name="password" id="password" required
                   placeholder="Password">
            <input class="my-2 form-control btn btn-success" type="submit" name="btn-submit" id="btn-login"
                   value="Login">
            <div class="my-2">
                <a class="text-decoration-none" href="forgot.jsp">Forgot password</a>
            </div>
        </form>
    </div>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
<script src="
        https://cdn.jsdelivr.net/npm/jquery@3.7.0/dist/jquery.min.js
        "></script>


</body>
</html>


