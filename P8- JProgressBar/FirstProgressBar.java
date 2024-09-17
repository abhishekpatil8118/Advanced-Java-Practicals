import javax.swing.*;
import java.awt.*;

public class FirstProgressBar
{
	public static void main(String args[])
	{
		JFrame f1 = new JFrame("Abhi");
		
		JProgressBar jpb = new JProgressBar(0,100);
		f1.add(jpb);
		jpb.setBounds(100,30,100,30);
		jpb.setStringPainted(true);
		
		f1.setSize(500,400);
		f1.setLayout(null);
		f1.setVisible(true);
		for(int i=0;i<101;i++)
		{
			jpb.setValue(i);
		}
	}
}
