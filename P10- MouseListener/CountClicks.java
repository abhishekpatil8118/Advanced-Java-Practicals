import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class CountClicks extends Applet implements MouseListener 
{
	int tcount;
	public void init()
	{
		addMouseListener(this);
		setName("Abhishek");
	}
	public void paint(Graphics g)
	{
		g.drawString("Total number of clicks: "+tcount, 100, 80);
	}
	public void mouseClicked(MouseEvent me) {
		tcount = tcount + me.getClickCount();
		repaint();
	}
	public void mouseEntered(MouseEvent me) {}
	public void mouseExited(MouseEvent me) {}
	public void mousePressed(MouseEvent me) {}
	public void mouseReleased(MouseEvent me) {}
}
