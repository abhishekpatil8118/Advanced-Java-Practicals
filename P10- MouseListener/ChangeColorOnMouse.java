import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.applet.*;
public class ChangeColorOnMouse extends Applet implements MouseListener{
	public void init()
	{
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent ae) {
		setBackground(Color.PINK);
	}
	public void mouseEntered(MouseEvent ae) {
		setBackground(Color.GREEN);
	}
	public void mouseExited(MouseEvent ae) {
		setBackground(Color.RED);
	}
	public void mousePressed(MouseEvent ae) {}
	public void mouseReleased(MouseEvent ae) {}
}
