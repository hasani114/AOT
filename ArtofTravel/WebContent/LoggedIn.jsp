<%@ include file = "/templates/header.jsp" %>
<%@ page import="java.util.*" %>
, <%@ page import="com.artoftrael.pk.user.*" %>


<% String isValid = request.getParameter("ValidUser");
		
%>
<div class=container>

the user is valid = ${ValidUser}
		

</div>



<%@ include file = "templates/footer.jsp" %>
