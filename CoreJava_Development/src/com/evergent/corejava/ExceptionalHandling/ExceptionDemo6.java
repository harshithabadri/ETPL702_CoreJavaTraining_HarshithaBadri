package com.evergent.corejava.ExceptionalHandling;
//try followed by either catch or finally block  
public class ExceptionDemo6 {
    String name=null;
    int k=2;
    public void myData()
    {
    	try
    	{
    		System.out.println("me");
    		System.out.println(name.length());
    		int t=k/0;
    		System.out.println(t);
    	}
    	finally
    	{
    		System.out.println("I am finally block");
    	}
    }
	public static void main(String[] args) {
		
		ExceptionDemo6 ed=new ExceptionDemo6();
		ed.myData();
	}

}
