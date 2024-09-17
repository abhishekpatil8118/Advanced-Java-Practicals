import java.awt.*;

public class GridBagLayoutExample1 
{
	public static void main(String args[])
	{
		Frame fr1 = new Frame("Abhishek Patil");
		fr1.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0;
		fr1.add(new Button("Buttone One"),gbc);
		
		gbc.gridx=1;
		gbc.gridy=0;
		fr1.add(new Button("Button Two"),gbc);
		
		gbc.ipady = 20;
		gbc.gridx=0;
		gbc.gridy=1;
		fr1.add(new Button("Button Three"),gbc);

		gbc.gridx=1;
		gbc.gridy=1;
		fr1.add(new Button("Button Four"),gbc);
		
		gbc.gridwidth = 2;
		gbc.ipadx = 90;
		gbc.gridx=0;
		gbc.gridy=2;
		fr1.add(new Button("Button Five"),gbc);
		
		fr1.setSize(500,400);
		fr1.setVisible(true);
		
	}
}
