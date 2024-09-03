package com.evergent.corejava.Interface;

public class BookImpl1 implements Book {
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
		BookImpl1 Book =new BookImpl1();
		Book.bookTitle();
		Book.bookAuthor();
		Book.bookPrice();
		Book.show();
		}
}
