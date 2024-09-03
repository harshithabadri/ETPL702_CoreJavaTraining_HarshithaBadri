package com.evergent.corejava.ExceptionalHandling;

public class ExceptionDemo8Throws2  {
    String name=null ;
    public void myData() throws NullPointerException
    {
    	System.out.println(name.length());
    }
    public void myChange() throws NullPointerException
    {
    	myData();
    	System.out.println("My change method");
    }
	public static void main(String[] args) {
		try
		{
		ExceptionDemo8Throws2  ed=new ExceptionDemo8Throws2 ();
		ed.myChange();
		}
		catch(Exception e)
		{
			System.out.println("I can handle " + e);
		}
		}
}
