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
  <input type="hidden" class="form-control" name="searchform" value="" placeholder="Tour Name">
 
 <div class="col">
 <input type="text" class="form-control" name="tourname" value="" placeholder="Tour Name">
 </div>
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
 

 <table class="table table-hover">

 <thead class="thead-light">
 <th scope="col"> ID</th>
 <th scope="col"> Name</th>
 <th scope="col">Location</th>
 <th scope="col">Country</th>
 <th scope="col">Group Size</th>
 <th scope="col">Price</th>
 <th scope="col">Duration</th>
 <th scope="col">Description</th>
  <th scope="col"></th>
 
 </thead>
 
 <tbody>
 <c:forEach var="tourlist" items="${tourlist}">

<tr>
<td>${tourlist.tourID}</td>
<td>${tourlist.tourname}</td>
<td>${tourlist.tourlocation}</td>
<td>${tourlist.country}</td>
<td>${tourlist.groupsize}</td>
<td>${tourlist.tourprice}</td>
<td>${tourlist.tourduration}</td>
<td>${tourlist.tourdescription}</td>
<td><a href="/ArtofTravel/reserve.jsp?tourid=${tourlist.tourID}&userid=${sessionScope.UserID}">Reserve</a></td>

 
 </tr>
 </c:forEach>
 
 
 </tbody>
 
 </table>
 
 
 
 
 
 
 
 </div>
 
 
 <%@ include file = "templates/footer.jsp" %>