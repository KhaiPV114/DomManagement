<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
  <div class="container-fluid my-container">
    <h1 class="big-title">Electric Water Usage</h1>
    <div>
      <div class="container-block">
        <c:if test="${message != null}">
          <h4 class="text-danger" style="margin: 15px 0"><strong>NOTE:</strong> ${message}</h4>
          <h4 class="text-danger">Hãy nhập hết tiền điện và nước trước khi tạo hóa đơn.</h4>
        </c:if>
        <div class="flex justify-end" style="margin: 10px 0">
          <a href="<%=request.getContextPath()%>/admin/create-bill" class="orange-btn">+ EW BILL Term DONG</a>
        </div>
        <div class="table-responsive">
          <table class="table table-striped table-bordered table-advance table-hover">
            <thead>
            <tr>
              <th>Student ID</th>
              <th>Room name</th>
              <th>Electric money</th>
              <th>Water money</th>
              <th>Total money</th>
              <th>Semester</th>
              <th>Status</th>
              <th>Create date</th>
              <th>Payment date</th>
              <th>Description</th>
            </tr>
            </thead>
            <tbody>
            <tr>
              <td>HE-178580</td>
              <td>A101</td>
              <td>10,000 VND</td>
              <td>30,000 VND</td>
              <td>850,000 VND</td>
              <td>DONG-2024</td>
              <td>UNPAID</td>
              <td>2024/12/12</td>
              <td>--</td>
              <td>Tien dien ky 1</td>
            </tr>
            </tbody>
          </table>
        </div>
        <div class="flex justify-center">
          <div class="pagination-container">
            <ul class="pagination">
              <li class="disabled PagedList-skipToFirst"><a>««</a></li>
              <li class="disabled PagedList-skipToPrevious"><a rel="prev">«</a></li>
              <li class="active"><a>1</a></li>
              <li><a href="/Student/News?page=2">2</a></li>
              <li><a href="/Student/News?page=3">3</a></li>
              <li class="PagedList-skipToNext"><a href="/Student/News?page=2" rel="next">»</a></li>
              <li class="PagedList-skipToLast"><a href="/Student/News?page=3">»»</a></li>
            </ul>
          </div>
        </div>
      </div>
    </div>

  </div>
</div>
<%@ include file="../footer.jsp" %>

</body>
</html>
