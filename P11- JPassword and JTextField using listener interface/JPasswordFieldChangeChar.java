import java.awt.*;
import javax.swing.*;
public class JPasswordFieldChangeChar extends JFrame
{
	JPasswordField jpf = new JPasswordField(10); 
	JLabel l1 = new JLabel("Password: ");
	public JPasswordFieldChangeChar()
	{
		add(l1);
		add(jpf);
		jpf.setEchoChar('#');
		setTitle("Abhishek Patil.");
	}
	public static void main(String[] args) 
	{
		JPasswordFieldChangeChar f1 = new JPasswordFieldChangeChar();
		
		f1.setSize(500,400);
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);
	}

}
