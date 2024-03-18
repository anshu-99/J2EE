<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="SecondFile.jsp" method="post">
<h4>Enter your name:</h4> <input type="text" name="user"> <br>
<h4>Enter email-id:</h4> <input type="email" name="email"> <br>
<input type="submit">
</form>
<%
String name = request.getParameter("user");
String email = request.getParameter("email");

// Check if name and email are not null before setting session attributes
if (name != null && email != null) {
    pageContext.setAttribute("name", name, PageContext.SESSION_SCOPE);
    pageContext.setAttribute("email", email, PageContext.SESSION_SCOPE);
}
%>

</body>
</html>
