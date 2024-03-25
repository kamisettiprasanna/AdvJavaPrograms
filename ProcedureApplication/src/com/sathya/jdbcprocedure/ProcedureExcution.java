package com.sathya.jdbcprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ProcedureExcution {
           public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","prasanna","prasanna");
			
			
			//call  the procedure
			CallableStatement callableStatement=connection.prepareCall("{call getSal(?,?)}");
			
			//set the input data
			callableStatement.setInt(1, 1002);
			
			//register  one variable to store the output
			callableStatement.registerOutParameter(2, Types.FLOAT);
			
			//Execute the procedure the output will be stored in registerd parameter
			callableStatement.executeUpdate();
			
			//print the output
			System.out.println(callableStatement.getFloat(2)); 
			
		/* TO get employee deatails 

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","prasanna","prasanna");
			
			
			//call  the procedure
			CallableStatement callableStatement1=connection1.prepareCall("{call getEmp(?,?,?,?)}");
			//set the input data
			callableStatement.setInt(1, 1002);
			
			//register  one variable to store the output
			callableStatement.registerOutParameter(2, Types.INTEGER);
			callableStatement.registerOutParameter(3,Types.VARCHAR);
			callableStatement.registerOutParameter(4, Types.FLOAT);
			//Execute the procedure the output will be stored in registerd parameter
			callableStatement.executeUpdate();
			//print the output
			System.out.println(callableStatement1.getInt(2)); 
			System.out.println(callableStatement1.getString(3)); 
			System.out.println(callableStatement1.getFloat(4)); 
			


*/
			
			

	}

}
