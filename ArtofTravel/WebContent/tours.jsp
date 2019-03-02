 <%@ include file = "/templates/header.jsp" %>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 

<script>
    function DisableNullFields() {
        $('input[type=text]').each(function(i) {
            var $input = $(this);
            if ($input.val() == '')
               $input.attr('disabled', 'disabled');
        });
    }
    

</script>
 <div class="container">
 

 <form action="TourController" style="padding-bottom:20px;" onsubmit="DisableNullFields()"> 
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


 <button type="submit"  class="btn btn-primary">Search</button>
 
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
 

 

 
 
 
 
 
 
 
 </div>
 
 <style>
 
 html {
  background-color: #fefefe;
  box-sizing: border-box;
  font-family: 'Roboto', sans-serif;
  font-size: 14px;
  font-weight: 500;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.container2 {
  margin: 50px auto 0;
  width: 700px
  
}

.u-float-right {
  float: right;
}

.u-flex-center {
  display: -webkit-flex;
  display: flex;
  -webkit-justify-content: center;
  justify-content: center;
  -webkit-align-items: center;
  align-items: center;
}

.subtle {
  color: #888;
  font-size: 12px;
}

.card-media {
  border-radius: 2px;
  box-shadow: 0 2px 8px rgba(0, 0, 0, .12);
  height: 125px;
  margin-bottom: 25px;
  transition: all 300ms ease-out;
  width: 100%;
}

.card-media:hover {
  box-shadow: 0 5px 14px rgba(0, 0, 0, .2);
}

.card-media-object-container {
  background: none;
  float: left;
  height: 100%;
  width: 35%;
  position: relative;
}

.card-media-object {
  background-position: center center;
  background-size: cover;
  height: 100%;
}

.card-media-object:after {
  content: " ";
  display: block;
  height: 100%;
  left: 0;
  opacity: 0;
  position: absolute;
  right: 0;
  top: 0;
  transition: all 300ms ease-out;
  z-index: 10;
}

.card-media:hover .card-media-object:after {
  background: -moz-linear-gradient(top,  rgba(0,0,0,0) 0%, rgba(0,0,0,0) 52%, rgba(0,0,0,0.4) 100%);
  background: -webkit-linear-gradient(top,  rgba(0,0,0,0) 0%,rgba(0,0,0,0) 52%,rgba(0,0,0,0.4) 100%);
  background: linear-gradient(to bottom,  rgba(0,0,0,0) 0%,rgba(0,0,0,0) 52%,rgba(0,0,0,0.4) 100%);
  filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#00000000', endColorstr='#a6000000',GradientType=0 );
  opacity: 1;
}

.card-media-object-tag {
  background-color: #fff;
  border-radius: 2px;
  padding: 2px 7px;
  position: absolute;
  right: 10px;
  top: 10px;
}

.card-media-object-social-list {
  bottom: 4px;
  left: 10px;
  list-style-type: none;
  margin: 0;
  padding: 0;
  position: absolute;
  z-index: 20;
}

.card-media-object-social-list li {
  border-radius: 50%;
  display: inline-block;
  height: 30px;
  margin-right: 6px;
  opacity: 0;
  overflow: hidden;
  transform: translateY(5px);
  transition: all 300ms ease-out;
  width: 30px;
}

.card-media:hover .card-media-object-social-list li {
  opacity: 1;
  transform: translateY(0);
}

.card-media-object-social-list li:nth-child(1) {
  transition-delay: 0;
}
.card-media-object-social-list li:nth-child(2) {
  transition-delay: 75ms;
}
.card-media-object-social-list li:nth-child(3) {
  transition-delay: 150ms;
}

.card-media-object-social-list-item-additional {
  border: 1px solid #fff;
  color: #fff;
  font-size: 12px;
  padding-top: 7px;
  text-align: center;
}

.card-media-body {
  background-color: #fff;
  float: left;
  height: 100%;
  padding: 12px 15px;
  position: relative;
  width: 65%;
}

.card-media-body-top {
  display: block;
}

.card-media-body-top-icons {
  margin-top: -2px;
  opacity: 0;
  transition: all 300ms ease-out;
  transform: translateY(-5px);
}

.card-media:hover .card-media-body-top-icons {
  opacity: 1;
  transform: translateY(0);
}

.card-media-body-top-icons > svg {
  cursor: pointer;
  margin-left: 10px;
  transition: all 300ms ease-out;
}

.card-media-body-top-icons > svg:hover {
  fill: #444;
}

.card-media-body-heading {
  display: block;
  margin-top: 10px;
}

.card-media-body-supporting-bottom {
  position: absolute;
  bottom: 10px;
  left: 0;
  opacity: 1;
  padding: 0 15px;
  transition: all 300ms ease-out;
  width: 100%;
}

.card-media:hover .card-media-body-supporting-bottom {
  opacity: 0;
  transform: translateY(-8px);
}

.card-media-body-supporting-bottom-text {
  display: inline-block;
}

.card-media-body-supporting-bottom-reveal {
  opacity: 0;
  transform: translateY(8px);
  transition: all 300ms ease-out;
}

.card-media:hover .card-media-body-supporting-bottom-reveal {
  opacity: 1;
  transform: translateY(0);
}

.card-media-link {
  color: #41C1F2;
  text-decoration: none;
}</style>
 
 
 <%@ include file = "templates/footer.jsp" %>