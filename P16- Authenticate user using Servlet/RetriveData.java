import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class RetriveData extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name,branch,year;
		name=request.getParameter("fname");
		branch=request.getParameter("branch");
		year=request.getParameter("year");
		out.println("<h1>Student Name: "+name+"<br> Branch: "+branch+"<br> Year: "+year+"</h1>");
	}
}