package businesslogics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginChecker")
public class LoginChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginChecker() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("txtUname");
		String pword=request.getParameter("txtPassword");
		PrintWriter out=response.getWriter();
		//RequestDispatcher- an interface to include content on same page or different pages
		RequestDispatcher rd;
		if(uname.equalsIgnoreCase("sandhya") && pword.equals("sandhya123")){
			out.println("Hello Sandhya");
			rd=request.getRequestDispatcher("welcome()");
			rd.forward(request, response);
		}
		else {
			out.println("Invalid Username or Password");
			rd=request.getRequestDispatcher("LoginForm.html");
			rd.include(request, response);
		}
	}
}