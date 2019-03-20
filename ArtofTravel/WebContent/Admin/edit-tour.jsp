<%@ include file = "/templates/header.jsp" %>





<div class="container pb-5" style="margin-top:100px;">

	<form action="TourController" method="post">
		<div class="row">
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">Tour Name</label> <input type="text"
					class="form-control" name="tourname" value="${tour.tourName}">
			</div>
			
				<div class="form-group col-md-6">
				<label class="my-1 mr-2">Date</label> 
					
					<input type="text"  class="form-control" name="tourdate" value="${tour.tourDate}" />
			</div>
			
		</div>
		<div class="row">
		
		<div class="form-group col-md-6">
				<label class="my-1 mr-2">Country</label> <input type="text"
					class="form-control" name="country" value="${tour.country}">
			</div>
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">Location</label> <input type="text"
					class="form-control" name="tourlocation" value="${tour.tourLocation}">
			</div>
			
		</div>
		<div class="row">
		
		<div class="form-group col-md-6">
				<label class="my-1 mr-2" for="inlineFormCustomSelectPref">Group
					Size</label> <select class="custom-select" name="groupsize">
					<option selected>${tour.groupSize}</option>
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
					class="form-control" name="tourprice" value="${tour.tourPrice}" >
			</div>
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">Number of Days</label> <select
					class="custom-select" name="tourduration">
					<option selected>${tour.tourDuration}</option>
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
					class="form-control" name="tourbanner" value="${tour.tourBanner}">
			</div>
			<div class="form-group col-md-6">
				<label class="my-1 mr-2">Description</label> 
				<textarea type="text"
					class="form-control" name="tourdescription" value="${tour.tourDescription}"></textarea>
			</div>
		
		</div>
		<button type="submit" class="btn btn-primary">Edit Tour</button>
				<a class="btn btn-primary" href="javascript: history.go(-1)">Back</a>
		
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
