<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <h1 class="big-title">Choose Type Room</h1>
        <form action="<%=request.getContextPath()%>/student/book-room" method="get">
            <div class="">
                <div class="flex-1">
                    <label class="SBB-input-label no-margin" for="RoomTypeId">Room type</label>
                    <div class="my-select-style">
                        <select class="SBB-input" id="roomTypeName" name="roomTypeName" onchange="getAmount()">
                            <c:forEach items="${roomTypes}" var="room">
                                <option value="${room.key}">${room.bed} beds</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="flex-1" style="margin-top: 24px;">
                    <label class="SBB-input-label no-margin">Price/Bed/Semester</label>
                    <div class="SBB-input">
                        <span id="BedPrice">${roomTypes.get(0).amount}</span> VND
                        <input name="roomAmount" id="roomAmount" type="hidden" value="${roomTypes.get(0).amount.replace('.','')}"/>
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
<%@ include file="../footer.jsp" %>
<script>
    function getAmount() {
        $.get("<%=request.getContextPath()%>" + "/student/get-amount?roomType=" + $("#roomTypeName").val(),
            data => {
                $("#BedPrice").text(data);
                $("#roomAmount").val(data);
            }
        )
    }
</script>
</body>
</html>
