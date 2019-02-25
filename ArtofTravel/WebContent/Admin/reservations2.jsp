 <%@ include file = "/templates/header.jsp" %>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
 
 <div class="container">
 

<table class="table table-hover">
<thead class="thead-light">
<tr>
<th scope="col">#</th>
<th scope="col">Tour ID</th>
<th scope="col">User ID</th>
<th scope="col">Status</th>
<th scope="col">Payment Status</th>
<th scope="col">Party Size</th>
<th scope="col">Created On</th>
</tr>
</thead>
<tbody>
   
<c:forEach var="reservation" items="${Reservations}">

<tr>
<td>${reservation.reservationID}</td>
<td>${reservation.tourID}</td>
<td>${reservation.userID}</td>
<td>${reservation.reservationstatus}</td>
<td>${reservation.reservationpaymentstatus}</td>
<td>${reservation.numberofattendees}</td>
<td>${reservation.reservationcreationdate}</td>



</tr>

</c:forEach>


</tbody>
</table>

</div>

<%@ include file = "/templates/footer.jsp" %>
