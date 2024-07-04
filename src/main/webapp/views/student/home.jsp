<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 02/07/2024
  Time: 8:54 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="../header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <div class="row">
        </div>
        <div class="mt-60">
            <h1 class="big-title"></h1>
            <div id="StudentHome">
                <div class="SHome-left flex-1">
                    <div class="Shome-news-header">News</div>
                    <div class="Shome-list-news">
                        <div class="Shome-list-news-inner">
                            <div class="Shome-news-item flex-1">
                                <a href="/Student/News/Details/2022" class="text-16">TB. về việc cắt điện ngày
                                    11/05/2024</a>
                                <p class="Shome-news-date">By huongct12 10/05/2024 22:56</p>
                            </div>
                            <div class="Shome-news-item flex-1">
                                <a href="/Student/News/Details/2021" class="text-16">THÔNG BÁO VỀ VIỆC ĐĂNG KÝ/HỦY
                                    PHÒNG KTX KỲ SUMMER 2024</a>
                                <p class="Shome-news-date">By huongct12 11/04/2024 06:04</p>
                            </div>
                            <div class="Shome-news-item flex-1">
                                <a href="/Student/News/Details/2020" class="text-16">THÔNG BÁO V/V PHUN THUỐC DIỆT
                                    MUỖI, CÔN TRÙNG PHÒNG CHỐNG BỆNH DỊCH LẦN 1 NĂM 2024</a>
                                <p class="Shome-news-date">By huongct12 27/02/2024 13:33</p>
                            </div>
                            <div class="Shome-news-item flex-1">
                                <a href="/Student/News/Details/2019" class="text-16">THÔNG TIN Y TẾ - PHÒNG CHỐNG
                                    DỊCH BỆNH MÙA ĐÔNG XUÂN</a>
                                <p class="Shome-news-date">By huongct12 25/01/2024 15:24</p>
                            </div>
                            <div class="Shome-news-item flex-1">
                                <a href="/Student/News/Details/1019" class="text-16">THÔNG BÁO V/V GIA HẠN ĐĂNG KÝ
                                    KTX KỲ SPRING 2024</a>
                                <p class="Shome-news-date">By huongct12 28/12/2023 10:44</p>
                            </div>
                            <div class="Shome-news-item flex-1">
                                <a href="/Student/News/Details/1018" class="text-16">THÔNG BÁO VỀ VIỆC ĐĂNG KÝ KTX
                                    KỲ SPRING 2024</a>
                                <p class="Shome-news-date">By huongct12 26/12/2023 02:00</p>
                            </div>
                            <div class="Shome-news-item flex-1">
                                <a href="/Student/News/Details/1017" class="text-16">THÔNG BÁO V/V MẤT ĐIỆN NGÀY
                                    26/11 VÀ 30/11/2023</a>
                                <p class="Shome-news-date">By huongct12 26/11/2023 08:15</p>
                            </div>
                            <div class="Shome-news-item flex-1">
                                <a href="/Student/News/Details/1016" class="text-16">TB. V/v thực hiện đăng ký tạm
                                    trú đối với sinh viên lưu trú KTX</a>
                                <p class="Shome-news-date">By huongct12 09/11/2023 17:11</p>
                            </div>
                            <div class="Shome-news-item flex-1">
                                <a href="/Student/News/Details/1014" class="text-16">THÔNG BÁO V/V DỊCH CHUYỂN PHÒNG
                                    Y TẾ</a>
                                <p class="Shome-news-date">By huongct12 02/11/2023 15:56</p>
                            </div>
                            <div class="Shome-news-item flex-1">
                                <a href="/Student/News/Details/15" class="text-16">T.B V/v Tập huấn phương án PCCC
                                    và cứu nạn cứu hộ tại KTX</a>
                                <p class="Shome-news-date">By huongct12 21/10/2023 15:33</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="StudentHome-info" class="flex flex-wrap gap-24">
                    <div class="SHome-right flex-1">
                        <div class="SHome-personal-info">
                            Personal information
                        </div>
                        <div class="Shome-info-container">
                            <div class="Shome-info-avatar">
                                <div
                                        style="width: 120px; height: 120px; background-color: var(--orange-color); border-radius: 100%;">
<%--                                    <img src="<%=googleUser.getPicture()%>"--%>
<%--                                         height="312" width="235" class="img-thumbnail">--%>
                                </div>
                            </div>
                            <div class="Shone-info">
                                <p
                                        style="font-weight: bold; font-size: 18px; line-height: 150%; color: var(--blue-color)">
<%--                                    <%= googleUser.getName()%>--%>
                                </p>
                                <p>
                                    <span class="text-gray"> 11/04/2003 - </span>
                                    <span class="text-gray">Male</span>
                                </p>
                                <p class="text-gray"><span style="color: var(--blue-color); font-weight: bold;">CFD
                                            score:</span> 100</p>
                                <p class="text-gray">
                                    <span style="color: var(--blue-color); font-weight: bold;">Bed:</span>
                                    <span>N/A</span>
                                </p>
                                <p class="text-gray"><span
                                        style="color: var(--blue-color); font-weight: bold;">Balance:</span> 0 VND
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="SHome-right flex-1">
                        <div class="SHome-personal-info">
                            Contact
                        </div>
                        <div class="Shome-info-container">
                            <div class="Shone-info">
                                <a class="text-blue" href="tel:02466805913">
                                    <b>Security room:</b> <span class="text-gray">(024) 6680 5 913</span>
                                </a>
                                <a class="text-blue" href="tel:02466805917">
                                    <b>Health station:</b> <span class="text-gray">(024) 6680 5 917</span>
                                </a>
                                <a class="text-blue" href="tel:02473081313">
                                    <b>Dormitory management:</b> <span class="text-gray">(024) 7308 1313 </span>
                                    <br><i>(Office hours)</i>
                                </a>
                                <a href="mailto:ktx@fpt.edu.vn" class="text-blue">
                                    <b>Email:</b>
                                    <span class="text-gray">ktx@fpt.edu.vn</span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <p class="text-green" style="padding-top: 24px; font-size: 12px;">
                Our design display best with 1920*1024 screen. For a better experience, you can resize your screen
                size to 80% or 90% of the original!
            </p>
            <form method="post" action="Student/Home/TryNewVersion">

                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                     aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Confirm to try new version</h5>
                            </div>
                            <div class="modal-body">
                                <h3>Try to make it easier to use and faster.</h3>
                                <br>
                                <br>
                                The system may not operate stably.
                                System error please contact IT OCD: <a
                                    href="mailto:duongnt115@fe.edu.vn">Duongnt115@fe.edu.vn</a> for help.
                            </div>
                            <div class="modal-footer">
                                <button onclick="$('#exampleModal').modal('hide');" type="button"
                                        class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                <button type="submit" class="btn btn-primary">Try now</button>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<%@ include file="../footer.jsp" %>
</body>
</html>
