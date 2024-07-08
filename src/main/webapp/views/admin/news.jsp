<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <h1 class="big-title">News</h1>
        <div class="container-block">
            <div class="table-responsive">
                <div class="flex justify-end" style="margin: 10px 0">
                    <a class="orange-btn" href="<%=request.getContextPath()%>/admin/news/create">+ New</a>
                </div>
                <table class="table table-striped table-bordered table-advance table-hover">
                    <thead>
                    <tr>
                        <th>NewID</th>
                        <th>New Title</th>
                        <th>Created Time</th>
                        <th>Author</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${newsDtoList}" var="news">
                            <tr>
                                <td>${news.newsId}</td>
                                <td>${news.newsTitle}</td>
                                <td>${news.createdTime}</td>
                                <td>${news.author}</td>
                                <td>
                        <div class="flex justify-center">
                            <div class="btn-action" style="width: fit-content;">
                                <a href="#">Detail</a>
                            </div>
                        </div>
                        </td>
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

<%@ include file="../footer.jsp" %>
</body>
</html>
