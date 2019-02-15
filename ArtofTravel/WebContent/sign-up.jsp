<%@ include file = "/templates/header.jsp" %>




<form action="addUser">
		<div class="row">
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">First Name</label> <input type="text"
					class="form-control" name="userfirstname">
			</div>
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">Last Name</label> <input type="text"
					class="form-control" name="last">
			</div>
			</div>
			<button type="submit" class="btn btn-primary">Add User</button>
	</form>



<%@ include file = "templates/footer.jsp" %>
