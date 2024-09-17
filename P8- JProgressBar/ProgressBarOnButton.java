import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class ProgressBarOnButton extends Applet implements ActionListener
{
	JProgressBar jpb;
	JButton b1;
	public void init()
	{
		jpb = new JProgressBar(0,100);
		jpb.setStringPainted(true);
		b1 = new JButton("Start");
		b1.addActionListener(this);
		
		add(jpb);
		add(b1);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{	for(int i=0;i<101;i++)
			{
				jpb.setValue(i);
				Thread.sleep(100);
			}
		}
		catch(Exception e){}
	}
}
