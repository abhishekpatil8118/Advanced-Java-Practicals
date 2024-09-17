import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Add2Numbers extends JFrame implements ActionListener
{
	JLabel l1 = new JLabel("Enter First Number: ");
	JTextField tf1 = new JTextField(15);
	JLabel l2 = new JLabel("Enter Second Number:");
	JTextField tf2 = new JTextField(15);
	JButton b1 = new JButton("Add above two numbers.");
	JLabel l3 = new JLabel("");
	public Add2Numbers()
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
	public static void main(String args[])
	{
		Add2Numbers f1 =  new Add2Numbers();
		f1.setSize(500,400);
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a,b,c;
		a = Integer.parseInt(tf1.getText());
		b = Integer.parseInt(tf2.getText());
		c = a+b;
		l3.setText("Addition is: "+String.valueOf(c));
	}
}
