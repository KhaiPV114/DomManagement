<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <div>
            <h1 class="big-title">Invoice details</h1>

            <div>
                <dl class="dl-horizontal">
                    <dt class="dt">RollName</dt>
                    <dd class="dd">HHHHH</dd>
                </dl>
                <dl class="dl-horizontal">
                    <dt class="dt">Room</dt>
                    <dd class="dd">A103</dd>
                </dl>
                <dl class="dl-horizontal">
                    <dt class="dt">Bed number</dt>
                    <dd class="dd">5</dd>
                </dl>
                <dl class="dl-horizontal">
                    <dt class="dt">Create date</dt>
                    <dd class="dd">1/5/2024</dd>
                </dl>
                <dl class="dl-horizontal">
                    <dt class="dt">Payment Date</dt>
                    <dd class="dd">30/5/2024</dd>
                </dl>
                <dl class="dl-horizontal">
                    <dt class="dt">Payment Status</dt>
                    <dd class="dd">Paid in pull</dd>
                </dl>
                <dl class="dl-horizontal">
                    <dt class="dt">Description</dt>
                    <dd class="dd">Thanh toán tiền điện tháng 1</dd>
                </dl>
            </div>
            <div class="container-block">
                <div class="table-responsive">
                    <table class="table table-bordered table-advance table-hover">
                        <thead>
                        <tr>
                            <th>Type</th>
                            <th>Description</th>
                            <th>Amount</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>Electrictity</td>
                            <td></td>
                            <td>50,000 VND</td>
                        </tr>
                        <tr>
                            <td>Water</td>
                            <td></td>
                            <td>50,000 VND</td>
                        </tr>
                        <tr>
                            <td class="text-blue font-weight-m" colspan="2">Total</td>
                            <td class="text-blue font-weight-m">50,000 VND</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <button onclick="location.href='#';return false;" class="SAB-back"
                style="margin-top: 24px;">Back to list
        </button>
    </div>
</div>
<%@ include file="../footer.jsp" %>
</body>
</html>
