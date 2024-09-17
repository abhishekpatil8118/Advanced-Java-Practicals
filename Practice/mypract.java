import java.util.*;

public class mypract 
{
	public static void main(String args[])
	{
		int num;
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number: ");
			num=sc.nextInt();
			
			if(num%10==0)
				break;
			System.out.println(num+" ");
		}
	}
}
