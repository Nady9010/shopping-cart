package com.example.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Cart {
	
	@Id
	private int cartId;
	
	private String cartProductName;
	
	private int cartProductQuantity;
	
	private double cartProductPrice;
	
	private double cartNetValue;
	
	private double cartDiscountedValue;
	
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getCartProductName() {
		return cartProductName;
	}

	public void setCartProductName(String cartProductName) {
		this.cartProductName = cartProductName;
	}

	public int getCartProductQuantity() {
		return cartProductQuantity;
	}

	public void setCartProductQuantity(int cartProductQuantity) {
		this.cartProductQuantity = cartProductQuantity;
	}

	public double getCartProductPrice() {
		return cartProductPrice;
	}

	public void setCartProductPrice(double cartProductPrice) {
		this.cartProductPrice = cartProductPrice;
	}

	public double getCartNetValue() {
		return cartNetValue;
	}

	public void setCartNetValue(double cartNetValue) {
		this.cartNetValue = cartNetValue;
	}

	public double getCartDiscountedValue() {
		return cartDiscountedValue;
	}

	public void setCartDiscountedValue(double cartDiscountedValue) {
		this.cartDiscountedValue = cartDiscountedValue;
	}

	
	
	
	
	

}
