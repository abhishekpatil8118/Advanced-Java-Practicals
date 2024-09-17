import java.sql.*; 
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.util.*;
import java.util.Date;
public class ProjectTrial1 extends JFrame
{   
	JFrame login = new JFrame("Login");
	JFrame main = new JFrame("Home");
	JFrame form=new JFrame("");
   ProjectTrial1()
   {	
	   JTabbedPane jtp = new JTabbedPane();			//	object created of JTabbedPane
	   JPanel p1 = new JPanel();					//   \
	   JPanel p2 = new JPanel();					//	  |-->	object created of JPanel
	   JPanel p3 = new JPanel();					//   /
	   
	   p1.setLayout(null);							//	layout of JPanel1
	   
	   JPanel top = new JPanel();
	   JButton Bbutton = new JButton("JPanel Button.");
	   Bbutton.setBounds(50,50,150,25);
	   top.add(Bbutton);
	   top.setLayout(null);
	   top.setBounds(0,21,1366,100);
	   top.setBackground(Color.GRAY);
	   
	   JPanel ver = new JPanel();
	   ver.setLayout(null);
	   ver.setBounds(0,100,240,600);
	   ver.setBackground(Color.BLUE);
	   
	   
	   
	   jtp.setBounds(240,120,1000,550);
	   jtp.add(p1,"Car Accessories Form");
	   jtp.add(p2,"Edit Details");
	   jtp.add(p3,"Extra");
	   
	   	JLabel Lename=new JLabel("Editer Name: ");
		JLabel Ldate=new JLabel("Date: ");
		JLabel Lid=new JLabel("Accessories ID: ");
		JLabel Laname=new JLabel("Accessories Name: ");
		JLabel Lrec=new JLabel("Recommendation: ");
		JLabel Lrange=new JLabel("Range: ");
		JLabel Lprice=new JLabel("Price: ");
		JLabel Lstock=new JLabel("Available Stock: ");
		
		Date date = new Date();
		JTextField Tename=new JTextField("Editer Name",25);
		JTextField Tdate=new JTextField("  /  /    ",25);
		JTextField Tid=new JTextField("Accessories ID: ",25);
		JTextField Taname=new JTextField("Accessories Name: ",25);
			JRadioButton Rrec1=new JRadioButton("Businessman");
			JRadioButton Rrec2=new JRadioButton("Community");
			JRadioButton Rrec3=new JRadioButton("None");
			JRadioButton Rrange1=new JRadioButton("Low");
			JRadioButton Rrange2=new JRadioButton("Medium");
			JRadioButton Rrange3=new JRadioButton("High");
		JTextField Tprice=new JTextField("Price: ",25);
		JTextField Tstock=new JTextField("Stock",25);
		
		JButton Bsave=new JButton("Save");
		JButton Breset=new JButton("Reset");
		
		Lename.setBounds(100,30,150,25);
		Ldate.setBounds(600,30,150,25);
		Lid.setBounds(100,100,150,25);
		Laname.setBounds(100,140,150,25);
		Lrec.setBounds(100,180,150,25);
			Rrec1.setBounds(130,210,150,25);
			Rrec2.setBounds(280,210,150,25);
			Rrec3.setBounds(430,210,150,25);
		Lrange.setBounds(100,250,150,25);
			Rrange1.setBounds(130,280,150,25);
			Rrange2.setBounds(280,280,150,25);
			Rrange3.setBounds(430,280,150,25);
		Lprice.setBounds(100,320,150,25);
		Lstock.setBounds(100,360,150,25);
		Bsave.setBounds(100,450,90,30);
		Breset.setBounds(400,450,90,30);
		
		Tename.setBounds(250,30,250,25);
		Tdate.setBounds(700,30,250,25);
		Tid.setBounds(250,100,250,25);
		Taname.setBounds(250,140,250,25);
		Tprice.setBounds(250,320,250,25);
		Tstock.setBounds(250,360,250,25);
		
	    try
	    {
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studdb", "root", "abhi");
         Statement stmt = conn.createStatement();
			
		 Bsave.addActionListener(new ActionListener()
		 {  
            public void actionPerformed(ActionEvent e) 
            {    
				/*try
				{
					String sqlInsert = "INSERT INTO `studdb`.`student` VALUES('"+t1.getText()+"', '"+t2.getText()+"',"+t3.getText()+")";
			         System.out.println("The SQL query is: " + sqlInsert);  
			         int countInserted = stmt.executeUpdate(sqlInsert);
			         System.out.println(countInserted + " records inserted.\n");
				}
				catch(SQLException ex) 
				{
					ex.printStackTrace();
				}*/
            }  
		 });   
		
		 Breset.addActionListener(new ActionListener() 
		 {  
            public void actionPerformed(ActionEvent e) 
            {       
				
					/*t1.setText("");
					t2.setText("");
					t3.setText("");*/
					
            }  
		 });  
		
        
      } 
	  catch(SQLException ex) 
	   {
         ex.printStackTrace();
	   }
	    
	    ButtonGroup bg1 = new ButtonGroup();
	    ButtonGroup bg2 = new ButtonGroup();
	    bg1.add(Rrec1);
	    bg1.add(Rrec2);
	    bg1.add(Rrec3);
	    bg2.add(Rrange1);
	    bg2.add(Rrange2);
	    bg2.add(Rrange3);
		  
	  p1.add(Lename);	
	  p1.add(Ldate);		
	  p1.add(Lid);
	  p1.add(Laname);
	  p1.add(Lrec);
	  p1.add(Rrec1);
	  p1.add(Rrec2);
	  p1.add(Rrec3);
	  p1.add(Rrange1);
	  p1.add(Rrange2);
	  p1.add(Rrange3);
	  p1.add(Lrange);
	  p1.add(Lprice);
	  p1.add(Bsave);
	  p1.add(Breset);
	  
	  p1.add(Tename);
	  p1.add(Tdate);
	  p1.add(Tid);
	  p1.add(Taname);
	  p1.add(Tprice);
	  
	  form.add(top);
	  form.add(ver);
	  form.add(jtp);
	  form.setLayout(null);
	  form.setSize(getMaximumSize());
	  form.setVisible(true);
   }
   public static void form(String args[])
   {
     new ProjectTrial1();
   }
}