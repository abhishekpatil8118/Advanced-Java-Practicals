import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CheckPassLength extends JFrame implements ActionListener
{
	JLabel l1 = new JLabel("Enter Password: ");
	JLabel l2 = new JLabel("");
	JPasswordField t1 = new JPasswordField(15);
	JButton b1 = new JButton("Check Password Strength");
	public CheckPassLength()
	{
		b1.addActionListener(this);
		add(l1);
		add(t1);
		add(b1);
		add(l2);
	}
	public static void main(String[] args) 
	{
		CheckPassLength f1 = new CheckPassLength();
		
		f1.setSize(500,400);
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str1 = String.valueOf(t1.getPassword());
		int l = str1.length();
		if(l>6)
		{
			l2.setText("Strong Password... :)");
		}
		else
		{
			l2.setText("Password length must be >6 characters...!  :(");
		}
	}

}
