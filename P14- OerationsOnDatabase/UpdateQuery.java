import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class UpdateQuery
{
	public static void main(String [] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studdb","root","abhi");
			PreparedStatement st = con.prepareStatement("UPDATE `studdb`.`student` SET `roll_no` = '3' WHERE (`name` = 'Abhishek Patil');");
			st.executeUpdate();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}