package com.evergent.corejava.Interface;
//again we have to override the methods from two interfaces
public class BookImpl4 implements Book,MyNewData {
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
	public void dataInfo() {
		System.out.println("Method from other interface");
	}
	public static void main(String[] args) {
		BookImpl4 Book =new BookImpl4();
		Book.bookTitle();
		Book.bookAuthor();
		Book.bookPrice();
		Book.show();
		Book.myNewBook();
		Book.dataInfo();
		}
}
