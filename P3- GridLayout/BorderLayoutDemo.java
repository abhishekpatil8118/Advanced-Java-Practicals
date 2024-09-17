import java.awt.*;

public class BorderLayoutDemo {
	public static void main(String args[])
	{
		Frame f1 = new Frame();
		BorderLayout bl = new BorderLayout();
		f1.setLayout(bl);
		
		
			Button b1 = new Button("North");
			f1.add(b1, BorderLayout.NORTH);
			
			Button b2 = new Button("East");
			f1.add(b2, BorderLayout.EAST);
			
			Button b3 = new Button("South");
			f1.add(b3, BorderLayout.SOUTH);
			
			Button b4 = new Button("West");
			f1.add(b4, BorderLayout.WEST);
			
			Button b5 = new Button("Center");
			f1.add(b5, BorderLayout.CENTER);
		
		f1.setSize(700,500);
		f1.setVisible(true);
	}
}
