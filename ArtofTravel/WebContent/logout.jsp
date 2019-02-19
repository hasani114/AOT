<%@ include file = "/templates/header.jsp" %>




<div class="container">

<% session.invalidate();
	response.sendRedirect("index.jsp");

%>

    </div> 



<%@ include file = "templates/footer.jsp" %>
