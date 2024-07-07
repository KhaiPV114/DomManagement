<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <h1 class="big-title">Create request</h1>
        <form action="<%=request.getContextPath()%>/admin/user/new" method="post" style="width: 50%;">
            <div class="">
                <div class="flex-1" style="margin-bottom: 24px;">
                    <label class="SBB-input-label no-margin" for="fullName">Full Name:</label>
                    <div class="SR-form" style="width: 100%;">
                    <input type="text" name="fullName" id="fullName">
                    </div>
                </div>
                <div class="flex-1" style="margin-bottom: 24px;">
                    <label class="SBB-input-label no-margin" for="gmail">Gmail:</label>
                    <div class="SR-form" style="width: 100%;">
                    <input type="text" name="gmail" id="gmail">
                    </div>
                </div>
                <div class="flex-1" style="margin-bottom: 24px;">
                    <label class="SBB-input-label no-margin" for="password">Password:</label>
                    <div class="SR-form" style="width: 100%;">
                    <input type="text" name="password" id="password">
                    </div>
                </div>
                <div class="flex-1" style="margin-bottom: 24px;">
                    <label class="SBB-input-label no-margin" for="gender">Gender:</label>
                    <div class="SR-form" style="width: 100%;">
                    <input type="text" name="gender" id="gender">
                    </div>
                </div>
                <div class="flex-1 hidden" style="margin-bottom: 24px;">
                    <label class="SBB-input-label no-margin" for="role">Role:</label>
                    <div class="SR-form" style="width: 100%;">
                        <input type="text" name="role" id="role" value="Admin">
                    </div>
                </div>
                <div class="flex-1 hidden" style="margin-bottom: 24px;">
                    <label class="SBB-input-label no-margin" for="status">Status:</label>
                    <div class="SR-form" style="width: 100%;">
                        <input type="text" name="status" id="status" value="ACTIVE">
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
    <style>
        /* CSS để ẩn popup ban đầu */
        .popup {
            display: none;
            position: fixed;
            left: 0;
            top: 0;
            width: 100%;
            height: 100%;
            background-color: rgba(0,0,0,0.5); /* Màu nền đục */
            z-index: 9999; /* Lớp z-index để nằm trên các phần tử khác */
            overflow: auto; /* Cho phép cuộn khi nội dung dài hơn */
        }

        .popup-content {
            background-color: #fefefe;
            margin: 15% auto;
            padding: 20px;
            width: 50%;
            text-align: center;
            border: 2px solid #003eff;
            border-radius: 4px;
            color: #003eff;
        }

        .close {
            color: #003eff;
            float: right;
            font-size: 28px;
            font-weight: bold;
        }

        .close:hover,
        .close:focus {
            color: black;
            text-decoration: none;
            cursor: pointer;
        }
    </style>
    <c:if test="${message != null}">
        <div id="myPopup" class="popup" style="display: block">
            <div class="popup-content">
                <span class="close" onclick="closePopup()">&times;</span>
                <p>${message}</p>
            </div>
        </div>
    </c:if>
</div>
<%@ include file="../footer.jsp" %>
</body>
</html>
