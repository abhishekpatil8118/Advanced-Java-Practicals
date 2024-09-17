import java.awt.*;

public class GridOf5X5 {
	public static void main(String args[])
	{
		Frame f1 = new Frame("Demonstrating use of Grid");
		GridLayout gl = new GridLayout(5,5,10,10);
		f1.setLayout(gl);
		
		for(int i=1;i<=25;i++)
		{
		Button bi = new Button("Button "+ i);
		f1.add(bi);
		}
		
		f1.setSize(700,500);
		f1.setVisible(true);
	}
}
