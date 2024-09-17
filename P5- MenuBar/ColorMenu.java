import java.awt.*;
public class ColorMenu 
{
	public static void main(String[] args) 
	{
		Frame f1 = new Frame("Color Menu");
		MenuBar mb1  = new MenuBar();
		
		Menu red  = new Menu("Red");
		Menu blue = new Menu("Blue");
		Menu green = new Menu("Green");			// Creating Menus
		Menu black = new Menu("Black",true);
		
		mb1.add(red);
		mb1.add(blue);
		mb1.add(green);							// Adding menus to MenuBar
		mb1.add(black);
		
		black.setEnabled(false);
		f1.setMenuBar(mb1);
		
		f1.setLayout(null);
		f1.setSize(500,400);
		f1.setVisible(true);
	}
}
