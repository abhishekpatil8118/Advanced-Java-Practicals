import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ProductOnButton extends Applet implements ActionListener
{
	JTextField t1,t2;
	JButton b1;
	int x,y,z;
	public void init()
	{
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		b1 = new JButton("Multiply");
		
		b1.addActionListener(this);
		
		add(t1);
		add(t2);
		add(b1);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0) {
		x = Integer.parseInt(t1.getText());
		y = Integer.parseInt(t2.getText());
		z = x*y;
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Multiplication is: "+z, 70, 100);
	}
}
