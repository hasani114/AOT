<%@ include file = "/templates/header.jsp" %>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<div class="container">

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
