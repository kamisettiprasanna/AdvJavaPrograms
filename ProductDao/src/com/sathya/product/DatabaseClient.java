package com.sathya.product;

import java.sql.SQLException;
import java.util.List;

public class DatabaseClient {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ProductDao productdao=new ProductDao();
		/*int res1=productdao.createProductTable();
		System.out.println("Table created successfully"+res1);*/
		
		
		
		
		/*int res3=productdao.saveProduct(new product2(1,"saop",99.0));
		System.out.println(res3);
		int res4=productdao.saveProduct(new product2(2,"rice",899.0));
		System.out.println(res4);
		int res5=productdao.saveProduct(new product2(3,"shampoo",10.0));
        System.out.println(res5);*/
        
        
      /*  product2 product=productdao.getProductById(1);  
    	System.out.println(product);*/
    	
    	
    	
    	
    	
    	/*List<product2> pro=productdao.getAllProducts();
		for(product2 p: pro)
			System.out.println(p);*/
		
		
		
		
		
		
		/*int updatecount=productdao.updateByPrice(400,50);

		System.out.println(updatecount+" rows updated");*/
		
		
		
		
		
		
		
		
		
		/*int deleterecord=productdao.deleteById(1);
		if(deleterecord==1) {
			System.out.println("deleted record successfully");
		}
		else
			System.out.println("deleted record  not successfully");
	}



*/





	
	
	
	
	/*double deleterecord=productdao.deleteByPrice(1699);
	if(deleterecord==1) 
		System.out.println("deleted record successfully");
	
	else
		System.out.println("deleted record  not successfully");

	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*int deletetable=productdao.dropTable();
	System.out.println("deleted successfully");*/

}}
