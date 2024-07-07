<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <div class="">
            <h1 class="big-title">Electricity water usage</h1>
            <div class="container-block" style="margin-top: 24px">
                <table class="table table-bordered table-advance table-hover">
                    <thead>
                    <tr>
                        <th>Block</th>
                        <th>Month - Year</th>
                        <th>Type</th>
                        <th>Your usage</th>
                        <th>Total Amount</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${roomBill.ewUsages}" var="u">
                        <tr>
                            <td rowspan="2">${roomBill.roomName}</td>
                            <td rowspan="2">${u.month} - ${roomBill.year}</td>
                            <td>Electric</td>
                            <td>${u.electricNumber}</td>
                            <td>${u.electricMoney}</td>
                        </tr>
                        <tr>
                            <td>Water</td>
                            <td>${u.waterNumber}</td>
                            <td>${u.waterMoney}</td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <td colspan="3">Total Electric:</td>
                        <td>1</td>
                        <td>1</td>
                    </tr>
                    <tr>
                        <td colspan="3">Total Water:</td>
                        <td>1</td>
                        <td>1</td>
                    </tr>
                    </tbody>
                </table>
            </div>

            <div class="container-block" style="margin-top: 24px">
                <table class="table table-bordered table-advance table-hover">
                    <thead>
                    <tr>
                        <th>Roll Name</th>
                        <th>Room name</th>
                        <th>Term</th>
                        <th>Year</th>
                        <th>Amount</th>
                        <th>Status</th>
                        <th>Description</th>
                        <c:if test="${roomBill.status == 'UNPAID'}">
                            <th></th>
                        </c:if>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>${roomBill.rollName}</td>
                        <td>${roomBill.roomName}</td>
                        <td>${roomBill.term}</td>
                        <td>${roomBill.year}</td>
                        <td>${roomBill.totalAmount}</td>
                        <td>${roomBill.status}</td>
                        <td>${roomBill.description}</td>
                        <c:if test="${roomBill.status == 'UNPAID'}">
                            <td >
                                <div class="flex justify-center">
                                    <div class="btn-action" style="width: fit-content;">
                                        <a href="#">Payment</a>
                                    </div>
                                </div>
                            </td>
                        </c:if>

                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<%@ include file="../footer.jsp" %>
</body>
</html>
