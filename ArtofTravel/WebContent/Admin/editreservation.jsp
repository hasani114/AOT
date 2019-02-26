<%@ include file = "/templates/header.jsp" %>




<div class="container">

	<form action="ReservationController" method="post">
	<input type="hidden" name="action" value="updatereservation">
		<input type="hidden" name="reservationID" value="${Reservation.reservationID}">
	
		<div class="row">
		<div class="form-group col-md-6">
				<label class="my-1 mr-2">Reservation ID</label> <input type="text"
					class="form-control" disabled name="reservationID" value="${Reservation.reservationID}">
			</div>
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">Tour ID</label> <input type="text"
					class="form-control" name="tourID" value="${Reservation.tourID}" disabled>
			</div>
			
		</div>
		<div class="row">
		<div class="form-group col-md-6">
				<label class="my-1 mr-2">User ID</label> <input type="text"
					class="form-control" name="userID" value="${Reservation.userID}" disabled>
			</div>
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">Date Created</label> 
				<input type="text"
					class="form-control" name="reservationcreationdate" value="${Reservation.reservationcreationdate}" disabled>
			</div>
			
			
			
		</div>
		<div class="row">
		<div class="form-group col-md-6">
				<label class="my-1 mr-2">Reservation Status</label> <input type="text"
					class="form-control" name="reservationstatus" value="${Reservation.reservationstatus}">
			</div>
			
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">Payment Status</label> <input type="text"
					class="form-control" name="reservationpaymentstatus" value="${Reservation.reservationpaymentstatus}">
			</div>
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">Number of Attendees</label> 
				<input type="text"
					class="form-control" name="numberofattendees" value="${Reservation.numberofattendees}">
			</div>
			
		</div>
		<button type="submit" class="btn btn-primary">Update Reservation</button>
	</form>
</div>

<%@ include file = "/templates/footer.jsp" %>
