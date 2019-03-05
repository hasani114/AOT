 <%@ include file = "/templates/header.jsp" %>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 


 <div class="container">
 
 <div class="" id=errors></div>

 <form action="TourController" name="search" style="padding-bottom:20px;" onsubmit="DisableNullFields()"> 
 <div class="form-row">
  <input type="hidden" class="form-control" name="searchform" value="">
 

 <div class="col">
 <input type="text" class="form-control" name="tourlocation" value="" placeholder="Location">
 </div>
 <div class="col">
 <input type="text" class="form-control" name="country" value="" placeholder="Country">
 </div>
   <div class="col">
<label for="customRange1">Price</label>
<input type="range" class="custom-range" name="tourprice" min="0" max="15000" value=${tourprice}> </div>
  <div class="col">
<label for="customRange1">Duration</label>
<input type="range" class="custom-range" name="tourduration" min="0" max="30" value="${tourduration}"> </div>


 <button type="submit"  onmouseover="searchbutton();" class="btn btn-primary">Search</button>
 
 </div>
 
 
</form>
 

<div class=container2>
  <c:forEach var="tourlist" items="${tourlist}">
   
  <div class="card-media">
    <!-- media container -->
    <div class="card-media-object-container">
      <div class="card-media-object" style="background-image: url(${tourlist.tourBanner});"></div>
      <span class="card-media-object-tag subtle">Selling Fast</span>
      
    </div>
    <!-- body container -->
    <div class="card-media-body">
      
      <span class="card-media-body-heading">${tourlist.tourname}</span>
      <div class="card-media-body-supporting-bottom">
        <span class="card-media-body-supporting-bottom-text subtle">${tourlist.tourlocation}, ${tourlist.country} </span>
        <span class="card-media-body-supporting-bottom-text subtle u-float-right"> Rs ${tourlist.tourprice}</span>
      </div>
      <div class="card-media-body-supporting-bottom card-media-body-supporting-bottom-reveal">
        <span class="card-media-body-supporting-bottom-text subtle">#Music #Party</span>
        <a href="/ArtofTravel/TourController?tourdetails=1&tourid=${tourlist.tourID}&userid=${sessionScope.UserID}" class="card-media-body-supporting-bottom-text card-media-link u-float-right">VIEW DETAILS</a>
        
      </div>
    </div>
  </div>
   </c:forEach>
  
  </div>
 

 

 
<script>

var string = '${UserID}';

var string2 = '${Name}';


toursavailable();

</script>
 
 
 
 
 
 </div>
 
 
 
 
 <%@ include file = "templates/footer.jsp" %>