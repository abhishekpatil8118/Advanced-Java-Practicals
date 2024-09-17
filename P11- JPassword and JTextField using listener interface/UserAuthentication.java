import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class UserAuthentication extends JFrame implements ActionListener
{
	JLabel l1 = new JLabel("Username: ");
	JTextField tf1 = new JTextField(15);
	JLabel l2 = new JLabel("Password: ");
	JPasswordField tf2 = new JPasswordField(15);
	JButton b1 = new JButton("Authenticate");
	JLabel l3 = new JLabel("");
	public UserAuthentication()
	{
		b1.addActionListener(this);
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b1);
		add(l3);
		setTitle("Abhishek Patil.");
	}
	public static void main(String[] args) 
	{
		UserAuthentication f1 = new UserAuthentication();
		f1.setSize(500,400);
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		String user = new String(tf1.getText());
		String pass = String.valueOf(tf2.getPassword());
		if(user.equals("abhishek") && pass.equals("Abhi@123"))
		{
			l3.setText("Authenticated User!");
		}
		else
		{
			l3.setText("Unauthenticated User! Please try again.");
		}
	}

}
