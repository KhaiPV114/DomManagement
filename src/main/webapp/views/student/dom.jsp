<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <div>
            <h1 class="big-title">Available beds</h1>
            <div style="margin-bottom: 15px">
                <form action="/Student/ViewBed" method="get">
                    <div class="flex" style="gap: 24px;">
                        <div class="my-select flex" style="min-width: 200px; flex-direction: column;">
                            <label for="term" class="SAB-label">Term</label>
                            <select class="form-control" id="Term" name="Term"
                                    style="max-width: 100%; min-height: 44px;">
                                <option selected="selected" value="2|2024">Summer - 2024</option>
                                <option value="3|2024">Fall - 2024</option>
                            </select>
                        </div>
                        <div class="flex items-end">
                            <button type="submit" class="orange-btn">
                                Search
                            </button>
                        </div>
                    </div>
                </form>
            </div>
            <div class="container-block">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-advance table-hover">
                        <thead>
                        <tr>
                            <th>DomName</th>
                            <th>DomID</th>
                            <th>TotalBed</th>
                            <th>UsedBed</th>
                            <th>FreeBed</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${domTotalDto}" var="dom">
                            <tr>
                                <td>${dom.domName}</td>
                                <td>${dom.domId}</td>
                                <td>${dom.totalBed}</td>
                                <td>${dom.usedBed}</td>
                                <td>${dom.freeBed}</td>
                                <td>
                                    <div class="flex justify-center">
                                        <div class="btn-action" style="width: fit-content;">
                                            <a
                                                    href="<%=request.getContextPath()%>/student/dom-detail?domId=${dom.domId}">Detail</a>
                                        </div>
                                    </div>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="../footer.jsp" %>
</body>
</html>
