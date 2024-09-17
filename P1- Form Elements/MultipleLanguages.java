import java.awt.*;

public class MultipleLanguages {
	public static void main(String args[])
	{
		Frame f1 = new Frame("Languages");
		
		Label lan = new Label("Select Languages you known:");
		f1.add(lan);
		lan.setBounds(40,100,250,20);
		
		Checkbox c1, c2, c3, c4;
		
		c1 = new Checkbox("Marathi");
		c2 = new Checkbox("Hindi");
		c3 = new Checkbox("Sanskrit");
		c4 = new Checkbox("English");
		
		f1.add(c1);
		c1.setBounds(300,100,100,20);
		f1.add(c2);
		c2.setBounds(300,150,100,20);
		f1.add(c3);
		c3.setBounds(300,200,100,20);
		f1.add(c4);
		c4.setBounds(300,250,100,20);
		
		f1.setSize(800,500);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}
