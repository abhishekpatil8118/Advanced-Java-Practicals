import java.awt.*;

public class FirstJava 
{
	public static void main(String args[])
	{
		Frame fr = new Frame("First Frame");
		
		Label l1 = new Label("Click here to select Course:");
		l1.setBounds(100,100,160,30);
		fr.add(l1);
		
		CheckboxGroup cbg = new CheckboxGroup();
		
		Checkbox r1 = new Checkbox("SSC",false,cbg);
		r1.setBounds(300,100,150,30);
		
		Checkbox r2 = new Checkbox("Diploma",false,cbg);
		r2.setBounds(500,100,150,30);
		
		fr.add(r1);
		fr.add(r2);
		
		Label l2 = new Label("Select Languages:");
		l2.setBounds(100,200,160,30);
		fr.add(l2);
		
		Checkbox cb1 = new Checkbox("C");
		cb1.setBounds(300,200,150,30);
		fr.add(cb1);
		
		Checkbox cb2 = new Checkbox("C++");
		cb2.setBounds(300,250,150,30);
		fr.add(cb2);
		
		Checkbox cb3 = new Checkbox("Java");
		cb3.setBounds(300,300,150,30);
		fr.add(cb3);
		
		Checkbox cb4 = new Checkbox("Python");
		cb4.setBounds(300,350,150,30);
		fr.add(cb4);
		
		
		fr.setSize(800,500);
		fr.setLayout(null);
		fr.setVisible(true);
	}
}
