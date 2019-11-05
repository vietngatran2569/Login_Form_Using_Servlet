import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        PrintWriter write=response.getWriter();
        write.println("</html>");
        if("admin".equals(username) && "admin".equals(password)){
            write.println("welcome "+username+" to love");
        }else{
            write.println("Login Error");
        }
        write.println("</html>");

    }
}
