import java.awt.*;
import javax.swing.*;

public class ScrollPaneInSwing {

	public static void main(String[] args) {
		JFrame f1 = new JFrame("My New Frame");
		
		String l1 =  new String("Abhishek Prakash Patil. Roll No.-2245 Branch: Computer Class: Third Year Government Polytechnic Karad.");
		TextArea ta = new TextArea(l1);
		
		JScrollPane jp = new JScrollPane(ta);
		f1.add(jp);
		
		f1.setSize(600,500);
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);

	}
}
