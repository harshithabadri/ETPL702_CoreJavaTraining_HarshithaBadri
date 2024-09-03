package com.evergent.corejava.collections;
import java.util.ArrayList;
class book
{
	String name;
	public book(String name)
	{
		this.name=name;
	}
	public String toString()//whatever we write in toString method is printed directly no need to call
	{
		return name;
	}
}
public class CF9_ArrayLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b1=new book("let us c");
		book b2=new book("java");
		book b3=new book("python");
		ArrayList a=new ArrayList();
		a.add(b1);
		a.add(b2);
		a.add(b3);
		System.out.println(a);

	}

}
