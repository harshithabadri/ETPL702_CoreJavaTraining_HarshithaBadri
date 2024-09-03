package com.evergent.corejava.ExceptionalHandling;
//there are two exceptions in class.Developer can handle one after another
//if two exceptions are 
public class ExceptionDemo3 {
    String s=null;
    int k=10;
    public void myData()
    {
    try
    {    System.out.println(s.length());
    	int m=k/0;
       // System.out.println(s.length());
    	System.out.println(m);
    }
    catch(NullPointerException e)
    {
    	System.out.println(e);
    }
    catch(ArithmeticException e)
    {
    	System.out.println(e);
    }
    }
	public static void main(String[] args) {
		
		ExceptionDemo3 ed=new ExceptionDemo3();
		ed.myData();
	}

}
