import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AthonticationServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String uname="abhishek";
		String pass="abhishek12345";
		String username,password;
		username=request.getParameter("username");
		password=request.getParameter("password");
		if(username.equals(uname) && password.equals(pass))
		{
			out.println("Login Successfull");
		}
		else
		{
			out.println("Login Unsuccessfull");
		}
	}
}