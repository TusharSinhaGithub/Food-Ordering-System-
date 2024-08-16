
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDatabase {
    public static void main(String[] args) {
        Connection con = null;
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodie", "root", "b8c8zj6hmf");
            
            System.out.println("Connection success");
            
            // Do something with the connection here
            
        } catch (ClassNotFoundException e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } catch (SQLException e) {
            // Handle errors for JDBC
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Invalidate the session
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        // Redirect to the login page
        response.sendRedirect("index.html");
    }
}