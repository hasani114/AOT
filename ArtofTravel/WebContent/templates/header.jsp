<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.sql.*" %>
     <%@ page import="javax.servlet.http.HttpSession" %>
     <%@ page import="java.io.PrintWriter" %>
       <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     
    
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
     <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
        
        
        
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
   <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.css" />   
   <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/src/main.css" />   
  <script type="text/javascript" src="${pageContext.request.contextPath}/src/test.js"></script>
   
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
  
  
  <body>
 <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark ">
  <a class="navbar-brand" href="#">    <img src="https://artoftravel.com.pk/wp-content/uploads/2017/08/n.png" width="150" height="auto" class="d-inline-block align-top" alt="">
  </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav  ml-auto mr-5">
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/index.jsp">Home</a>
      </li>
    
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/TourController?viewAll">Experiences</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/about-us.jsp">About Us</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/about-us.jsp">Destinations</a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/gallery.jsp">Gallery</a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/blog.jsp">Blog</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/contact-us.jsp">Contact Us</a>
      </li>
      
      <li class="nav-item dropdown">
    <% if (session.getAttribute("UserID") != null ) {
    %>
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    	${Name} ${UserID}
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <a class="dropdown-item" href="${pageContext.request.contextPath}/Users/profile.jsp">My Profile</a>
                  <a class="dropdown-item" href="${pageContext.request.contextPath}/ReservationController?mybookings">My Reservations</a>
        
        <c:if test = "${Email=='hasan114@gmail.com'}">
         
         
         
                  <div class="dropdown-divider"></div>
        
          <a class="dropdown-item" href="${pageContext.request.contextPath}/Admin/addtour.jsp">Add Tour</a>
          <a class="dropdown-item" href="${pageContext.request.contextPath}/Admin/viewtours.jsp">View Tours</a>
          <a class="dropdown-item" href="${pageContext.request.contextPath}/Admin/UserController?viewUsers">Registered Users</a>
          <a class="dropdown-item" href="${pageContext.request.contextPath}/Admin/reservations.jsp">Reservations</a>
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/ReservationController?viewAll">Reservations JSTL</a>
          <a class="dropdown-item" href="${pageContext.request.contextPath}/TourController?admintours">Tours JSTL</a>
          
                </c:if>
          
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href= "${pageContext.request.contextPath}/logout.jsp">Log Out</a>
        </div>
      </li>
     <% } else {%>
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/Login.jsp">Sign In</a>
      </li>
      <% } %>
     
    </ul>
   
  </div>
</nav>


