package com.evergent.corejava.oops;

public class MethodOverloading {
	void method()
	{
		System.out.println("this is method overloading");
	}
	void method(int a,int b)
	{
		System.out.println(a+b);
	}
	void method(int a,String b)
	{
		System.out.println("I am "+b+" my age is"+a);
	}

	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.method();
		mo.method(5, 6);
		mo.method(19,"Lahari");
		

	}

}
