package com.evergent.corejava.Interface;
//Java supports multiple inheritance through interfaces
//there is no ambiguity here because both interfaces has only signatures but not implementation 
//as ambiguity(confusion) there in multiple inheritance using class
//here we have to override all the methods from both interfaces
public class BookImpl3 implements Book,NewBook {
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
	public void myNewBook()
	{
		System.out.println("new interface method");
	}
	public static void main(String[] args) {
		BookImpl3 Book =new BookImpl3();
		Book.bookTitle();
		Book.bookAuthor();
		Book.bookPrice();
		Book.show();
		Book.myNewBook();
		}
}
