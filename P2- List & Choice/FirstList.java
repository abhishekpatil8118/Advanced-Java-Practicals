import java.awt.*;

public class FirstList {
	public static void main(String args[])
	{
		Frame f1 = new Frame("Displaying List");
		
		List l1 = new List(4);
		
		l1.add("Summer");
		l1.add("Winter");
		l1.add("Rainy");
		
		f1.add(l1);
		l1.setBounds(200,100,150,70);
		
		f1.setSize(700,500);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}
