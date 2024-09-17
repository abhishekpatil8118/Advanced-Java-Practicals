import javax.swing.*;
import java.awt.event.*;

public class UseOfJPB  
{
	public static void main(String args[])
	{
		JFrame f1 = new JFrame("Abhi");
		JProgressBar jpb = new JProgressBar(0,100);
		f1.add(jpb);
		jpb.setBounds(100,30,150,30);
		jpb.setStringPainted(true);
		
		f1.setSize(500,400);
		f1.setLayout(null);
		f1.setVisible(true);
		
		try 
		{
			for(int i=0;i<101;i++)
			{
				jpb.setValue(i);
				Thread.sleep(100);
			}
		}
		catch(Exception e){}
	}
}
