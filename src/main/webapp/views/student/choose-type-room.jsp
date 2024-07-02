<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
  <div class="container-fluid my-container">
    <h1 class="big-title">Choose Type Room</h1>
    <form action="/Student/Bookings/Create" method="get"><input name="__RequestVerificationToken" type="hidden"
                                                                value="u0bKaBHHaZ-qY4h4ybf63GqjowZx1_BMxkEaeCvEjoSox8oyay5wKp3bbjWYMEU0_i1zAfEQTX6CBDQ0oZwJH62P8JeYQXviU7Ny2Px_DXa77JYrzqotB_SHgcam_wRWzWyjLQjVWen915c5Vwx0fA2">
      <div class="">
        <div class="flex-1">
          <label class="SBB-input-label no-margin" for="RoomTypeId">Room type</label>
          <div class="my-select-style">
            <select class="SBB-input" id="RoomTypeId" name="roomTypeId">
              <option value="9">SVVN - 6 beds - 850.000</option>
              <option value="7">SVVN - 4 beds - 1.050.000</option>
              <option value="3">SVVN - 3 beds - 1.150.000</option>
            </select>
          </div>
        </div>
        <div class="flex-1" style="margin-top: 24px;">
          <label class="SBB-input-label no-margin" for="BedPrice">Price/Bed/Semester</label>
          <div class="SBB-input">
            <span id="BedPrice">850.000</span> VND
          </div>
        </div>
        <div style="margin-top: 24px;">
          <div class="">
            <input type="submit" value="Next" class="orange-btn">
          </div>
        </div>
      </div>
    </form>
  </div>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>
