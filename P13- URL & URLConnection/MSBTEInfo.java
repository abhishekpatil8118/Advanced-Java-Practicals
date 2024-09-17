import java.net.*;
public class MSBTEInfo 
{
	public static void main(String[] args) throws MalformedURLException
	{
		URL url = new URL("http://www.msbte.org.in");
		System.out.println("Host Name: "+url.getHost());
		System.out.println("Protocol: "+url.getPort());
		System.out.println("Port: "+url.getPort());
		System.out.println("File name: "+url.getFile());
	}

}
