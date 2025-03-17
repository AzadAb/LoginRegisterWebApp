<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet">
</head>
<body>
<%
HttpSession session1 = request.getSession(false);

if(session1 !=null && session.getAttribute("username")!=null){
	String username = (String)session.getAttribute("username");


%>
<div class="container">
<h1>Welcome,<%= username %>!</h1>
<p>We're delighted to have you on our platform.</p>
<h3>Explore,learn, and connect with our community</h3>
<p>Feel free to stay as long as you like,and when you're ready
</p>
<p> you can <a href="index.html">LOGOUT</a> securely</p>
</div>
<%
}
else{
	response.sendRedirect("login.jsp");
}
%>
</body>
</html>