import java.awt.*;

public class HelloWorld {
	public static void main(String args[])
	{
		Frame f1 = new Frame("Printing Message");
		
		Label l1  = new Label("Welcome to Java"); 
		f1.add(l1);
		l1.setBounds(100,100,100,20);
		
		f1.setSize(400,300);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}
