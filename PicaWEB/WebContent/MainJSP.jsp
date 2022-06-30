<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Carousel -->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- Carousel End -->

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body {
}

.main {
	color: #ffffff;
	text-align: center;
	padding-bottom: 100px;
	padding-top: 100px;
}

.nav-tabs li a {
	color: #777;
}

button {
	align-content: center;
}
.item img {width:100%; max-height:670px;display: block; white; opacity: 0.45;}
.caraous-title {
    position: absolute;
    top: 20%;
    left: 15.8%;
    right: auto;
    width: 96.66666666666666%;
    color: #000;
}
.caraous-title h1 {color:#000;font-size:55px; font-weight:700;}
.caraous-title h3 {margin-bottom:30px;color:#fff;font-size:24px;}
.caraous-title span {color:#aa1f43;font-size:20px;}
.caraous-img-box img {width:50%;}
/* Button */
.site-btn{padding:12px 25px 12px 25px;border-radius:2px;background:#DF314D;border-color:transparent;font-size:14px;}
.site-btn:hover{background:#C9223D ;border:transparent;}

</style>

</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Logo</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/PicaWEB/Main" method="get">HOME</a></li>
				<li><a href="/PicaWEB/Login" method="get">LOGIN</a></li>
				<li><a href="/PicaWEB/Registracija" method="get">SIGNUP</a></li>
				<li><a href="/PicaWEB/Contact" method="get">CONTACT</a></li>
			</ul>
		</div>
	</div>
	</nav>
	<div id="myCarousel" class="carousel slide" data-interval="false">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="item active">
      <img src="https://cdn2.atlantamagazine.com/wp-content/uploads/sites/4/2018/01/pizzaiolo010_courtesy.jpg" class="img-responsive">
      <div class="container">
        <div class="caraous-title">
            <div class="col-md-12">
                <div class="col-md-6">
                    <span>Non-Profit PIZZA Organization</span>
                    <h1>Small Effort <br> Make Big PIZZA </h1>
                    <h3>We are non-profit PIZZA Organization</h3>
                    <form action="/PicaWEB/Login" method="get">
			<button type="submit" class="btn btn-lg btn-info">NARUCI PICU</button>
		</form>
                </div>
                              
            </div>
        
        </div>
      </div>
    </div>
    <div class="item">
      <img src="https://cdn2.atlantamagazine.com/wp-content/uploads/sites/4/2018/01/pizzaiolo06_courtesy.jpg" class="img-responsive">
      <div class="container">
        <div class="caraous-title">
            <div class="col-md-12">
                <div class="col-md-6">
                    <span>Non-Profit PIZZA Organization</span>
                    <h1>Small Effort <br> Make Big PIZZA </h1>
                    <h3>We are non-profit PIZZA Organization</h3>
                      <form action="/PicaWEB/Login" method="get">
			<button type="submit" class="btn btn-lg btn-info">NARUCI PICU</button>
		</form>
                </div>
               
            </div>
        
        </div>
      </div>
    </div>
    <div class="item">
      <img src="https://cdn2.atlantamagazine.com/wp-content/uploads/sites/4/2018/01/pizzaiolo08_courtesy.jpg" class="img-responsive">
      <div class="container">
        <div class="caraous-title">
            <div class="col-md-12">
                <div class="col-md-6">
                    <span>Non-Profit PIZZA Organization</span>
                    <h1>Small Effort <br> Make Big PIZZA </h1>
                    <h3>We are non-profit PIZZA Organization</h3>
                      <form action="/PicaWEB/Login" method="get">
			<button type="submit" class="btn btn-lg btn-info">NARUCI PICU</button>
		</form>
                </div>
            </div>
        
        </div>
      </div>
    </div>
  </div>
  <!-- Controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="icon-prev"></span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="icon-next"></span>
  </a>  
</div> 
  
</body>
</html>
