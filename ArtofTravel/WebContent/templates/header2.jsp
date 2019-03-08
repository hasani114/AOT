<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.sql.*" %>
     <%@ page import="javax.servlet.http.HttpSession" %>
     <%@ page import="java.io.PrintWriter" %>
    
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

<!-- LOAD JQUERY LIBRARY -->
		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.js"></script>
		


<!-- LOADING FONTS AND ICONS -->
		<link href="http://fonts.googleapis.com/css?family=Roboto:300,400,500" rel="stylesheet" property="stylesheet" type="text/css" media="all" />
		
		<link rel="stylesheet" type="text/css" href="src/css/pe-icon-7-stroke.css">
		<link rel="stylesheet" type="text/css" href="src/css/font-awesome.min.css">
		
		<!-- REVOLUTION STYLE SHEETS -->
		<link rel="stylesheet" type="text/css" href="src/css/settings.css">
		<!-- REVOLUTION LAYERS STYLES -->
		<link rel="stylesheet" type="text/css" href="src/css/layers.css">
			
		<!-- REVOLUTION NAVIGATION STYLES -->
		<link rel="stylesheet" type="text/css" href="src/css/navigation.css">
		
		<link rel="stylesheet" type="text/css" href="src/css/noneed.css">
		
		<!-- REVOLUTION JS FILES -->
		<script type="text/javascript" src="src/js/jquery.themepunch.tools.min.js"></script>
		<script type="text/javascript" src="src/js/jquery.themepunch.revolution.min.js"></script>

		<!-- SLIDER REVOLUTION 5.0 EXTENSIONS  (Load Extensions only on Local File Systems !  The following part can be removed on Server for On Demand Loading) -->	
		<script type="text/javascript" src="src/js/extensions/revolution.extension.actions.min.js"></script>
		<script type="text/javascript" src="src/js/extensions/revolution.extension.carousel.min.js"></script>
		<script type="text/javascript" src="src/js/extensions/revolution.extension.kenburn.min.js"></script>
		<script type="text/javascript" src="src/js/extensions/revolution.extension.layeranimation.min.js"></script>
		<script type="text/javascript" src="src/js/extensions/revolution.extension.migration.min.js"></script>
		<script type="text/javascript" src="src/js/extensions/revolution.extension.navigation.min.js"></script>
		<script type="text/javascript" src="src/js/extensions/revolution.extension.parallax.min.js"></script>
		<script type="text/javascript" src="src/js/extensions/revolution.extension.slideanims.min.js"></script>
		<script type="text/javascript" src="src/js/extensions/revolution.extension.video.min.js"></script>
	
    <title>Art of Travel</title>
  </head>
  
  
  
 <nav class="navbar sticky-top navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="/ArtofTravel/index.jsp">Home</a>
      </li>
    
      <li class="nav-item">
        <a class="nav-link" href="/ArtofTravel/viewtours.jsp">Upcoming Tours</a>
      </li>
    
      <li class="nav-item">
        <a class="nav-link" href="/ArtofTravel/Login.jsp">Sign In
        	</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/ArtofTravel/contact-us.jsp">Contact Us</a>
      </li>
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    	Admin
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="/ArtofTravel/Admin/addtour.jsp">Add Tour</a>
          <a class="dropdown-item" href="/ArtofTravel/Admin/viewtours.jsp">View Tours</a>
          <a class="dropdown-item" href="/ArtofTravel/UserController?viewUsers">Registered Users</a>
          
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="/ArtofTravel/logout.jsp">Log Out</a>
        </div>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="/ArtofTravel/contact-us.jsp"> ${Name}</a>
      </li>
     
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

  <body>
<div class=container  style="padding-top: 20px"></div>
