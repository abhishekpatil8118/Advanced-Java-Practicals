import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Test implements ActionListener 
{
	JFrame f1 = new JFrame("Frame 1");
	JFrame f2 = new JFrame("Frame 2");
	JButton b1 = new JButton("Show frame 2");
	JButton b2 = new JButton("Show frame 1");
	public Test()
	{
		b1.setBounds(50,50,150,30);
		b1.addActionListener(this);
		f1.add(b1);
		
		b2.setBounds(50,50,150,30);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				f2.setSize(250,200);
				f2.setLayout(null);
				f2.setVisible(false);
				f1.setVisible(true);
			}
		});
		f2.add(b2);
		
		f1.getContentPane().setBackground(Color.GREEN);
		f1.setSize(500,400);
		f1.setLayout(null);
		f1.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Test();
	}
	public void actionPerformed(ActionEvent arg0) 
	{
		f2.setSize(500,400);
		f2.setLayout(null);
		f2.setVisible(true);
		f1.setVisible(false);
	}

}
