import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class Display extends HttpServlet
{
	public void init() throws ServletException
	{
		
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome at Maharashtra State Board Technical Eduction!</h1>");
	}
	public void distroy()
	{
		
	}
}
