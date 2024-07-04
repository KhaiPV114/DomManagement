<%@ page import="Entity.GoogleUser" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="my-navbar">
    <div class="navbar-content flex justify-between items-center">
        <div class="flex items-center">
            <div id="navbar-menu-icon" class="hamburger" onclick="handleToggleSidebar()">
                <svg xmlns="http://www.w3.org/2000/svg" width="25" height="24" viewBox="0 0 25 24" fill="none">
                    <line x1="2" y1="2" x2="23" y2="2" stroke="white" stroke-width="4" stroke-linecap="round">
                    </line>
                    <line x1="2" y1="12" x2="23" y2="12" stroke="white" stroke-width="4" stroke-linecap="round">
                    </line>
                    <line x1="2" y1="22" x2="23" y2="22" stroke="white" stroke-width="4" stroke-linecap="round">
                    </line>
                </svg>
            </div>
            <a href="/Student" class="logo">
                <img src="https://ocd.fpt.edu.vn/Content/images/landing/logo.png" alt="logo">
            </a>
        </div>
        <div class="campus">
            <p>
                Hòa Lạc
            </p>
        </div>
    </div>
</div>
<div id="sidebar-full" class="sidebar-full">
    <div class="sidebar-top">
        <div class="sidebar-infoUser flex">
            <div class="sidebar-avatar">
                <img src="https://ocd.fpt.edu.vn/Content/images/FrogSleep.png" alt="avatar-user">
            </div>
            <div class="">
                <p class="sidebar-name" style="margin-bottom: 8px;">
<%--                    <%--%>
<%--                        HttpSession sessions = request.getSession();--%>
<%--                        GoogleUser googleUser = (GoogleUser) sessions.getAttribute("user");--%>
<%--                    %>--%>
<%--                    <%= googleUser.getRollName() %>--%>
                </p>
                <p class="sidebar-prestigeScore"><span class="sidebar-prestigeScore bold">Balance:</span> 0 VND</p>
                <p class="sidebar-prestigeScore"><span
