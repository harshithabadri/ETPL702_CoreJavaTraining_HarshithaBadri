package com.everegent.corejava.AbstractMethods;

public class ProductImp3 extends Product2{
	public ProductImp3()
	{
		System.out.println("local class constructor");
	}
public void newProduct() {
	System.out.println("NEW PRODUCTS");
	
}
public void show()
{
	System.out.println("local method of productImp3 class");
}
public static void main(String[] args) {
	
Product2 p2=new ProductImp3();//executes only abstract classmethods
p2.allProducts();
p2.newProduct();
//p2.show(); error

}
}
