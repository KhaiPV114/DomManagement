<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <div>
            <h1 class="big-title">Payment history</h1>
            <div class="container-block">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-advance table-hover">
                        <thead>
                        <tr>
                            <th>Room</th>
                            <th>Create date</th>
                            <th>Description</th>
                            <th>Status</th>
                            <th>Total amount</th>
                            <th>Total amount paid</th>
                            <th>Total remaining amount</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>A103</td>
                            <td>21/05/2024</td>
                            <td> Tiền điện nước và đền bù kỳ1_2024</td>
                            <td>Paid in pull</td>
                            <td>50,000 VND</td>
                            <td>50,000 VND</td>
                            <td>0 VND</td>
                            <td>
                                <div class="flex justify-center">
                                    <div class="btn-action" style="width: fit-content;">
                                        <a
                                                href="#">Detail</a>
                                    </div>
                                </div>
                        </tr>
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
