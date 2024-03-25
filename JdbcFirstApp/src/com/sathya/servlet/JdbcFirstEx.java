package com.sathya.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcFirstEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step1:Load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println(" Driver loaded successfully.....");
		// step2:create a connection

		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","prasanna","prasanna");
		System.out.println("connection created");
	   // step 4:close the connection
		connection.close();
		System.out.println("connection  closed  successfully");
		   // close the connection
		
		

	}

}
