import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletEvent extends Applet implements ActionListener
{
	String str1 = "";
	String msg = "";
	TextField tf = new TextField(20);
	int age = 0 ;
	
	public void init()
	{	
		Label l1 = new Label("Enter Age: ");
		Button b1 = new Button("Submit");
		
		b1.addActionListener(this);
		add(l1);
		add(tf);
		add(b1);
		
		setSize(500,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		str1 = tf.getText();
		age = Integer.parseInt(str1);
		if(age<1)
		{
			msg="Pleae Enter your Correct Age.";
		}
		else
		{
			if(age>17)
			{
				if(age>120)
				{
					msg="Enter Your Correct Age.";
				}
				else
				{
					msg = "You are eligible for Vaccine";
				}
			}
			else
			{
				msg = "You are not eligible for Vaccine";
			}
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, 60, 80);
	}
}
