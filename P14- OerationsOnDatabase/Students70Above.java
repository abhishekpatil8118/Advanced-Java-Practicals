import java.sql.*;
public class Students70Above 
{
	public static void main(String args[])
	{
		try 
 	   {
 	   	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studdb","root","abhi");
 	   	Statement stmt= con.createStatement();

 	   	String query="select * from `studdb`.`student` where marks>70;";
 	   	ResultSet rs=stmt.executeQuery(query);
 	   	System.out.println("Query: "+query);
 	   	
 	    String text="";
 	   System.out.println("Following are the students whose marks are above 70: \n");
		System.out.println("Roll NO. \t Name \t Marks");
		while(rs.next())
		{
			text= text+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\n";
		}
		System.out.print(text);
 	   } 
 	   catch (SQLException e1){e1.printStackTrace();}
	}
}
