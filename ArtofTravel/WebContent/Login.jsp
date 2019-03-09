<%@ include file = "/templates/header.jsp" %>
<%@ include file = "/templates/banners/about-us.jsp" %>



<div class="container pt-5">
<div class="card bg-light">
<article class="card-body mx-auto" style="max-width: 400px;">
	<h4 class="card-title mt-3 text-center">Log In</h4>
	
	Redirect = ${param.redirect}
	<form action="UserController?loginrequest" method="post">
	<div class="form-group input-group">
	        <input name="redirect" type="hidden" value="${param.redirect}">
	
		<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-user"></i> </span>
		 </div>
        <input  type="email" class="form-control" placeholder="Email Address" name="username" type="text" required>
    </div> <!-- form-group// -->
    <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-lock"></i> </span>
		</div>
        <input class="form-control" placeholder="Password" name="password" type="password" required>
    </div> <!-- form-group// -->
 


    <div class="form-group">
        <button type="submit" class="btn btn-primary btn-block"> Sign In </button>
    </div> <!-- form-group// --> 
    <a href="/ArtofTravel/signup.jsp">Sign Up</a>
        </form>
    </article>
    </div>
    
    



    
    </div> 
  


<%@ include file = "templates/footer.jsp" %>
