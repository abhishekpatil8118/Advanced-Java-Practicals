import java.awt.Frame;
import java.awt.List;

public class Cities {
	public static void main(String args[])
	{
		Frame f1 = new Frame("Displaying List");
		
		List l1 = new List(6);
		
		l1.add("Kolhapur");
		l1.add("Pune");
		l1.add("Mumbai");
		l1.add("Delhi");
		l1.add("Chennai");
		l1.add("Kolkatta");
		l1.add("Bangalore");
		l1.add("New York");
		l1.add("Jaipur");
		l1.add("Nashik");
		
		f1.add(l1);
		l1.setBounds(200,100,150,150);
		
		f1.setSize(700,500);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}
