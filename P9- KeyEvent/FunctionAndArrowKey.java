import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.applet.*;

public class FunctionAndArrowKey extends Applet implements KeyListener{
	String msg = "";
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke) {
		showStatus("Key Pressed.");
		int key = ke.getKeyCode();
		switch(key)
		{
			case KeyEvent.VK_UP:
				showStatus("Up arrow pressed.");
				break;
			
			case KeyEvent.VK_DOWN:
				showStatus("Down arrow pressed.");
				break;
			
			case KeyEvent.VK_LEFT:
				showStatus("Left arrow pressed.");
				break;
				
			case KeyEvent.VK_RIGHT:
				showStatus("Right arrow pressed");
				break;
				
			case KeyEvent.VK_F1:
				showStatus("F1 key pressed");
				break;
				
			case KeyEvent.VK_F2:
				showStatus("F3 key pressed");
				break;
				
			case KeyEvent.VK_F3:
				showStatus("F3 key pressed");
				break;
		}
		repaint();
		
	}
	public void keyReleased(KeyEvent ke) {
		showStatus("Key Released.");
	}

	public void keyTyped(KeyEvent ke) {
		msg = msg+ ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g) {
		g.drawString(msg,100,100);
	}
}
