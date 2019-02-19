<%@ include file = "/templates/header.jsp" %>
<%@ page import="java.io.PrintWriter" %>

    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



Your Username is ${sessionScope.Username}

<a href="logout.jsp"> Log Out</a> 


</body>
</html>