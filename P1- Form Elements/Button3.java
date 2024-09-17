import java.awt.*;
public class Button3 {

	public static void main(String args[])
	{
		Frame f1 = new Frame("Buttons");
		
		Button 	ok, reset, cancel;
		
		ok = new Button("Ok");
		reset = new Button("Reset");
		cancel = new Button("Cancel");
		
		f1.add(ok);
		ok.setBounds(70,100,60,25);
		f1.add(reset);
		reset.setBounds(150,100,60,25);
		f1.add(cancel);
		cancel.setBounds(230,100,60,25);
		
		f1.setSize(800,500);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}
