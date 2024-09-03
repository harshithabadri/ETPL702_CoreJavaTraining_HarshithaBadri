package com.everegent.corejava.AbstractMethods;
//If any class having one abstract method that class should be 
//declared as a abstract keyword otherwise the class
//will be showing compile time error.

public abstract class Product {
	abstract public void newProduct();
	public void allProducts()
	{
		System.out.println("All Products");
	}

}
