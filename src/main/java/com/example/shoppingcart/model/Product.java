package com.example.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity

public class Product {
	
	@Id
	private int productId;
	
	private String productName;
	
	@Transient
	private int productQuantity;
	
	private double productPrice;
	
	

	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public int getProductQuantity() {
		return productQuantity;
	}



	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}



	public double getProductPrice() {
		return productPrice;
	}



	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productQuantity="
				+ productQuantity + ", productPrice=" + productPrice + "]";
	}
	
	
	

}
