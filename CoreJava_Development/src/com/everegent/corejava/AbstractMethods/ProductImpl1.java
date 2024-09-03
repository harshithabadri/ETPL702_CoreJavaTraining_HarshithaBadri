package com.everegent.corejava.AbstractMethods;
//If any class extends abstract class,that class should be override all 
//abstract methods,otherwise 
//the class will be showing compile time error.

public class ProductImpl1 extends Product{
    
	public void newProduct()
	{
		System.out.println("New Product");
	}
	public void show()
	{
		System.out.println("I am the local method");
	}
	public static void main(String[] args) {
		
		ProductImpl1 pi=new ProductImpl1();
		pi.newProduct();
		pi.show();
		pi.allProducts();
	}

}
