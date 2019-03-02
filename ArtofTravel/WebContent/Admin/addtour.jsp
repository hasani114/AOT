<%@ include file = "/templates/header.jsp" %>




<div class="container">

	<form action="../Controller?addtour" method="post">
		<div class="row">
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">Tour Name</label> <input type="text"
					class="form-control" name="tourname">
			</div>
			
				<div class="form-group col-md-6">
				<label class="my-1 mr-2">Date</label> 
					
					<input type="text"  class="form-control" name="tourdate" value="" />
					
			</div>
			
		</div>
		<div class="row">
		
		<div class="form-group col-md-6">
				<label class="my-1 mr-2">Country</label> <input type="text"
					class="form-control" name="country">
			</div>
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">Location</label> <input type="text"
					class="form-control" name="tourlocation">
			</div>
			
		</div>
		<div class="row">
		
		<div class="form-group col-md-6">
				<label class="my-1 mr-2" for="inlineFormCustomSelectPref">Group
					Size</label> <select class="custom-select" name="groupsize">
					<option selected>6</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="1">4</option>
					<option value="2">5</option>
					<option value="3">6</option>
					<option value="1">7</option>
					<option value="2">8</option>
					<option value="3">9</option>
					<option value="1">10</option>
					<option value="2">11</option>
					<option value="3">12</option>
					<option value="1">13</option>
					<option value="2">14</option>
					<option value="3">15</option>
				</select>
			</div>
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">Price</label> <input type="text"
					class="form-control" name="tourprice" >
			</div>
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">Number of Days</label> <select
					class="custom-select" name="tourduration">
					<option selected>6</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="1">4</option>
					<option value="2">5</option>
					<option value="3">6</option>
					<option value="1">7</option>
					<option value="2">8</option>
					<option value="3">9</option>
					<option value="1">10</option>
					<option value="2">11</option>
					<option value="3">12</option>
					<option value="1">13</option>
					<option value="2">14</option>
					<option value="3">15</option>
				</select>
			</div>
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">Banner</label> <input type="text"
					class="form-control" name="tourbanner" >
			</div>
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">Description</label> 
				<textarea type="text"
					class="form-control" name="tourdescription"></textarea>
			</div>
		
		</div>
		<button type="submit" class="btn btn-primary">Add Tour</button>
	</form>
</div>
    <script>
$(function() {
  $('input[name="tourdate"]').daterangepicker({
	  
	  "singleDatePicker": true,
	    "startDate": new Date(),
}), function(start, end, label) {
	  console.log('New date range selected: ' + start.format('YYYY-MM-DD') + ' to ' + end.format('YYYY-MM-DD') + ' (predefined range: ' + label + ')');
}
});
</script>

<%@ include file = "/templates/footer.jsp" %>
