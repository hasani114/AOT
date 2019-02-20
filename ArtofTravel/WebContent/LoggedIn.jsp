<%@ include file = "/templates/header.jsp" %>
<%@ page import="java.util.*" %>
, <%@ page import="com.artoftrael.pk.user.*" %>


<% ArrayList<UserModel> users = new ArrayList<UserModel>();
	
users = (ArrayList) request.getAttribute("viewUsers");

%>
<div class=container>

<table class="table table-hover">
<thead class="thead-light">
<tr>
<td>ID</td>
<td>First Name</td>
<td>Last Name</td>
<td>Email</td>
<td>Phone</td>
<td>Gender</td>
<td>Password</td>
</tr>
</thead>

<%

Iterator<UserModel> iterator = users.iterator();


while(iterator.hasNext()) {
	
	UserModel userdetails = iterator.next();	

%>

<tr>
<td> <%=userdetails.getUserId()%> </td>
<td> <%=userdetails.getUserFirstName()%> </td>
<td> <%=userdetails.getUserLastName()%> </td>
<td> <%=userdetails.getUserEmail()%> </td>
<td> <%=userdetails.getUserPhone()%> </td>
<td> <%=userdetails.getUserGender()%> </td>
<td> <%=userdetails.getUserPassword()%> </td>
</tr>



<% } %>

</table>

</div>



<%@ include file = "templates/footer.jsp" %>
