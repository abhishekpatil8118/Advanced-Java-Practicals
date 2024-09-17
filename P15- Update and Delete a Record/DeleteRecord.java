import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
public class DeleteRecord 
{
	JFrame f1=new JFrame("Abhishek Patil.");
	Connection con;
	public DeleteRecord()
	{
		JLabel l1,l2,l3;
		JTextField t1,t2,t3;
		JButton b1,b2;
		
		l1=new JLabel("Enter Roll Number: ");
		l2=new JLabel("Enter Name: ");
		l3=new JLabel("Enter a roll No. to delete: ");
		
		t1=new JTextField(15);
		t2=new JTextField(15);
		t3=new JTextField(15);
		
		b1=new JButton("Save");
		b2=new JButton("Delete record");
		
		l1.setBounds(50,50,150,25);
		l2.setBounds(50,90,150,25);
		l3.setBounds(50,220,180,25);
		
		t1.setBounds(250,50,150,25);
		t2.setBounds(250,90,150,25);
		t3.setBounds(250,220,150,25);
		
		b1.setBounds(50,130,100,30);
		b2.setBounds(50,260,150,30);
		try 
		{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studdb","root","abhi");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	   	
		b1.addActionListener(new ActionListener() 
		 {  
           public void actionPerformed(ActionEvent ae) 
           {       
        	   try 
        	   {
        		Statement stmt= con.createStatement();
        	   	String query="INSERT INTO `studdb`.`student` (`roll_no`, `name`) VALUES ('"+t1.getText()+"', '"+t2.getText()+"');";
        	   	int count=stmt.executeUpdate(query);
        	   	System.out.println("Query: "+query);
        	   	System.out.println(count+" Rows are inserted.");
        	   } 
        	   catch (SQLException e1){e1.printStackTrace();}
           }  
		 });  
		
		b2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
			  try 
			  {
				Statement stmt1= con.createStatement();
				String deleteQuery="DELETE FROM `studdb`.`student` WHERE (`roll_no` = '"+t3.getText()+"');";
				int deleteCount=stmt1.executeUpdate(deleteQuery);
				System.out.println(deleteQuery);
				System.out.println(deleteCount+" rows deleted.");
			  }
			  catch (SQLException e) 
			  {
				e.printStackTrace();
			  }
			}
		});
		
		f1.add(l1);
		f1.add(l2);
		f1.add(l3);
		f1.add(t1);
		f1.add(t2);
		f1.add(t3);
		f1.add(b1);
		f1.add(b2);
		
		f1.setLayout(null);
		f1.setSize(600,500);
		f1.setVisible(true);
	}
	public static void main(String[] args) throws SQLException 
	{
		DeleteRecord sr=new DeleteRecord();
	}
}