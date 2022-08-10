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

        String pname = request.getParameter("pname");
String ptype = request.getParameter("ptype"); 
String color = request.getParameter("color");   
        
 if (pname == null || pname.equals("") || ptype == null || ptype.equals("") || color == null || color.equals("")) 

 {
                response.sendRedirect("index.jsp?error=1");
        } else {
                
                session.setAttribute("pname", pname);
                session.setAttribute("ptype", ptype);
                session.setAttribute("color", color);
                
                response.sendRedirect("dashboard.jsp");
                
        }
%>

</body>
</html>