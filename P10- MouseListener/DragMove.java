import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener; 
public class DragMove  extends Applet implements MouseMotionListener
{
	int currentX, currentY;
	String msg;
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, 100, 100);
	}
	public void mouseDragged(MouseEvent me) {
		msg = "Mouse Dragged.";
		repaint();
	}
	public void mouseMoved(MouseEvent me) {
		msg="Mouse Moved.";
		repaint();
		currentX = me.getX();
		currentY = me.getY();
		showStatus("Your curser is at position X: "+currentX+", "+"Y: "+currentY);
	}

}
