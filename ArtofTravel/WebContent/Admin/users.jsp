<%@ include file = "/templates/header2.jsp" %>
<%@ page import="java.util.*" %>
, <%@ page import="com.artoftrael.pk.user.*" %>


<% ArrayList<UserModel> users = new ArrayList<UserModel>();
	
users = (ArrayList) request.getAttribute("viewUsers");

%>
<div class=container>

<table class="table table-hover">
<thead class="thead-light">
<tr>
<th>ID</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Phone</th>
<th>Gender</th>
<th>Password</th>
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



<%@ include file = "/templates/footer.jsp" %>
