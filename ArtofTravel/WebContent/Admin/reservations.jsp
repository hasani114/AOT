 <%@ include file = "/templates/header.jsp" %>
 
 <div class="container" style="margin-top:100px;">
 

<table class="table table-hover">
<thead class="thead-light">
<tr>
<th scope="col">#</th>
<th scope="col">Tour ID</th>
<th scope="col">User ID</th>
<th scope="col">Status</th>
<th scope="col">Payment Status</th>
<th scope="col">Party Size</th>
<th scope="col">Created On</th>


</tr>
</thead>
<tbody>
<%  

try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  

			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://127.0.0.1:3306/ArtofTravel","root","2001Space");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from reservations");
			while(rs.next())  

			{			
			%>
	<tr><td><%= rs.getInt(1) %></td>
    <td><%= rs.getString(2) %></td>
   <td><%= rs.getString(3) %></td>
   <td><%= rs.getString(4) %></td>
    <td><%= rs.getString(5) %></td>
   <td><%= rs.getString(6) %></td>
      <td><%= rs.getDate(7) %></td>
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

<%@ include file = "/templates/footer.jsp" %>
