import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class CalculateUsernameLength extends HttpServlet
{
	public void init()
	{}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String str = request.getParameter("uname");
		int length = str.length();
		out.println("<h2>The length of the username is: "+length+"</h2>");
	}
	public void destroy()
	{}
}
