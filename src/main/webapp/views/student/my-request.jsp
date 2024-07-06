<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container" >
        <h1 class="big-title">My request</h1>
        <div class="orange-btn">

        <a href="<%=request.getContextPath() %>/student/create-request">Create request</a>
        </div>
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

