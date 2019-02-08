<%@ include file = "/templates/header.jsp" %>


<div class="jumbotron jumbotron-fluid">
<div class="container">
<h1>Art of Travel</h1>
  <hr class="my-4">
<p>At Art of Travel, we explore destinations, finding the best routes and the tastiest foods, meet with locals putting together exciting cultural experiences, 
take on extensive expeditions exploring all that is unique to a land and its people and scrutinize prices to bring you all of this at the most affordable rates
 possible!</p></div>
</div>


<div class="container">

	Tour Name : <%= request.getAttribute("tourname") %> </br>
	Country : <%= request.getAttribute("country") %></br>
	Location : <%= request.getAttribute("tourlocation") %></br>
	Group Size : <%= request.getAttribute("groupsize") %></br>
	Tour Price : <%= request.getAttribute("tourprice") %></br>
	Number of Days : <%= request.getAttribute("tourdays") %></br>
	Tour Description : <%= request.getAttribute("tourdescription") %></br>
	
	

</div>

<%@ include file = "templates/footer.jsp" %>
