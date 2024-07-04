<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container" >
        <h1 class="big-title">Create request</h1>
        <form action="/Student/Bookings/Create" method="get" style="width: 50%;">
            <input name="__RequestVerificationToken" type="hidden"
                   value="u0bKaBHHaZ-qY4h4ybf63GqjowZx1_BMxkEaeCvEjoSox8oyay5wKp3bbjWYMEU0_i1zAfEQTX6CBDQ0oZwJH62P8JeYQXviU7Ny2Px_DXa77JYrzqotB_SHgcam_wRWzWyjLQjVWen915c5Vwx0fA2">
            <div class="">
                <div class="flex-1" style="margin-bottom: 24px;">
                    <label class="SBB-input-label no-margin" for="RequestType">Request type</label>
                    <div class="my-select-style">
                        <select class="SBB-input" id="RequestType" name="RequestType" onchange="showDateCheckOut()">
                            <option value="">Chọn yêu cầu</option>
                            <option value="1">Đăng ký check out</option>
                            <option value="2">Sai số điện nước</option>
                        </select>
                    </div>
                </div>
                <div class="flex-1 hidden" id="date-check-out" style="margin-bottom: 24px;" >
                    <label class="SBB-input-label no-margin" for="RoomTypeId">Date check-out</label>
                    <div class="" style="width: 100%;">
                        <input class="SBB-input" type="date">
                        <input id="RoomTypeId" name="RoomTypeId" type="hidden" value="3">
                    </div>
                </div>
                <div class="flex-1" >
                    <label class="SBB-input-label no-margin" >Content</label>
                    <div class="SR-form" style="width: 100%;">
                        <textarea class="SBB-l-content"></textarea>
                    </div>
                </div>
                <div style=" margin-top: 24px;">
                    <div class="flex justify-end">
                        <input type="submit" value="Create request" class="orange-btn">
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
<script>
    function showDateCheckOut(){
        const RequestType = document.getElementById("RequestType");
        const dateCheckOut =  document.getElementById("date-check-out");
        if(RequestType.value === '1'){
            dateCheckOut.classList.remove("hidden");
        } else if (!dateCheckOut.classList.contains("hidden")){
            dateCheckOut.classList.add("hidden")
        }
    }
</script>
<%@ include file="../footer.jsp" %>
</body>
</html>

