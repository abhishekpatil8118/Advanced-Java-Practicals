import java.awt.*;
import javax.swing.*;

public class StatesInJCombo 
{
	public static void main(String[] args) 
	{
		Frame f1 = new Frame("States");
		
		String arr[] = {"Maharashtra","Goa","Karanataka","Gujrat","Benglore"};
		JComboBox jb = new JComboBox(arr);
		f1.add(jb);
		
		f1.setSize(600,500);
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);
	}

}
