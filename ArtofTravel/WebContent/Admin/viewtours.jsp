 <%@ include file = "/templates/header.jsp" %>
 
 <div class="container">
 

<a class="btn btn-outline-primary mb-2" href="/ArtofTravel/Admin/addtour.jsp" >Add Tour</a>

<table class="table table-hover">
<thead class="thead-light">
<tr>
<th>#</th>
<th>Title</th>
<th>Location</th>
<th>Country</th>
<th>Group Of</th>
<th>Price</th>
<th>Duration (Days)</th>
<th>Description</th>
<th>Action</th>


</tr>
</thead>
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
   <td> <form action="/ArtofTravel/TourController" id="edittourform"><button type="submit" value="<%=rs.getInt(1) %>" name="edit" class="btn btn-link" >Edit</button></form>
   		<form action="/ArtofTravel/TourController" id="deletetourform"><button type="submit" value="<%=rs.getInt(1) %>" name="delete" class="btn btn-link">Delete</button></form></td></tr>
    
    <%
			}

    stmt.close();
    rs.close();
    con.close();
    }
catch(Exception e){
	
}


%>
</table>

</div>

<%@ include file = "/templates/footer.jsp" %>
