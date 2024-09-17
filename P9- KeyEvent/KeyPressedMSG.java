import java.applet.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPressedMSG extends Applet implements KeyListener
{
	String msg = "";
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent arg0) {
		showStatus("Key Pressed");
	}
	public void keyReleased(KeyEvent arg0) {
		showStatus("Key released");
	}
	public void keyTyped(KeyEvent arg0) {
		showStatus("key Typed");
	}
}
