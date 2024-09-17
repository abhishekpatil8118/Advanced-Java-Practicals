import java.awt.*;

public class Newspaper {
	public static void main(String args[])
	{
		Frame f1 = new Frame("Displaying List");
		
		List l1 = new List(5,true);
		
		l1.add("Indian Express");
		l1.add("India Today");
		l1.add("Pudhari");
		l1.add("Lokmat");
		l1.add("Sakal");
		l1.add("Tarun Bharat");
		l1.add("Samana");
		
		f1.add(l1);
		l1.setBounds(200,100,150,100);
		
		f1.setSize(700,500);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}
