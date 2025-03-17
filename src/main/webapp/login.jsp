<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="style1.css" rel="stylesheet">
</head>
<body>
<div class="container">
<h1>Login</h1>
<% String error = request.getParameter("error");
if("1".equals(error)){
	%>
	<p Style="color:red;">Invalid username or password.Please try again.</p>
<%}
%>


<% String rs = request.getParameter("registration");
if(rs !=null && rs.equals("success")){
	%>
	<p Style="color:green;">Your Registration is Successful.Please Logig to access the website</p>
<%}
%>
<form action ="LoginServlet" method="post">
<label for="username">UserName:</label>
<input type="text" id="username" name="username" required><br>
<label for="password">Password:</label>
<input type="text" id="password" name="password" required><br>
<button type="submit">Login</button>
</form>

<p><a href="index.html">Back to Home</a></p>
</div>
</body>
</html>