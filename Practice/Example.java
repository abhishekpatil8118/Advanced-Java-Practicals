import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Example implements ActionListener
{
	String str1 =  "Abhi";
	static JLabel tf;
	public static void main(String[] args) 
	{
		JFrame f1 = new JFrame("Event");
		
		tf = new JLabel("Sample");
		tf.setBounds(50,50,150,20);
		
		JButton b1 = new JButton("Button 1");
		b1.setBounds(50,100,100,30);
		
		b1.addActionListener(null);
		f1.add(b1);
		f1.add(tf);

		f1.setSize(500,400);
		f1.setLayout(null);
		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		tf.setText(str1);
	}
}
