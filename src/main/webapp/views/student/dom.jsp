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
                        <tr>
                            <td>Dom A</td>
                            <td>A</td>
                            <td>606</td>
                            <td>225</td>
                            <td>381</td>
                            <td>
                                <div class="flex justify-center">
                                    <div class="btn-action" style="width: fit-content;">
                                        <a
                                                href="/Student/ViewBed/ViewByDom?domID=A&amp;Term=2&amp;Year=2024">Detail</a>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>Dom B</td>
                            <td>B</td>
                            <td>108</td>
                            <td>3</td>
                            <td>105</td>
                            <td>
                                <div class="flex justify-center">
                                    <div class="btn-action" style="width: fit-content;">
                                        <a
                                                href="/Student/ViewBed/ViewByDom?domID=B&amp;Term=2&amp;Year=2024">Detail</a>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>Dom C</td>
                            <td>C</td>
                            <td>313</td>
                            <td>217</td>
                            <td>96</td>
                            <td>
                                <div class="flex justify-center">
                                    <div class="btn-action" style="width: fit-content;">
                                        <a
                                                href="/Student/ViewBed/ViewByDom?domID=C&amp;Term=2&amp;Year=2024">Detail</a>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>Dom D</td>
                            <td>D</td>
                            <td>455</td>
                            <td>326</td>
                            <td>129</td>
                            <td>
                                <div class="flex justify-center">
                                    <div class="btn-action" style="width: fit-content;">
                                        <a
                                                href="/Student/ViewBed/ViewByDom?domID=D&amp;Term=2&amp;Year=2024">Detail</a>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>Dom E</td>
                            <td>E</td>
                            <td>0</td>
                            <td>0</td>
                            <td>0</td>
                            <td>
                                <div class="flex justify-center">
                                    <div class="btn-action" style="width: fit-content;">
                                        <a
                                                href="/Student/ViewBed/ViewByDom?domID=E&amp;Term=2&amp;Year=2024">Detail</a>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>Dom F</td>
                            <td>F</td>
                            <td>424</td>
                            <td>279</td>
                            <td>145</td>
                            <td>
                                <div class="flex justify-center">
                                    <div class="btn-action" style="width: fit-content;">
                                        <a
                                                href="/Student/ViewBed/ViewByDom?domID=F&amp;Term=2&amp;Year=2024">Detail</a>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>Dom H</td>
                            <td>H</td>
                            <td>416</td>
                            <td>306</td>
                            <td>110</td>
                            <td>
                                <div class="flex justify-center">
                                    <div class="btn-action" style="width: fit-content;">
                                        <a
                                                href="/Student/ViewBed/ViewByDom?domID=H&amp;Term=2&amp;Year=2024">Detail</a>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        </tbody>
                        <thead>
                        <tr>
                            <th>Total</th>
                            <th></th>
                            <th>2322</th>
                            <th>1356</th>
                            <th>966</th>
                            <th>
                            </th>
                        </tr>
                        </thead>

                    </table>
                </div>
            </div>
            <div class="mt-24 SN-back">
                <a onclick="history.back()" class="" style="cursor: pointer;">Back to list</a>
            </div>
        </div>
    </div>
</div>
<%@ include file="../footer.jsp" %>
</body>
</html>
