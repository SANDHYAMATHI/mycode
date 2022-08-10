<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
        if (session.getAttribute("pname") == null) {
                response.sendRedirect("index.jsp?error=1");
        }
%>
<b>Product Name : <%= session.getAttribute("pname") %></b><br>
<b>Product Type : <%= session.getAttribute("ptype") %></b><br>
<b>Color        :  <%= session.getAttribute("color") %></b><br>

<a href="logout.jsp">OK</a>

</body>
</html>