<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display User Info</title>
</head>
<body>
<%
// Check if session attributes are not null
String getName = (String) session.getAttribute("name");
String getEmail = (String) session.getAttribute("email");

// Display user info if available
if (getName != null && getEmail != null) {
%>
    <h2>Your Name:</h2> <%= getName %>
    <h2>Your Email:</h2> <%= getEmail %>
<%
}
%>
</body>
</html>
