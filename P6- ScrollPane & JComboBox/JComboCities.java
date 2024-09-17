import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class JComboCities extends Applet implements ActionListener{
	String arr[] = {"Kolhapur","Delhi","Chennai","Mumbai","Kolktta","Jaipur"};
	JComboBox jcb = new JComboBox(arr);
	String msg = "";
	public void init()
	{
		add(jcb);
		jcb.addActionListener(this);
		setSize(500,500);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,50);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		msg = "You are in "+(String) jcb.getSelectedItem();
		repaint();
	}
	
}