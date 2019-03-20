 <%@ include file = "/templates/header.jsp" %>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 

<div class=container>
<div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="${tour.tourBanner }" alt="First slide">
    </div>
    </div>
 
<H1>${tour.tourName}</H1>
<p>
<b>Location:</b> ${tour.tourLocation} </br>
<b>Country:</b> ${tour.country}</br>
<b>Group Size:</b> ${tour.groupSize}</br>
<b>Price:</b> ${tour.tourPrice}</br>
<b>Duration:</b> ${tour.tourDuration}</br>
<b>Available Seats:</b> ${tour.availableSeats}</br>
<b>Date:</b> ${tour.tourDate}</br>
</p>


<p>${tour.tourDescription}</p>


 
<a href="/ArtofTravel/reserve.jsp?tourid=${tour.tourID}&userid=${sessionScope.UserID}">Reserve</a>
 
 
 
 
 
 
 
 </div>
 
 
 <%@ include file = "templates/footer.jsp" %>