<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <h1 class="big-title">Request</h1>
        <div class="container-block">
            <div class="table-responsive">
                <table class="table table-striped table-bordered table-advance table-hover">
                    <thead>
                    <tr>
                        <th>Student ID</th>
                        <th>Request type</th>
                        <th>Dorm</th>
                        <th>Floor</th>
                        <th>Term</th>
                        <th>Content</th>
                        <th>Status</th>
                        <th>Date</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${requestList}" var="request">
                        <tr>
                            <td>${request.rollId}</td>
                            <td>${request.requestType}</td>
                            <td>${request.domName}</td>
                            <td>${request.floor}</td>
                            <td>${request.term}</td>
                            <td>${request.requestDetail}</td>
                            <td>${request.requestStatus}</td>
                            <td>${request.createDate}</td>
                            <c:if test="${request.requestStatus != 'WAITTING'}">
                                <td></td>
                            </c:if>

                            <c:if test="${request.requestStatus == 'WAITTING'}">
                                <td>
                                    <div class="flex justify-center">
                                        <div class="btn-action" style="width: fit-content;">
                                            <a onclick="if(confirm('Are you sure?')) submitApprove(${request.requestId})">Approved</a>
                                        </div>
                                        <div class="btn-action" style="width: fit-content; margin-left: 30px">
                                            <a onclick="if(confirm('Are you sure?')) submitReject(${request.requestId})">Reject</a>
                                        </div>
                                    </div>
                                </td>
                            </c:if>
                        </tr>
                    </c:forEach>
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

<script >
    function submitApprove(id) {
        $.ajax({
            type: 'get',
            url: '<%=request.getContextPath()%>/admin/request/approved?id=' + id,
            data:{
                id: id
            },
            success: function(response) {
                window.location.href = '<%=request.getContextPath()%>/admin/request';
            },
        });
    }
    function submitReject(id) {
        $.ajax({
            type: 'get',
            url: '<%=request.getContextPath()%>/admin/request/reject?id=' + id,
            data:{
                id: id
            },
            success: function(response) {
                window.location.href =  '<%=request.getContextPath()%>' + '/admin/request';
            },
        });
    }
</script>
<%@ include file="../footer.jsp" %>
</body>
</html>
