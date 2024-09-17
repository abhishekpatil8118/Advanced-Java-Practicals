import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class CalculatePer extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int majp=90,mcss=98,mosy=85,add;
		int per,temp;
		String name;
		name=request.getParameter("fname");
		majp=Integer.parseInt(request.getParameter("ajp"));
		mcss=Integer.parseInt(request.getParameter("css"));
		mosy=Integer.parseInt(request.getParameter("osy"));
		
		add=majp+mcss+mosy;
		if(add<=120)
		{
			out.println("<h2>Sorry "+name+". You are Failed.</h2>");
		}
		else
		{
			out.println("<h2>Congratulations "+name+". You are Passed.</h2>");
		}
	}
}