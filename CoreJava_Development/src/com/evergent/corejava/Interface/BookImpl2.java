package com.evergent.corejava.Interface;

public class BookImpl2 implements Book {
	//When we implements interface in class that class should override all interface methods
	//otherwise the class is showing compiletime error
	public void bookTitle()
	{
		System.out.println("CORE JAVA");
	}
	public void bookAuthor()
	{
		System.out.println("ORACLE CROP");
	}
	public void bookPrice() 
	{
		System.out.println("Rs 500");
		
	}
	public void show()
	{
		System.out.println("This is BookImpl1 class method");
	}
	public static void main(String[] args) {
		//we cannot create object to interface but we can create reference to interface
		//we can only access the interface methods if we use the object creation in the below way
		//otherwise it shows compile time error
		Book Book =new BookImpl2();
		Book.bookTitle();
		Book.bookAuthor();
		Book.bookPrice();
		//Book.show();
		}
}