<%--                        class="sidebar-prestigeScore bold">RollName:</span> <%= googleUser.getRollName().toUpperCase().replaceAll("^.*HE", "HE") %>--%>
                </p>
            </div>
        </div>
        <div id="sidebarLinkFull" class="sidebar-link">
            <a href="#"
               class="sidebar-linkItem flex items-center sidebar-linkItem-active sidebar-icon-active">
                <div class="sidebar-linkIcon">
                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none">
                        <path d="M12 0L0 8V24H7.5V14.6667H16.5V24H24V8L12 0Z" fill="#034EA2"></path>
                    </svg>
                </div>
                <p>Home</p>
            </a>
            <a href="#" class="sidebar-linkItem flex items-center">
                <div class="sidebar-linkIcon">
                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none">
                        <path
                                d="M12 24C13.65 24 15 22.8923 15 21.5385H9C9 22.8923 10.335 24 12 24ZM21 16.6154V10.4615C21 6.68308 18.54 3.52 14.25 2.68308V1.84615C14.25 0.824615 13.245 0 12 0C10.755 0 9.75 0.824615 9.75 1.84615V2.68308C5.445 3.52 3 6.67077 3 10.4615V16.6154L0 19.0769V20.3077H24V19.0769L21 16.6154Z"
                                fill="#034EA2"></path>
                    </svg>
                </div>
                <p>News</p>
            </a>
            <a href="<%=request.getContextPath()%>/student/choose-room" class="sidebar-linkItem flex items-center">
                <div class="sidebar-linkIcon">
                    <svg xmlns="http://www.w3.org/2000/svg" width="20" height="23" viewBox="0 0 20 23" fill="none">
                        <path
                                d="M1.3725 2H0.8525C0.381677 2 0 2.38168 0 2.8525V21.0117C0 21.4825 0.381677 21.8642 0.8525 21.8642H1.3725C1.84332 21.8642 2.225 21.4825 2.225 21.0117V2.8525C2.225 2.38168 1.84332 2 1.3725 2Z"
                                fill="#034EA2"></path>
                        <path
                                d="M19.1124 4.85352H18.6624C18.1722 4.85352 17.7749 5.25086 17.7749 5.74102V20.9768C17.7749 21.467 18.1722 21.8643 18.6624 21.8643H19.1124C19.6026 21.8643 19.9999 21.467 19.9999 20.9768V5.74102C19.9999 5.25086 19.6026 4.85352 19.1124 4.85352Z"
                                fill="#034EA2"></path>
                        <path
                                d="M8.98657 1.86426H16.0024C17.0626 1.86426 18.0794 2.28542 18.8291 3.0351C19.5787 3.78477 19.9999 4.80156 19.9999 5.86176V8.20676C19.9999 8.52811 19.8722 8.8363 19.645 9.06354C19.4178 9.29077 19.1096 9.41842 18.7882 9.41842H8.98657C8.66521 9.41842 8.35702 9.29077 8.12979 9.06354C7.90256 8.8363 7.7749 8.52811 7.7749 8.20676V3.07593C7.7749 2.75457 7.90256 2.44638 8.12979 2.21915C8.35702 1.99192 8.66521 1.86426 8.98657 1.86426Z"
                                fill="#034EA2"></path>
                        <path
                                d="M9.76831 11.8374H16.7837C17.6364 11.8374 18.4543 12.176 19.0574 12.7788C19.6605 13.3816 19.9995 14.1993 20 15.052V17.397C20 17.9255 19.79 18.4324 19.4163 18.8062C19.0425 19.1799 18.5356 19.3899 18.0071 19.3899H9.76831C9.23975 19.3899 8.73285 19.1799 8.3591 18.8062C7.98536 18.4324 7.77539 17.9255 7.77539 17.397V13.8303C7.77539 13.5686 7.82694 13.3095 7.92709 13.0677C8.02725 12.8259 8.17404 12.6062 8.3591 12.4211C8.54416 12.2361 8.76386 12.0893 9.00565 11.9891C9.24744 11.889 9.50659 11.8374 9.76831 11.8374Z"
                                fill="#034EA2"></path>
                        <path
                                d="M18.6064 8.56573V7.79781C18.6064 7.32699 18.2248 6.94531 17.7539 6.94531L1.58603 6.94531C1.11521 6.94531 0.73353 7.32699 0.73353 7.79781V8.56573C0.73353 9.03655 1.11521 9.41823 1.58603 9.41823H17.7539C18.2248 9.41823 18.6064 9.03655 18.6064 8.56573Z"
                                fill="#034EA2"></path>
                        <path
                                d="M18.6064 18.5389V17.771C18.6064 17.3001 18.2248 16.9185 17.7539 16.9185H1.58603C1.11521 16.9185 0.733528 17.3001 0.733528 17.771V18.5389C0.733528 19.0097 1.11521 19.3914 1.58603 19.3914H17.7539C18.2248 19.3914 18.6064 19.0097 18.6064 18.5389Z"
                                fill="#034EA2"></path>
                        <path
                                d="M4.92657 6.02176C5.95957 6.02176 6.79699 5.09107 6.79699 3.94301C6.79699 2.79495 5.95957 1.86426 4.92657 1.86426C3.89357 1.86426 3.05615 2.79495 3.05615 3.94301C3.05615 5.09107 3.89357 6.02176 4.92657 6.02176Z"
                                fill="#034EA2"></path>
                        <path
                                d="M4.92657 15.9949C5.95957 15.9949 6.79699 15.0642 6.79699 13.9162C6.79699 12.7681 5.95957 11.8374 4.92657 11.8374C3.89357 11.8374 3.05615 12.7681 3.05615 13.9162C3.05615 15.0642 3.89357 15.9949 4.92657 15.9949Z"
                                fill="#034EA2"></path>
                    </svg>
                </div>
                <p>Booking bed</p>
            </a>
            <a href="<%=request.getContextPath()%>/student/dom" class="sidebar-linkItem flex items-center">
                <div class="sidebar-linkIcon">
                    <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 20 20" fill="none">
                        <path d="M10 0C4.47708 0 0 4.47708 0 10C0 15.5229 4.47708 20 10 20C15.5229 20 20 15.5229 20 10C20 4.47708 15.5225 0 10 0ZM10.9921 14.9521C10.9921 15.0824 10.9664 15.2115 10.9163 15.3319C10.8663 15.4522 10.7929 15.5615 10.7004 15.6533C10.6086 15.7458 10.4993 15.8192 10.3789 15.8692C10.2586 15.9193 10.1295 15.9451 9.99917 15.945C9.73608 15.9449 9.48381 15.8403 9.29778 15.6543C9.11175 15.4683 9.00719 15.216 9.00708 14.9529V8.9475C9.00705 8.81709 9.0328 8.68796 9.08285 8.56754C9.13291 8.44712 9.20628 8.33779 9.29875 8.24583C9.39067 8.15343 9.49994 8.0801 9.62028 8.03005C9.74062 7.98 9.86967 7.95421 10 7.95417C10.1303 7.95411 10.2593 7.97973 10.3797 8.02957C10.5001 8.07941 10.6095 8.15248 10.7016 8.24462C10.7938 8.33675 10.8668 8.44614 10.9167 8.56653C10.9665 8.68692 10.9921 8.81595 10.9921 8.94625V14.9521ZM10 6.9975C9.72992 6.9975 9.4709 6.89021 9.27993 6.69924C9.08895 6.50826 8.98167 6.24925 8.98167 5.97917C8.98167 5.84544 9.00801 5.71302 9.05918 5.58947C9.11036 5.46592 9.18537 5.35366 9.27993 5.25909C9.37449 5.16453 9.48675 5.08953 9.6103 5.03835C9.73385 4.98717 9.86627 4.96084 10 4.96084C10.1337 4.96084 10.2661 4.98717 10.3897 5.03835C10.5132 5.08953 10.6255 5.16453 10.7201 5.25909C10.8146 5.35366 10.8896 5.46592 10.9408 5.58947C10.992 5.71302 11.0183 5.84544 11.0183 5.97917C11.0183 6.24925 10.911 6.50826 10.7201 6.69924C10.5291 6.89021 10.2701 6.9975 10 6.9975Z" fill="#034EA2"></path>
                    </svg>
                </div>
                <p>Available beds</p>
            </a>
            <a href="<%=request.getContextPath()%>/student/invoice-detail" class="sidebar-linkItem flex items-center">
                <div class="sidebar-linkIcon">
                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none">
                        <g clip-path="url(#clip0_1275_37006)">
                            <path
                                    d="M22.1856 11.4446C22.1856 15.6807 17.6262 19.1143 12.0013 19.1143C6.37646 19.1143 1.81543 15.6807 1.81543 11.4446C1.81543 10.9501 1.87756 10.4676 1.99764 10.001H22.0059C22.1234 10.4676 22.1856 10.9501 22.1856 11.4446Z"
                                    fill="#034EA2"></path>
                            <path
                                    d="M22.1015 7.14111H1.89847C0.849736 7.14111 0 7.78105 0 8.57084C0 9.36064 0.849736 10.0006 1.89847 10.0006H22.1015C23.1503 10.0006 24 9.36064 24 8.57084C24 7.78105 23.1503 7.14111 22.1015 7.14111Z"
                                    fill="#034EA2"></path>
                            <path
                                    d="M5.7985 0C4.6658 0 3.74805 0.691152 3.74805 1.54419V5.9238H7.84895V1.54419C7.84895 0.691152 6.93036 0 5.7985 0Z"
                                    fill="#034EA2"></path>
                            <path
                                    d="M12.0005 24C13.1332 24 14.051 23.3088 14.051 22.4558V18.866C14.051 18.4297 13.5816 18.0762 13.0022 18.0762H10.998C10.4186 18.0762 9.94922 18.4297 9.94922 18.866V22.4558C9.95006 23.3088 10.8678 24 12.0005 24Z"
                                    fill="#034EA2"></path>
                            <path
                                    d="M18.2018 0C17.0691 0 16.1514 0.691152 16.1514 1.54419V5.9238H20.2523V1.54419C20.2523 0.691152 19.3337 0 18.2018 0Z"
                                    fill="#034EA2"></path>
                        </g>
                        <defs>
                            <clipPath id="clip0_1275_37006">
                                <rect width="24" height="24" fill="white"></rect>
                            </clipPath>
                        </defs>
                    </svg>
                </div>
                <p>Electricity water usage</p>
            </a>
            <a href="<%=request.getContextPath()%>/student/payment-history" class="sidebar-linkItem flex items-center">
                <div class="sidebar-linkIcon">
                    <svg class="sidebar-icon" xmlns="http://www.w3.org/2000/svg" width="20" height="20"
                         viewBox="0 0 20 20" fill="none">
                        <path
                                d="M10 0C4.48 0 0 4.48 0 10C0 15.52 4.48 20 10 20C15.52 20 20 15.52 20 10C20 4.48 15.52 0 10 0ZM11.41 16.09V18H8.74V16.07C7.03 15.71 5.58 14.61 5.47 12.67H7.43C7.53 13.72 8.25 14.54 10.08 14.54C12.04 14.54 12.48 13.56 12.48 12.95C12.48 12.12 12.04 11.34 9.81 10.81C7.33 10.21 5.63 9.19 5.63 7.14C5.63 5.42 7.02 4.3 8.74 3.93V2H11.41V3.95C13.27 4.4 14.2 5.81 14.26 7.34H12.3C12.25 6.23 11.66 5.47 10.08 5.47C8.58 5.47 7.68 6.15 7.68 7.11C7.68 7.95 8.33 8.5 10.35 9.02C12.37 9.54 14.53 10.41 14.53 12.93C14.52 14.76 13.15 15.76 11.41 16.09Z"
                                fill="#034EA2"></path>
                    </svg>
                </div>
                <p>Payment history</p>
            </a>
            <a href="<%=request.getContextPath()%>/student/resident-history" class="sidebar-linkItem flex items-center">
                <div class="sidebar-linkIcon">
                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="25" viewBox="0 0 24 25" fill="none">
                        <path
                                d="M22.0645 12.7296C22.0645 7.20651 17.6675 2.729 12.2443 2.729C8.82962 2.729 5.82208 4.5033 4.06248 7.19644C3.90353 7.4399 3.7548 7.69091 3.61628 7.94948C3.55907 8.18903 3.56348 8.43916 3.6291 8.67654C3.69472 8.91393 3.81941 9.13081 3.99154 9.30696C4.12166 9.44058 4.27723 9.54678 4.44906 9.61929C4.6209 9.6918 4.80552 9.72916 4.99202 9.72916C5.17853 9.72916 5.36315 9.6918 5.53498 9.61929C5.70682 9.54678 5.86238 9.44058 5.9925 9.30696L6.20952 9.08575C6.80588 8.06185 7.64849 7.20308 8.66088 6.58738C9.74087 5.93118 10.9806 5.58484 12.2443 5.58626C16.1182 5.58626 19.2588 8.78437 19.2588 12.7296C19.2588 16.6749 16.1182 19.8747 12.2443 19.8747C10.5595 19.8751 8.93247 19.2603 7.669 18.1457C6.69038 17.2865 5.96473 16.1765 5.57023 14.9354L3.09662 14.2605C2.91377 14.2094 2.71918 14.22 2.54297 14.2907C2.88888 16.5501 3.99582 18.6238 5.68063 20.1685C7.46946 21.8158 9.81255 22.7298 12.2443 22.729C17.6675 22.729 22.0645 18.2523 22.0645 12.7296Z"
                                fill="#034EA2"></path>
                        <path
                                d="M8.24818 15.6823L5.59408 14.9587L3.12047 14.2833C2.93762 14.2322 2.74303 14.2428 2.56682 14.3135C2.36136 14.3971 2.19353 14.5529 2.09489 14.7515C1.99625 14.9502 1.97361 15.1781 2.03121 15.3923L3.40548 20.614C3.44337 20.7665 3.52123 20.9061 3.63104 21.0185C3.74084 21.1308 3.87862 21.2119 4.03017 21.2533C4.18173 21.2947 4.34158 21.2949 4.49326 21.254C4.64494 21.213 4.78295 21.1324 4.89309 21.0203L5.70489 20.1934L7.69285 18.1685L8.64695 17.1972C9.13092 16.7048 8.90929 15.8632 8.24818 15.6823Z"
                                fill="#034EA2"></path>
                        <path
                                d="M11.849 8.82812H11.478C11.0549 8.82812 10.7119 9.1711 10.7119 9.59418V13.6028C10.7119 14.0259 11.0549 14.3689 11.478 14.3689H11.849C12.2721 14.3689 12.6151 14.0259 12.6151 13.6028V9.59418C12.6151 9.1711 12.2721 8.82812 11.849 8.82812Z"
                                fill="#034EA2"></path>
                        <path
                                d="M17.104 13.6137V13.2355C17.104 12.8047 16.7548 12.4556 16.3241 12.4556H11.4915C11.0608 12.4556 10.7116 12.8047 10.7116 13.2355V13.6137C10.7116 14.0444 11.0608 14.3936 11.4915 14.3936H16.3241C16.7548 14.3936 17.104 14.0444 17.104 13.6137Z"
                                fill="#034EA2"></path>
                    </svg>
                </div>
                <p>Resident history</p>
            </a>
            <a href="<%=request.getContextPath()%>/student/create-request" class="sidebar-linkItem flex items-center">
                <div class="sidebar-linkIcon">
                    <svg class="sidebar-icon" xmlns="http://www.w3.org/2000/svg" width="16" height="20"
                         viewBox="0 0 16 20" fill="none">
                        <path
                                d="M10 0H2C0.9 0 0.0100002 0.9 0.0100002 2L0 18C0 19.1 0.89 20 1.99 20H14C15.1 20 16 19.1 16 18V6L10 0ZM12 14H9V17H7V14H4V12H7V9H9V12H12V14ZM9 7V1.5L14.5 7H9Z"
                                fill="#034EA2"></path>
                    </svg>
                </div>
                <p>My request</p>
            </a>
        </div>
    </div>
    <div class="sidebar-bottom">
        <div class="flex justify-center">
            <a class="btn-logout" href="/Home/Logout?type=Google">Logout</a>
        </div>
    </div>
</div>


