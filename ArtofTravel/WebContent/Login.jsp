<%@ include file = "/templates/header.jsp" %>




<div class="container">
<div class="card bg-light">
<article class="card-body mx-auto" style="max-width: 400px;">
	<h4 class="card-title mt-3 text-center">Log In</h4>
	
	
	<form action="UserController?login" method="post">
	<div class="form-group input-group">
		<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-user"></i> </span>
		 </div>
        <input  class="form-control" placeholder="Email Address" name="username" type="text">
    </div> <!-- form-group// -->
    <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-lock"></i> </span>
		</div>
        <input class="form-control" placeholder="Password" name="password" type="password">
    </div> <!-- form-group// -->
    <div class="form-group">
        <button type="submit" class="btn btn-primary btn-block"> Sign In </button>
    </div> <!-- form-group// --> 
        </form>
    </article>
    </div>
    </div> 



<%@ include file = "templates/footer.jsp" %>