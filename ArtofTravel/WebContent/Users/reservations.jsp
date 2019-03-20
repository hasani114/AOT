<%@ include file = "/templates/header.jsp" %>
<%@ include file = "/templates/banners/about-us.jsp" %>

  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<div class="container pt-5 pb-5">

<h1>My Bookings</h1>
<table class="table table-hover">
 <thead class="thead-light">
	
	<th scope="col">Reservation ID</th>
		<th scope="col">Tour ID</th>
	<th scope="col">User ID</th>
	<th scope="col">Status</th>
	<th scope="col">Payment Status</th>
	<th scope="col">Attendees</th>
	
	
	</thead>
	<c:forEach var="reservations" items="${Reservations}">
	<tr><td>${reservations.reservationID}</td>
	<td>${reservations.tourID}</td>
	
	<td>${reservations.userID}</td>
	<td>${reservations.reservationstatus}</td>
	<td>${reservations.reservationpaymentstatus}</td>
	<td>${reservations.numberofattendees}</td>
	</tr>
	 </c:forEach>


</table>
</div>




<%@ include file = "/templates/footer.jsp" %>
