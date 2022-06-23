<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Trang chủ</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap styles -->

    <link href="<c:url value ="/template/assets/user/css/bootstrap.css"></c:url>" rel="stylesheet" />
    <!-- Customize styles -->
    <link href="style.css" rel="stylesheet"/>
    <link href="<c:url value ="/template/assets/user/style.css"></c:url>" rel="stylesheet" />
    <!-- font awesome styles -->

    <link href="<c:url value ="/template/assets/user/font-awesome/css/font-awesome.css"></c:url>" rel="stylesheet" />

    <!-- Favicons -->

    <link href="<c:url value ="/template/assets/user/ico/favicon.ico"></c:url>" rel="shortcut icon" />
</head>
<body>
<!--
	Upper Header Section
-->
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="topNav">
        <div class="container">
            <div class="alignR">
                <div class="pull-left socialNw">
                    <a href="#"><span class="icon-twitter"></span></a>
                    <a href="#"><span class="icon-facebook"></span></a>
                    <a href="#"><span class="icon-youtube"></span></a>
                    <a href="#"><span class="icon-tumblr"></span></a>
                </div>
                <a class="active" href="index.html"> <span class="icon-home"></span> Home</a>
                <a href="#"><span class="icon-user"></span> My Account</a>
                <a href="register.html"><span class="icon-edit"></span> Free Register </a>
                <a href="contact.html"><span class="icon-envelope"></span> Contact us</a>
                <a href="cart.html"><span class="icon-shopping-cart"></span> 2 Item(s) - <span class="badge badge-warning"> $448.42</span></a>
            </div>
        </div>
    </div>
</div>

<!--
Lower Header Section
-->
<div class="container">
    <div id="gototop"> </div>




    <%@include file="/WEB-INF/views/layouts/user/header.jsp"%>

    <decorator:body></decorator:body>

    <%@include file="/WEB-INF/views/layouts/user/footer.jsp"%>

</div>
<!-- /container -->

<div class="copyright">
    <div class="container">
        <p class="pull-right">
            <a href="#"><img src="assets/img/maestro.png" alt="payment"></a>
            <a href="#"><img src="assets/img/mc.png" alt="payment"></a>
            <a href="#"><img src="assets/img/pp.png" alt="payment"></a>
            <a href="#"><img src="assets/img/visa.png" alt="payment"></a>
            <a href="#"><img src="assets/img/disc.png" alt="payment"></a>
        </p>
        <span>Copyright &copy; 2013<br> bootstrap ecommerce shopping template</span>
    </div>
</div>
<a href="#" class="gotop"><i class="icon-double-angle-up"></i></a>
<!-- Placed at the end of the document so the pages load faster -->

<script src="<c:url value ="/template/assets/user/js/jquery.js"></c:url>"></script>

<script src="<c:url value ="/template/assets/user/js/bootstrap.min.js"></c:url>"></script>

<script src="<c:url value ="/template/assets/user/js/jquery.easing-1.3.min.js"></c:url>"></script>

<script src="<c:url value ="/template/assets/user/js/jquery.scrollTo-1.4.3.1-min.js"></c:url>"></script>

<script src="<c:url value ="/template/assets/user/js/shop.js"></c:url>"></script>
</body>
</html>
