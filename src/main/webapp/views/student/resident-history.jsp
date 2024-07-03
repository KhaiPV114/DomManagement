<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <div>
            <h1 class="big-title">Resident history</h1>
            <div class="container-block">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-advance table-hover">
                        <thead>
                        <tr>
                            <th>Student ID</th>
                            <th>Bed information</th>
                            <th>Check-in Date</th>
                            <th>Check-out Date</th>
                            <th>Price</th>
                            <th>Semester</th>
                            <th>Years</th>
                            <th>Description</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>HE-178580</td>
                            <td>A103-3</td>
                            <td>01/05/2024</td>
                            <td>30/05/2024</td>
                            <td>850,000 VND</td>
                            <td>1</td>
                            <td>2024</td>
                            <td>Keep current bed</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="../footer.jsp" %>
</body>
</html>
