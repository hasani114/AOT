<%@ include file = "/templates/header.jsp" %>




<div class="container">
<div class="card bg-light">
<article class="card-body mx-auto" style="max-width: 400px;">
	<h4 class="card-title mt-3 text-center">Create Account</h4>
	
	
	<form action="UserController?adduser" method="post">
	<div class="form-group input-group">
		
        <input  class="form-control" placeholder="First name" name="userfirstname" type="text" required>
    </div> <!-- form-group// -->
    <div class="form-group input-group">
	
        <input class="form-control" placeholder="Last name" name="userlastname" type="text" required>
    </div>
    
    <div class="form-group input-group">
    	
        <input class="form-control" placeholder="Email address" name="useremail" type="email" required>
    </div> <!-- form-group// -->
    <div class="form-group input-group">
    
		<select class="custom-select" style="max-width: 120px;">
		    <option selected="">+971</option>
		    <option value="1">+972</option>
		    <option value="2">+198</option>
		    <option value="3">+701</option>
		</select>
    	<input class="form-control" placeholder="Phone number" name="userphone" type="text" required>
    </div> <!-- form-group// -->
    <div class="form-group input-group">
    
		<select class="form-control" name="usergender" required>
			<option selected=""> Female </option>
			<option>Male</option>
		</select>
	</div> <!-- form-group end.// -->
    <div class="form-group input-group">
    	
        <input class="form-control" id="password-one" placeholder="Create password" name="userpassword" type="password" required>
    </div> <!-- form-group// -->
    <div class="form-group">
    	
		<input class="form-control" id="password-two" placeholder="Repeat password" name="repeatpassword" onkeyup="checkPassword()" type="password" required>
		
		<small id="password-message" class="form-text text-muted"></small>
		</div> <!-- form-group// -->        
		                              
    <div class="form-group">
        <button type="submit" id="submitbutton" class="btn btn-primary btn-block"> Create Account  </button>
    </div> <!-- form-group// -->      
    <p class="text-center">Have an account? <a href="/ArtofTravel/Login.jsp">Log In</a> </p>                                                                 
</form>

</article>
</div>
</div>
<script>


</script>


<%@ include file = "templates/footer.jsp" %>
