package com.evergent.corejava.ExceptionalHandling;
public class ExceptionDemo7Throws {
    String name=null;
    int k=0;
    public void myData() throws NullPointerException
    {
    	System.out.println("one");
    	System.out.println(name.length());
    	System.out.println("end");
    }
	public static void main(String[] args) {
		try
		{
			ExceptionDemo7Throws ed=new ExceptionDemo7Throws();
			ed.myData();
		}
		catch(Exception e)
		{
			System.out.println("I can HANDLE"+e);
			System.err.println("I can handle"+e);
		}
	}

}
