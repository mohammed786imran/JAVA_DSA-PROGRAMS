package MYPACKAGE;
import java.sql.*;
public class JDBC {
   public static void main(String args[1] throws Exception) {
		// TODO Auto-generated method stub
   Class.forName("Oracle.jdbc.oracle Driver");
   connection con=DriverManager.getConnection("jdbc:Oracle:thin:localhostt:154:x17","UserName","Password");
   		Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select *from Employee");
        while(rs.next())
        {
        	System.out.print(rs.getInt(1)+"......."+getString(2)+".....");
        }
        con.close();
	}
}


