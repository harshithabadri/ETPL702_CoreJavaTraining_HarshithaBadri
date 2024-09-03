package com.evergent.corejava.ExceptionalHandling;

public class ExceptionalDemo18_MultipleThrows {
    String s=null;
    int k=0;
	public void myData() throws ArithmeticException,NullPointerException
	{
		System.out.println("one");
		System.out.println(s.length());
		int d=10/k;
		System.out.println(d);
		System.out.println("end");
	}
	public static void main(String[] args) {
		try {
			ExceptionalDemo18_MultipleThrows ed=new ExceptionalDemo18_MultipleThrows();
			ed.myData();
		}
		catch(Exception e)
		{
			System.out.println("Handled "+e);
		}

	}

}
