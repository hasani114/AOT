 <%@ include file = "/templates/header.jsp" %>
 
 <div class="container">
 

<table class="table table-hover">
<thead class="thead-light">
<tr>
<th scope="col">#</th>
<th scope="col">Title</th>
<th scope="col">Location</th>
<th scope="col">Country</th>
<th scope="col">Group Of</th>
<th scope="col">Price</th>
<th scope="col">Duration (Days)</th>
<th scope="col">Description</th>
<th scope="col">Reserve</th>

</tr>
</thead>
<tbody>
<%  

try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  

			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://127.0.0.1:3306/ArtofTravel","root","2001Space");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from tour_details");
			while(rs.next())  

			{			
			%>
	<tr><td><%= rs.getInt(1) %></td>
    <td><%= rs.getString(2) %></td>
   <td><%= rs.getString(3) %></td>
   <td><%= rs.getString(4) %></td>
    <td><%= rs.getInt(5) %></td>
   <td><%= rs.getInt(6) %></td>
   <td><%= rs.getInt(7) %></td>
   <td><%= rs.getString(8) %></td>
   <td><a href="/ArtofTravel/reserve.jsp?tourid=<%= rs.getInt(1) %>&userid=${sessionScope.UserID}">Reserve</a></td>

    <%
			}

    stmt.close();
    rs.close();
    con.close();
    }
catch(Exception e){
	
}


%>
</tbody>
</table>

</div>

<%@ include file = "templates/footer.jsp" %>
