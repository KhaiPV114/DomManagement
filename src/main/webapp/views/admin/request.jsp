<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <h1 class="big-title">Request</h1>
        <div class="container-block">
            <div class="table-responsive">
                <table class="table table-striped table-bordered table-advance table-hover">
                    <thead>
                    <tr>
                        <th>Student ID</th>
                        <th>Request type</th>
                        <th>Dorm</th>
                        <th>Floot</th>
                        <th>Term</th>
                        <th>Content</th>
                        <th>Status</th>
                        <th>Date</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>HE-178580</td>
                        <td>Check-in</td>
                        <td>A</td>
                        <td>1</td>
                        <td>1</td>
                        <td>Đăng ký phòng mới</td>
                        <td>WAITING</td>
                        <td>1/5/2024</td>
                        <td>
                            <div class="flex justify-center">
                                <div class="btn-action" style="width: fit-content;">
                                    <a href="#">Detail</a>
                                </div>
                            </div>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="flex justify-center">
                <div class="pagination-container">
                    <ul class="pagination">
                        <li class="disabled PagedList-skipToFirst"><a>««</a></li>
                        <li class="disabled PagedList-skipToPrevious"><a rel="prev">«</a></li>
                        <li class="active"><a>1</a></li>
                        <li><a href="/Student/News?page=2">2</a></li>
                        <li><a href="/Student/News?page=3">3</a></li>
                        <li class="PagedList-skipToNext"><a href="/Student/News?page=2" rel="next">»</a></li>
                        <li class="PagedList-skipToLast"><a href="/Student/News?page=3">»»</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>

<%@ include file="../footer.jsp" %>
</body>
</html>
