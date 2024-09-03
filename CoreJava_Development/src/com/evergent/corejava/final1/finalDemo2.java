package com.evergent.corejava.final1;
class myClass{
	final public void myProducts()
	{
		System.out.println("My produts");
	}
}
public class finalDemo2 extends myClass {
//final class methods can't be override 
	final String name="india";
	public void newProducts()
	{
		System.out.println("new products");
	}
	public void myData() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		finalDemo2 fd=new finalDemo2();
		fd.myData();
		fd.newProducts();
		fd.myProducts();

	}

}
