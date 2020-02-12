import java.sql.*;
public class connection
{
	public static Connection cn;
	public static Connection mycon()
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return cn;
		
	}

}
