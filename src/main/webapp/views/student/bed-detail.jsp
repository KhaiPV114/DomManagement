<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="header.jsp" %>
<body>
<%@ include file="navbar.jsp" %>
<div id="content-body" class="content-body pl-328">
    <div class="container-fluid my-container">
        <h1 class="big-title">View by Dom A</h1>
        <form action="/Student/ViewBed/ViewByDom" method="get">
            <div>
                <input id="domId" name="domId" type="hidden" value="A">
                <div class="flex flex-wrap" style="gap: 24px;">
                    <div class="">
                        <div class="my-select">
                            <label for="Month" class="SAB-label">
                                Term
                            </label>
                            <select class="form-control" id="Term" name="Term"
                                    style="max-width: 100%;  min-height: 44px;">
                                <option value="1">1</option>
                                <option selected="selected" value="2">2</option>
                                <option value="3">3</option>
                            </select>
                        </div>
                    </div>
                    <div class="">
                        <div class="my-select">
                            <label for="Month" class="SAB-label">
                                Year
                            </label>
                            <select class="form-control" id="Year" name="Year"
                                    style="max-width: 100%;  min-height: 44px;">
                                <option value="0">All</option>
                                <option value="2025">2025</option>
                                <option selected="selected" value="2024">2024</option>
                                <option value="2023">2023</option>
                                <option value="2022">2022</option>
                                <option value="2021">2021</option>
                                <option value="2020">2020</option>
                                <option value="2019">2019</option>
                            </select>
                        </div>
                    </div>
                    <div class="flex items-end">
                        <button type="submit" style="" class="orange-btn">
                            Search
                        </button>
                    </div>
                </div>
            </div>
        </form>
        <div>
            <h3 style="color: var(--blue-color);" class="text-bold"> Summary: Dom A at term Summer-2024</h3>
            <h4 class="SAB-msg">Gender: Male only</h4>
            <div class="container-block">
                <table class="table table-striped table-bordered table-advance table-hover">
                    <thead>
                    <tr>
                        <th>Floor</th>
                        <th>Free</th>
                        <th>Used</th>
                        <th>Sum</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>77</td>
                        <td>25</td>
                        <td>102</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>77</td>
                        <td>55</td>
                        <td>132</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>78</td>
                        <td>66</td>
                        <td>144</td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>98</td>
                        <td>46</td>
                        <td>144</td>
                    </tr>
                    <tr>
                        <td>5</td>
                        <td>51</td>
                        <td>33</td>
                        <td>84</td>
                    </tr>
                    <tr>
                        <td>All</td>
                        <td>381</td>
                        <td>225</td>
                        <td>606</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div>
            <h4 class="SAB-msg">Detail in term Summer-2024 with gender Male only.
                <i class="SAB-msg"> Query time: 02/07/2024 14:09:04</i>
            </h4>
            <div class="container-block">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-advance table-hover">
                        <thead>
                        <tr>
                            <th>RoomName</th>
                            <th>Total Bed</th>
                            <th>Free Bed</th>
                            <th>Used Bed</th>
                            <th>Booking Bed</th>
                            <th>Price Per Month</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>A101</td>
                            <td>12</td>
                            <td>5 (Bed No:4,5,6,9,12)</td>
                            <td>7 (Bed No:1,2,3,7,8,10,11)</td>
                            <td>0</td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>A102</td>
                            <td>6</td>
                            <td>6 (Bed No:1,2,3,4,5,6)</td>
                            <td>0</td>
                            <td>0</td>
                            <td></td>
                        </tr>

                        </tbody>
                        <thead>
                        <tr>
                            <th>All</th>
                            <th>606</th>
                            <th>381</th>
                            <th>225</th>
                            <th>0</th>
                            <th></th>
                        </tr>
                        </thead>

                    </table>
                </div>
            </div>
            <button onclick="location.href='/Student/ViewBed?Term=2%7C2024';return false;" class="SAB-back"
                    style="margin-top: 24px;">Back to list</button>
        </div>
    </div>
</div>

<%@ include file="footer.jsp" %>
</body>
</html>
