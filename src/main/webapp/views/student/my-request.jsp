<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <h1 class="big-title">My request</h1>
        <div class="">
            <a class="orange-btn" href="<%=request.getContextPath() %>/student/create-request">Create request</a>
            <span style="margin-top: 10px">Your processing CIM request: ${requests.size()}</span>
            <c:if test="${requests.size() > 0}">
                <div class="container-block">
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-advance table-hover">
                            <thead>
                            <tr>
                                <th>Request type</th>
                                <th>Create date</th>
                                <th>Description</th>
                                <th>Status</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${requests}" var="payment" >
                                <tr>
                                    <td>${requests.requestType}</td>
                                    <td>${requests.createDate}</td>
                                    <td>${payment.requestDetail}</td>
                                    <td>${payment.status.name}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </c:if>
            <c:if test="${requests.size() == 0}">
                <%@ include file="no-record.jsp" %>
            </c:if>
        </div>
    </div>
</div>
<script>
    function showDateCheckOut() {
        const RequestType = document.getElementById("RequestType");
        const dateCheckOut = document.getElementById("date-check-out");
        if (RequestType.value === '1') {
            dateCheckOut.classList.remove("hidden");
        } else if (!dateCheckOut.classList.contains("hidden")) {
            dateCheckOut.classList.add("hidden")
        }
    }
</script>
<%@ include file="../footer.jsp" %>
</body>
</html>

