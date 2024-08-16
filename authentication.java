Authentication servlet:
HTML CODE:
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Auth
 */
@WebServlet("/Auth")
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Auth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Here, you would perform actual authentication, for example, checking against a database
        // For demonstration, let's assume a hardcoded username and password
        if ("Nitya".equals(username) && "Pucchu".equals(password)) {
            // Authentication successful, redirect to a success page
            response.sendRedirect("Homepage.html");
        } else {
            // Authentication failed, redirect back to the login page with an error message
            response.sendRedirect("index.html");
	}

		// TODO Auto-generated method stub
	}

}