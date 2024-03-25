package com.sathya.procedures;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class procedure {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	//load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//create connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","prasanna","prasanna");
		//call the procedure
		CallableStatement c=connection.prepareCall("{call getEmp(?,?,?,?)}");
		//set the input
		c.setInt(1, 1002);
		//register one variable to store output
		c.registerOutParameter(2, Types.INTEGER);
		c.registerOutParameter(3, Types.VARCHAR);
		c.registerOutParameter(4, Types.DOUBLE);
		//execute procedure
		c.executeUpdate();
		//print the data
		System.out.println(c.getInt(2));
		System.out.println(c.getString(3));
		System.out.println(c.getDouble(4));
		
	
connection.close();
}
}