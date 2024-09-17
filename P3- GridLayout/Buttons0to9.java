import java.awt.*;
public class Buttons0to9 {
	public static void main(String args[]) 
	{
		Frame f1 = new Frame("Printing 0 to 9 in Button");
		GridLayout gl = new GridLayout(4,3,10,10);
		f1.setLayout(gl);
		
		for(int i=0;i<=9;i++)
		{
		Button bi = new Button("Button "+ i);
		f1.add(bi);
		}
		
		f1.setSize(500,500);
		f1.setVisible(true);
	}
}
