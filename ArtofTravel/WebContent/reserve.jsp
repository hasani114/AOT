<%@ include file = "/templates/header.jsp" %>




<div class="container">
<div class="card bg-light">
<article class="card-body mx-auto" style="max-width: 400px;">
	<h4 class="card-title mt-3 text-center">Reserve a Tour</h4>
	
	
	<form action="ReservationController" method="post">
	<div class="form-group input-group">
		<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-user"></i> </span>
		 </div>
        <input   class="form-control" placeholder="Tour ID" name="tourid" type="text" value="<% out.println(request.getParameter("tourid")); %>" required>
    </div> <!-- form-group// -->
    <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-lock"></i> </span>
		</div>
        <input class="form-control" placeholder="user id" name="userid" type="text" value=${UserID} required>
    </div> <!-- form-group// -->
     <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-lock"></i> </span>
		</div>
        <input class="form-control" placeholder="number of attendees" name="numberofattendees" type="text" required>
    </div> <!-- form-group// -->
    <div class="form-group">
        <button type="submit" class="btn btn-primary btn-block"> Book Tour </button>
    </div> <!-- form-group// --> 
        </form>
    </article>
    </div>
    </div> 



<%@ include file = "templates/footer.jsp" %>
