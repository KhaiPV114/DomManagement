<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <h1 class="big-title">Room details</h1>
        <div class="flex justify-end" style="margin: 10px 0">
            <a class="orange-btn" href="<%= request.getContextPath()%>/admin/room-detail/ew-usage">EW usage</a>
        </div>
        <div class="container-block">
            <div class="table-responsive">
                <table class="table table-striped table-bordered table-advance table-hover">
                    <thead>
                    <tr>
                        <th>Dorm</th>
                        <th>Floor</th>
                        <th>Room</th>
                        <th>Amount</th>
                        <th>Total bed</th>
                        <th>Used bed</th>
                        <th>Free bed</th>
                        <th>Status</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>${roomAdmin.dom}</td>
                        <td>${roomAdmin.floor}</td>
                        <td>${roomAdmin.room}</td>
                        <td>${roomAdmin.amount} VND</td>
                        <td>${roomAdmin.totalBed}</td>
                        <td>${roomAdmin.usedBed}</td>
                        <td>${roomAdmin.freeBed}</td>
                        <td>${roomAdmin.status}</td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <p style="margin: 15px 0;">Student: </p>
            <div class="table-responsive">
                <table class="table table-striped table-bordered table-advance table-hover">
                    <thead>
                    <tr>
                        <th>RollNumber</th>
                        <th>Full name</th>
                        <th>Email</th>
                        <th>Gender</th>
                        <th>Bed</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${roomAdmin.studentBedDtoList}" var="st">
                        <tr>
                            <td>${st.rollId}</td>
                            <td>${st.fullName}</td>
                            <td>${st.gmail}</td>
                            <td>${st.gender}</td>
                            <td>${st.bed}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <button onclick="history.back();return false;" class="SAB-back"
                style="margin-top: 24px;">Back to list
        </button>
    </div>
</div>

<%@ include file="../footer.jsp" %>
</body>
</html>
