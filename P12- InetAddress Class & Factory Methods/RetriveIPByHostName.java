import java.net.*;
import java.util.Scanner;

public class RetriveIPByHostName 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name = new String();
		System.out.println("Enter hostname: ");
		name = sc.nextLine();
		
		try 
		{
			InetAddress inet = InetAddress.getByName(name);
			System.out.println("IP address of "+name+" is: "+inet.getHostAddress());
		} 
		catch (UnknownHostException e) 
		{
			e.printStackTrace();
		}
	}
}
