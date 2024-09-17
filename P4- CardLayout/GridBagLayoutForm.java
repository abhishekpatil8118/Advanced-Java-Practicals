import java.awt.*;

public class GridBagLayoutForm {

	public static void main(String[] args) 
	{
		Frame f1 = new Frame("Small Form.");
		f1.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx=0;
		gbc.gridy=0;
		f1.add(new Label("Name:"),gbc);
		
		gbc.gridx=1;
		gbc.gridy=0;
		f1.add(new TextField(15),gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		f1.add(new Label("Comments:"),gbc);

		gbc.gridx=1;
		gbc.gridy=1;
		f1.add(new TextArea(6,15),gbc);
		
		gbc.gridx=1;
		gbc.gridy=2;
		f1.add(new Button("Submit"),gbc);
		
		f1.setSize(500,400);
		f1.setVisible(true);
	}

}
