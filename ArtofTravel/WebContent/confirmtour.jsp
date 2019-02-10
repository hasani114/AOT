<%@ include file = "/templates/header.jsp" %>





<div class="container">

	Tour Name : <%= request.getAttribute("tourname") %> </br>
	Country : <%= request.getAttribute("country") %></br>
	Location : <%= request.getAttribute("tourlocation") %></br>
	Group Size : <%= request.getAttribute("groupsize") %></br>
	Tour Price : <%= request.getAttribute("tourprice") %></br>
	Number of Days : <%= request.getAttribute("tourduration") %></br>
	Tour Description : <%= request.getAttribute("tourdescription") %></br>
	
	

</div>

<%@ include file = "templates/footer.jsp" %>
