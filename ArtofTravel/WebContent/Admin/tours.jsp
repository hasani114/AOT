 <%@ include file = "/templates/header.jsp" %>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <div class="container pb-5" style="margin-top:100px;">
 

 <div class="text-right">
<a class="btn btn-primary mb-2" href="${pageContext.request.contextPath}/Admin/addtour.jsp">Add Tour</a></div>
 <table class="table table-hover">

 <thead class="thead-light">
 <th scope="col"> ID</th>
 <th scope="col"> Name</th>
 <th scope="col">Location</th>
 <th scope="col">Country</th>
 <th scope="col">Group Size</th>
 <th scope="col">Price</th>
 <th scope="col">Duration</th>
 <th scope="col">Description</th>
  <th scope="col">Date</th>
    <th scope="col">Action</th>
  
  
 </thead>
 
 
 <c:forEach var="tourlist" items="${tourlist}">

<tr>
<td>${tourlist.tourID}</td>
<td>${tourlist.tourName}</td>
<td>${tourlist.tourLocation}</td>
<td>${tourlist.country}</td>
<td>${tourlist.groupSize}</td>
<td>${tourlist.tourPrice}</td>
<td>${tourlist.tourDuration}</td>
<td>${tourlist.tourDescription}</td>
<td>${tourlist.tourDate}</td> 
 <td><a href="${pageContext.request.contextPath}/TourController?edittour=${tourlist.tourID}">Edit</a> |
 <a href="${pageContext.request.contextPath}/TourController?delete=${tourlist.tourID}">Delete</a></td>
 
</tr>
 
 
 </c:forEach>
 
</table>
 
 
 
 
 
 </div>
 
 
 <%@ include file = "/templates/footer.jsp" %>