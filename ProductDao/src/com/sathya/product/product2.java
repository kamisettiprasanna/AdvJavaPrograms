package com.sathya.product;

public class product2 {
	int ProductId;
	String productName;
	double productPrice;
	@Override
	public String toString() {
		return "Product2 [ProductId=" + ProductId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	public product2(int productId, String productName, double productPrice) {
		super();
		ProductId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
}