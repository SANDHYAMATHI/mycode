<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Sessions</title>
</head>
<body>
<%
  if (request.getParameter("error") != null)
          out.println("<b>Your session has expired or is invalid.</b><br>");
%>
<b>ENTER PRODUCT DETAILS</b><br><br>
<form action="details.jsp" method="post">
  Product Name &nbsp; <input name="pname" id="pname" maxlength=40><br><br>
  Product Type &nbsp; <input name="ptype" id="ptype" maxlength=40><br><br>
  Color &nbsp;&nbsp;  <input name="color" id="color" maxlength=40><br><br>
 
  <button>Submit</button>
  
</form>
</body>
</html>
