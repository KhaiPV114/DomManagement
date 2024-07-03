<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <h1 class="big-title">Room details</h1>
        <div class="container-block">
            <div>
                <dl class="dl-horizontal">
                    <dt class="dt">Dorm</dt>
                    <dd class="dd">A</dd>
                </dl>
                <dl class="dl-horizontal">
                    <dt class="dt">Floor</dt>
                    <dd class="dd">1</dd>
                </dl>
                <dl class="dl-horizontal">
                    <dt class="dt">Room</dt>
                    <dd class="dd">1</dd>
                </dl>
                <dl class="dl-horizontal">
                    <dt class="dt">Total bed</dt>
                    <dd class="dd">6</dd>
                </dl>
                <dl class="dl-horizontal">
                    <dt class="dt">Status</dt>
                    <dd class="dd">NOT FULL</dd>
                </dl>
                <dl class="dl-horizontal">
                    <dt class="dt">Amount</dt>
                    <dd class="dd">500,000 VND</dd>
                </dl>
                <dl class="dl-horizontal">
                    <dt class="dt">Electricity</dt>
                    <dd class="dd">33</dd>
                </dl>
                <dl class="dl-horizontal">
                    <dt class="dt">Water</dt>
                    <dd class="dd">1</dd>
                </dl>
                <dl class="dl-horizontal">
                    <dt class="dt">Bed used</dt>
                    <dd class="dd">4(No: 1, 3, 4, 5)</dd>
                </dl>
                <dl class="dl-horizontal">
                    <dt class="dt">Bed free</dt>
                    <dd class="dd">2(No: 2, 6)</dd>
                </dl>
            </div>
            <p>Danh sach sinh vien</p>
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
                    <tr>
                        <td>HE</td>
                        <td>Phan Van Khai</td>
                        <td>khaipvhe171008</td>
                        <td>Nam</td>
                        <td>1</td>
                    </tr>
                    <tr>
                        <td>HE</td>
                        <td>Phan Van Khai</td>
                        <td>khaipvhe171008</td>
                        <td>Nam</td>
                        <td>3</td>
                    </tr>
                    </tbody>
                </table>
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
