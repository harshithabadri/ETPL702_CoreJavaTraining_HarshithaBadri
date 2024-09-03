package com.everegent.corejava.AbstractMethods;
//If any class extends abstract class,that class should be override all 
//abstract methods,otherwise 
//the class will be showing compile time error.

public class ProductImpl2 extends Product{
    
	public void newProduct()
	{
		System.out.println("New Product");
	}
	public void show()
	{
		System.out.println("I am the local method");
	}
	public static void main(String[] args) {
		//Product p2=new Product (); we can only create instances to abstract variables
		Product pi=new ProductImpl2();
		pi.newProduct();
		//pi.show();  here we cannot call local methods when we create reference using abstract class
		pi.allProducts();
	}

}
