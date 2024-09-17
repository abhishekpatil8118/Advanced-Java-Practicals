import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class Myform implements ActionListener 
{
	JFrame f1=new JFrame(); 
	JTextField t1,t2;
	public Myform()
	{
		JButton b1 = new JButton("Save");
		t1 = new JTextField();
		t2 = new JTextField();
		t1.setBounds(100,50,150,25);
		t2.setBounds(100,100,150,25);
		b1.setBounds(100,150,100,25);
		
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studdb","root","abhi");
					Statement stmt = conn.createStatement();
					String query = "INSERT INTO `studdb`.`student` (`roll_no`, `name`) VALUES ('"+t1.getText()+"', '"+t2.getText()+"');";
					int count = stmt.executeUpdate(query);
					System.out.println(count+" rows inserted...");
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		f1.add(t1);
		f1.add(t2);
		f1.add(b1);
		f1.setSize(500,400);
		f1.setLayout(null);
		f1.setVisible(true);
	}
	public static void main(String[] args) 
	{
		Myform mf = new Myform();
	}
	public void actionPerformed(ActionEvent ae)
	
	{}
}
