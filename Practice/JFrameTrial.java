import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JFrameTrial extends JFrame implements ActionListener, KeyListener
{
	JButton b1 = new JButton("View Second Window.");
	JLabel l1 = new JLabel("Not clicked yet...");
	public JFrameTrial()
	{
		b1.addActionListener(this);
		b1.addKeyListener(this);
		add(b1);
		add(l1);
	}
	public static void main(String[] args) 
	{
		JFrameTrial f1 = new JFrameTrial();
		JFrame f2  = new JFrame("Second Window");
		
		f1.setSize(500,400);
		f2.setSize(250,200);
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);
		f2.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		
	}
	public void keyPressed(KeyEvent ke) 
	{
		l1.setText("Key Pressed... :)");
	}
	public void keyReleased(KeyEvent ke) 
	{
		l1.setText("Key Realeased... :)");
	}
	public void keyTyped(KeyEvent ke) 
	{
		l1.setText("Key Typed... :)");
	}

}
