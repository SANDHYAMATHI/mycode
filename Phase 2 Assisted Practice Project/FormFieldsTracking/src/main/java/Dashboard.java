import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Dashboard() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

    PrintWriter out = response.getWriter();
    out.println("<html><body>");
    String userId = request.getParameter("userid");
    if (userId == null) {
        out.println("No UserId was found in hidden form field.<br>");
    } else {
        out.println("UserId found in hidden form field: " + userId + "<br>");
        
    }
    out.println("</body></html>");

}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
}

}
