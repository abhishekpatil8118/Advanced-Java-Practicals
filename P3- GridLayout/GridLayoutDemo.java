import java.awt.*;

public class GridLayoutDemo {
	public static void main(String args[])
	{
		Frame f1 = new Frame("Grid Layout Demo");
		GridLayout gl = new GridLayout(3,2,10,10);
		f1.setLayout(gl);
		
		for(int i=1;i<=5;i++)
		{
		Button bi = new Button("Button "+ i);
		f1.add(bi);
		}
		
		f1.setSize(700,500);
		f1.setVisible(true);
	}
}
