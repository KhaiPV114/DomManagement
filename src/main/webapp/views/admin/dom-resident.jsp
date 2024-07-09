<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <h1 class="big-title">Dorm Risedent</h1>
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
                    <c:forEach items="${domResidentList}" var="r">
                        <tr>
                            <td>${r.studentId}</td>
                            <td>${r.bedInformation}</td>
                            <td>${r.checkInDate}</td>
                            <td>${r.checkOutDate}</td>
                            <td>${r.price}</td>
                            <td>${r.semester}</td>
                            <td>${r.year}</td>
                            <td>Keep current bed</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
<%--            <div class="flex justify-center">--%>
<%--                <div class="pagination-container">--%>
<%--                    <ul class="pagination">--%>
<%--                        <li class="disabled PagedList-skipToFirst"><a>««</a></li>--%>
<%--                        <li class="disabled PagedList-skipToPrevious"><a rel="prev">«</a></li>--%>
<%--                        <li class="active"><a>1</a></li>--%>
<%--                        <li><a href="/Student/News?page=2">2</a></li>--%>
<%--                        <li><a href="/Student/News?page=3">3</a></li>--%>
<%--                        <li class="PagedList-skipToNext"><a href="/Student/News?page=2" rel="next">»</a></li>--%>
<%--                        <li class="PagedList-skipToLast"><a href="/Student/News?page=3">»»</a></li>--%>
<%--                    </ul>--%>
<%--                </div>--%>
<%--            </div>--%>
        </div>
    </div>
</div>
<%@ include file="../footer.jsp" %>
</body>
</html>
