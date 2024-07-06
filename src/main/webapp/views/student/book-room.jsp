<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <style>
            .modal-dialog {
                width: 988px;
                padding-bottom: 10px;
            }

            .modal-title {
                width: auto;
                margin-bottom: 0;
                line-height: 1.5;
                font-size: 30px;
            }

            .modal-header {
                display: -webkit-box;
                display: flex;
            }

            .close {
                margin: -1rem -1rem -1rem auto;
            }

            .form-check {
                padding: 30px;
                padding-bottom: 0px;
            }
        </style>
        <h1 class="big-title">Booking bed</h1>
        <form action="/Student/Bookings/Create" id="create" method="post">
            <div class="SBB-create-container">
                <div class="col-xs-12 col-md-5 no-padding no-margin">
                    <p class="SBB-l-title"> Your Account Balance of FAP</p>
                    <p class="SBB-l-content">${bookRoomDto.yourAccountBalance} VND</p>
                    <p class="SBB-l-title"> Minimum Balance required in VND</p>
                    <p class="SBB-l-content">${bookRoomDto.minimumBalance} VND</p>
                    <p class="SBB-l-title"> Your Balance after booking with FAP</p>
                    <p class="SBB-l-content">${bookRoomDto.yourBalanceAfterBooking} VND</p>
                    <p class="SBB-l-title">Number slots remaining</p>
                    <label id="slot" class="SBB-l-content">
                        ${bookRoomDto.numberSlotsRemaining}
                    </label>
                </div>
                <div class="col-xs-12 col-md-7 no-padding no-margin">
                    <div class="form-group" hidden="">
                        <label class="control-label col-md-2" for="StudentId">RollNumber</label>
                        <div class="col-md-10">
                            <input class="form-control text-box single-line" id="StudentId" name="StudentId"
                                   readonly="" type="text" value="HE171008">
                            <span class="field-validation-valid text-danger" data-valmsg-for="StudentId"
                                  data-valmsg-replace="true"></span>
                        </div>
                    </div>
                    <div class="flex" style="gap: 24px;  margin-bottom: 24px;">
                        <div class="flex-1">
                            <label class="SBB-input-label no-margin" for="roomType">Room Type</label>
                            <div class="" style="width: 100%;">
                                <input class="SBB-input" readonly="" type="text"
                                       value="${bookRoomDto.roomType} beds - ${bookRoomDto.roomAmount} VND">
                                <input id="roomType" name="roomType" type="hidden" value="${bookRoomDto.key}">
                            </div>
                        </div>
                    </div>
                    <div class="flex" style="gap: 24px;  margin-bottom: 24px;">
                        <div class="SBB-layout-1">
                            <label class="SBB-input-label no-margin" for="domId">Dom</label>
                            <div class="my-select-style">
                                <select class="SBB-input" id="domId" name="domId" onchange="getFreeBedByDom()">
                                    <c:forEach items="${bookRoomDto.doms}" var="dom">
                                        <option value="${dom}">DOM ${dom}</option>
                                    </c:forEach>
                                </select>
                                <span class="field-validation-valid text-danger" data-valmsg-for="DomId"
                                      data-valmsg-replace="true"></span>
                            </div>
                        </div>
                        <div class="flex-1">
                            <label class="SBB-input-label no-margin" for="Floor">Floor</label>
                            <div class="my-select-style">
                                <select class="SBB-input" id="floor" name="floor" onchange="getFreeBedByDom()">
                                    <c:forEach items="${bookRoomDto.floors}" var="floor">
                                        <option value="${floor}">${floor}</option>
                                    </c:forEach>
                                </select>
                                <span class="field-validation-valid text-danger" data-valmsg-for="Floor"
                                      data-valmsg-replace="true"></span>
                            </div>
                        </div>
                    </div>
                    <div class="flex" style="gap: 24px;  margin-bottom: 24px;">
                        <div class="flex-1">
                            <label class="SBB-input-label no-margin" for="Note">Note</label>
                            <div class="">
                                <input class="SBB-input text-box single-line" id="Note" name="Note" type="text"
                                       value="">
                                <span class="field-validation-valid text-danger" data-valmsg-for="Note"
                                      data-valmsg-replace="true"></span>
                            </div>
                        </div>
                    </div>
                    <div style="margin-top: 24px;" class="flex justify-center">
                        <div class="">
                            <input type="button" data-toggle="modal" data-target="#exampleModalLong" value="Book"
                                   class="orange-btn">
                        </div>
                    </div>
                </div>
            </div>
            <button onclick="location.href='<%=request.getContextPath()%>/student/choose-room';return false;"
                    class="SAB-back"
                    style="margin-top: 24px;">Back to choose room type
            </button>

            <div class="modal fade" id="exampleModalLong" tabindex="-1" role="dialog"
                 aria-labelledby="exampleModalLongTitle" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLongTitle">Chấp nhận quy định về ký túc xá</h5>
                            <button style="padding: 10px;" type="button" class="close" data-dismiss="modal"
                                    aria-label="Close">
                                <span aria-hidden="true">×</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <div id="the-canvas">
                                Ghi noi dung quy dinh vao day
                            </div>
                            <div class="form-check" id="formCheck" style="display: block;">
                                <input class="form-check-input" onchange="checkConfirm()" type="checkbox" id="flexCheckChecked">
                                <label class="form-check-label" for="flexCheckChecked">
                                    Đồng ý với quy định về ký túc xá
                                </label>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <button id="confirm" disabled="" type="submit"
                                    class="btn btn-primary">Confirm
                            </button>
                        </div>
                    </div>
                </div>
            </div>
            <div id="dvProgress" class="my-loader" hidden="hidden">
                <div class="my-loader-container">
                    <span class="loader"></span>
                </div>
            </div>
            <canvas id="canvas"></canvas>
        </form>
    </div>

</div>
<%@ include file="../footer.jsp" %>
<script>
    function getFreeBedByDom() {
        console.log($("#domId").val())
        var param = "roomType=" + $("#roomType").val() + "&dom=" + $("#domId").val() + "&floor=" + $("#floor").val()
        $.get("<%=request.getContextPath()%>" + "/student/detail-book-room?" + param,
            data => {
                console.log(data)
            }
        )
    }

    function checkConfirm() {
        $("#flexCheckChecked").is(":checked") ? $("#confirm").attr("disabled", false) : $("#confirm").attr("disabled", true);

    }
</script>
</body>
</html>
