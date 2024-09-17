import java.sql.*;
public class UpdateName
{
	public static void main(String [] args)
	{
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studdb","root","abhi");
			Statement stmt = con.createStatement();
			String updateName = "UPDATE `studdb`.`student` SET `name` = 'Jhon' WHERE (`roll_no` = '104');"; 
			stmt.executeUpdate(updateName);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}