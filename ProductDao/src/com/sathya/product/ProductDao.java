package com.sathya.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 class ProductDao {
	//creating table
	 public int createProductTable(){

	Connection connection=null;
	Statement statement=null;
	int count=0;
	try
	{
		//get the connection
		connection=DBconnection.createConnection();
		statement=connection.createStatement();
		count=statement.executeUpdate("create table product2(productId number,productName varchar2(20),productPrice number)");
		System.out.println("table created successfully"+count);
		
	
		
}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return count;
	
	}
	 
	 //inserting 
	 public int saveProduct(product2 product) throws SQLException {
			Connection connection=null;
			PreparedStatement preparedstatement=null;
			int count1=0;
			try
			{
				//get the connection
				connection=DBconnection.createConnection();
				preparedstatement=connection.prepareStatement("insert into product2 values(?,?,?)");
				//adding data into parameters
				preparedstatement.setInt(1,product.getProductId());
				preparedstatement.setString(2,product.getProductName());
				preparedstatement.setDouble(3,product.getProductPrice());
				
				count1=preparedstatement.executeUpdate();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
				finally {
					if(connection!=null)
						connection.close();
					if(preparedstatement!=null)
						preparedstatement.close();
				}
			return count1;
				
		}
	 
	 //getting details based on id
	 
	 public static product2 getProductById(int productId) {
         product2 product=null;
		
		try(Connection connection=DBconnection.createConnection();

			PreparedStatement preparedstatement =connection.prepareStatement("select * from product2 where productId=?"))
		{
			
			
	
			//set the data
			preparedstatement.setInt(1,productId);
			
			//execute the query
			ResultSet resultset=preparedstatement.executeQuery();
			
			if(resultset.next())
			{
				product=new product2(productId, null, productId);
				product.setProductId(resultset.getInt(1));
				product.setProductName(resultset.getString(2));
				product.setProductPrice(resultset.getDouble(3));
				
				
				
				
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return product;
	
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public List<product2> getAllProducts() {
			
			
			List<product2> products=new ArrayList<product2>();
			try(Connection connection=DBconnection.createConnection();
					Statement statement=connection.createStatement()){
				//execute the query
				ResultSet resultset=statement.executeQuery("select * from product2");
				
				while(resultset.next())
				{
					product2 product=new product2(0, null, 0);
					product.setProductId(resultset.getInt(1));
					product.setProductName(resultset.getString(2));
					product.setProductPrice(resultset.getDouble(3));
					
					products.add(product);
				
			}
				
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
		return products;
 }
	 
	 
	 
	 //update by price  
	 
	 
	 public int updateByPrice(double priceRange, double IncrementValue)
		{
			int count=0;
			try(Connection connection=DBconnection.createConnection();
			PreparedStatement preparedstatement=connection.prepareStatement("update product2 set ProductPrice=ProductPrice+? where ProductPrice>?"))			
			{
				preparedstatement.setDouble(1, priceRange);
				preparedstatement.setDouble(2, IncrementValue);
			
				count=preparedstatement.executeUpdate();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return count;
		}
	 
	 
	 
	 
	 public int deleteById(int productId) throws SQLException
		{
			int count=0;
			try(Connection connection=DBconnection.createConnection();
				PreparedStatement preparedstatement=connection.prepareStatement("delete from product2 where productId=?"))
			{
				preparedstatement.setInt(1,productId);
				count=preparedstatement.executeUpdate();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return count;
		}

	 
	 


	 public double deleteByPrice(double productPrice) throws SQLException
		{
			int count=0;
			try(Connection connection=DBconnection.createConnection();
				PreparedStatement preparedstatement=connection.prepareStatement("delete from product2 where productPrice=?"))
			{
				preparedstatement.setDouble(1,productPrice);
				count=preparedstatement.executeUpdate();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return count;
		}
	 
	 
	 public int dropTable() {
			

		   
         // Establishing a connection to the database
     		try(Connection connection=DBconnection.createConnection();
         Statement statement = connection.createStatement() ) 
     		{
         // Executing the SQL command to drop the table
         statement.executeUpdate("DROP TABLE product2");
         System.out.println("Table dropped successfully.");
     } catch (SQLException e) {
         // Handling any SQL exceptions
         e.printStackTrace();
     }
				return 0;
	
	 
	 }
 }