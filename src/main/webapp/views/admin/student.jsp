<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <h1 class="big-title">Student</h1>
        <form>
            <div class="SBB-layout" style="margin-bottom: 24px;">
                <div class="flex items-center justify-between">
                    <div class="flex-1" style="margin-right: 10px;">
                        <input class="SBB-input text-box single-line" placeholder="Search..." id="Note" name="Note"
                               type="text" value="">
                        <span class="field-validation-valid text-danger" data-valmsg-for="Note"
                              data-valmsg-replace="true"></span>
                    </div>
                    <div>
                        <input type="submit" value="Search" class="orange-btn">
                    </div>
                </div>
            </div>
        </form>
        <div class="container-block">
            <div class="table-responsive">
                <table class="table table-striped table-bordered table-advance table-hover">
                    <thead>
                    <tr>
                        <th>RollNumber</th>
                        <th>Full name</th>
                        <th>Email</th>
                        <th>Gender</th>
                        <th>Balance</th>
                        <th>Status</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${studentList}" var="student">
                    <tr>
                        <td>${student.rollId}</td>
                        <td>${student.fullName}</td>
                        <td>${student.gmail}</td>
                        <td>${student.gender}</td>
                        <td>${student.balance}</td>
                        <td>${student.studentStatus}</td>
                        <td>
                            <div class="flex justify-center">
                                <div class="btn-action" style="width: fit-content;">
                                    <a href="#">Banned</a>
                                </div>
                            </div>
                    </tr>
                    </c:forEach>
                    <tr>
                        <td>HE</td>
                        <td>Phan Van Khai</td>
                        <td>khaipvhe171008</td>
                        <td>Nam</td>
                        <td>50,000 VND</td>
                        <td>BANNED</td>
                        <td>
                            <div class="flex justify-center">
                                <div class="btn-action" style="width: fit-content;">
                                    <a href="#">Active</a>
                                </div>
                            </div>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
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
<%@ include file="../footer.jsp" %>
</body>
</html>
