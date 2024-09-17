import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StudentRecord extends JFrame implements ActionListener
{
	JFrame f1=new JFrame("Abhishek Patil.");
	public StudentRecord()
	{
		JLabel l1,l2;
		JTextField t1,t2;
		JButton b1;
		
		l1=new JLabel("Enter Roll Number: ");
		l2=new JLabel("Enter Name: ");
		t1=new JTextField(15);
		t2=new JTextField(15);
		b1=new JButton("Save");
		
		l1.setBounds(50,50,150,25);
		l2.setBounds(50,90,150,25);
		t1.setBounds(250,50,150,25);
		t2.setBounds(250,90,150,25);
		b1.setBounds(50,130,100,30);
		
		b1.addActionListener(new ActionListener() 
		 {  
           public void actionPerformed(ActionEvent ae) 
           {       
        	   try 
        	   {
        	   	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studdb","root","abhi");
        	   	Statement stmt= con.createStatement();

        	   	String query="INSERT INTO `studdb`.`student` (`roll_no`, `name`) VALUES ('"+t1.getText()+"', '"+t2.getText()+"');";
        	   	int count=stmt.executeUpdate(query);
        	   	System.out.println("Query: "+query);
        	   	System.out.println(count+" Rows are inserted.");
        	   } 
        	   catch (SQLException e1){e1.printStackTrace();}

           }  
		 });  
		
		f1.add(l1);
		f1.add(l2);
		f1.add(t1);
		f1.add(t2);
		f1.add(b1);
		
		f1.setLayout(null);
		f1.setSize(600,500);
		f1.setVisible(true);
	}
	public static void main(String[] args) throws SQLException 
	{
		StudentRecord sr=new StudentRecord();
	}
	public void actionPerformed(ActionEvent ae) {}
}
