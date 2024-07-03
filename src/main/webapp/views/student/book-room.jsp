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
    <form action="/Student/Bookings/Create" id="create" method="post"><input name="__RequestVerificationToken"
                                                                             type="hidden"
                                                                             value="X8_N3U4YCpUmBxOc2Dq0iwXK37-3eSx43D4x1B0d_V1ZGG66BD5i5_y3U9UM6TxnCV4B3kfl1u4y09gN6hmNT7IIQ0WyS-KarXO5chUmmRHqlsjDwPx02AlmmoY8T5-G-AdAh642fAc2n6pbIs5neQ2">
      <input hidden="" name="paymentType" id="paymentType" value="1">
      <div class="SBB-create-container">
        <div class="col-xs-12 col-md-5 no-padding no-margin">
          <p class="SBB-l-title"> Your Account Balance of FAP</p>
          <p class="SBB-l-content">0 VND</p>
          <p class="SBB-l-title"> Minimum Balance required in VND</p>
          <p class="SBB-l-content">4.600.000 VND</p>
          <p class="SBB-l-title"> Your Balance after booking with FAP</p>
          <p class="SBB-l-content">-4.600.000 VND</p>
          <p class="SBB-l-title"> Số slot còn lại</p>
          <label id="slot" class="SBB-l-content">
            0
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
            <div class="SBB-available-btn">
              <a href="/Student/ViewBed" class="sidebar-linkItem flex items-center">See available
                beds</a>
            </div>
            <div class="flex-1">
              <label class="SBB-input-label no-margin" for="RoomTypeId">Room Type</label>
              <div class="" style="width: 100%;">
                <input class="SBB-input" readonly="" type="text" value="SVVN - 3 beds - 1.150.000">
                <input id="RoomTypeId" name="RoomTypeId" type="hidden" value="3">
              </div>
            </div>
          </div>
          <div class="flex" style="gap: 24px;  margin-bottom: 24px;">
            <div class="SBB-layout-1">
              <label class="SBB-input-label no-margin" for="RoomTypeId">Dom</label>
              <div class="my-select-style">
                <select class="SBB-input" id="DomId" name="DomId">
                  <option value="A">DomA</option>
                  <option value="B">DomB</option>
                  <option value="C">DomC</option>
                  <option value="D">DomD</option>
                  <option value="F">DomF</option>
                  <option value="H">DomH</option>
                </select>
                <span class="field-validation-valid text-danger" data-valmsg-for="DomId"
                      data-valmsg-replace="true"></span>
              </div>
            </div>
            <div class="flex-1">
              <label class="SBB-input-label no-margin" for="Floor">Floor</label>
              <div class="my-select-style">
                <select class="SBB-input" id="Floor" name="Floor">




                  <option value="1">1</option>
                  <option value="2">2</option>
                  <option value="3">3</option>
                  <option value="4">4</option>
                  <option value="5">5</option>
                </select>
                <span class="field-validation-valid text-danger" data-valmsg-for="Floor"
                      data-valmsg-replace="true"></span>
              </div>
            </div>
          </div>
          <div class="flex" style="gap: 24px;  margin-bottom: 24px;">
            <div class="SBB-layout-1">
              <label class="SBB-input-label no-margin" for="Note">Note</label>
              <div class="">
                <input class="SBB-input text-box single-line" id="Note" name="Note" type="text"
                       value="">
                <span class="field-validation-valid text-danger" data-valmsg-for="Note"
                      data-valmsg-replace="true"></span>
              </div>
            </div>
            <div class="flex-1">
              <label class="SBB-input-label no-margin" for="Semester">Semester</label>
              <div class="my-select-style">
                <select class="SBB-input" id="Semester" name="SemesterYear">
                  <option selected="selected" value="2|2024">Summer - 2024</option>
                  <option value="3|2024">Fall - 2024</option>
                </select>
                <span class="field-validation-valid text-danger" data-valmsg-for="SemesterYear"
                      data-valmsg-replace="true"></span>
              </div>
            </div>
          </div>
          <div class="" style="margin-top: 24px;">
            <div class="row" style="display: flex; align-items: center">
              <p class="text-red text-bold">Sorry, it's not right time to book a new bed!</p>
            </div>
          </div>
          <div class="" style="margin-top: 24px;">
            <div class="row" style="display: flex; align-items: center">
            </div>
          </div>
        </div>
      </div>

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
              <div id="the-canvas"><canvas id="canvas1" height="1263" width="892"></canvas><canvas
                      id="canvas2" height="1263" width="892"></canvas><canvas id="canvas3"
                                                                              height="1263" width="892"></canvas><canvas id="canvas4" height="1263"
                                                                                                                         width="892"></canvas><canvas id="canvas5" height="1263"
                                                                                                                                                      width="892"></canvas><canvas id="canvas6" height="1263"
                                                                                                                                                                                   width="892"></canvas><canvas id="canvas7" height="1263"
                                                                                                                                                                                                                width="892"></canvas><canvas id="canvas8" height="1263"
                                                                                                                                                                                                                                             width="892"></canvas><canvas id="canvas9" height="1263" width="892"></canvas>
              </div>
              <div class="form-check" id="formCheck" style="display: block;">
                <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked">
                <label class="form-check-label" for="flexCheckChecked">
                  Đồng ý với quy định về ký túc xá
                </label>
              </div>
            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
              <button id="confirm" onclick="checkConfirm();" disabled="" type="button"
                      class="btn btn-primary">Confirm</button>
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
</body>
</html>
