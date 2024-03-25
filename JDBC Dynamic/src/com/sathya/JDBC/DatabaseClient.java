package com.sathya.JDBC;

import java.sql.SQLException;
import java.lang.*;

public class DatabaseClient {

	public static void main(String[] args) throws SQLException {
		
		EmployeeDao employeedao=new EmployeeDao();
		int res1=employeedao.save(new Employee(1001,"prasanna",78990));
		System.out.println("Data inserted Successfully"+res1);
		
		int res2=employeedao.save(new Employee(1002,"saikumar",78988));
		System.out.println("Data inserted Successfully"+res2);
		
		//reading data from db based on empid
		Employee emp=employeedao.findById(1001);
		System.out.println(emp);
		Employee emp1=employeedao.findById(1003);
		System.out.println(emp1);
		//deleting data from db based on empid
		EmployeeDao employeedao1=new EmployeeDao();

		int deletecount=employeedao1.deleteById(1001);
		if(deletecount==1) {
			System.out.println("deleted"+deletecount+"successfully");
			
		}
		else

			System.out.println("deleted"+deletecount+" not successfully");
			
			
		
	}

}
