import java.sql.*;
import java.sql.DriverManager.*;
class JdbcDemo
{
public static void main (String args[])
{
	try
	{
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studdb", "root", "abhi");
		
		System.out. println(" Driver loaded");
		System.out.println("Connection to the database created");
		Statement st= cn.createStatement();
		String str= "select * from student";
		ResultSet rs=st.executeQuery(str);
		String text=" ";
		System.out.println("Roll Number \t Name");
		while(rs.next())
		{
			text= text+rs.getInt(1)+"\t"+rs.getString(2)+"\n";
		}
		System.out.print(text);
		st.close();
		cn.close();
	}
	catch (SQLException s)
	{System.out.println("sql error");}
}
}