package com.evergent.corejava.ExceptionalHandling;
//we should follow exceptional hirarchial
public class ExceptionDemo4 {
    String name=null;
    int k=2;
    public void myData()
    {
    	try
    	{
    		System.out.println("one");
    		//System.out.println(name.length());
    		int t=k/0;
    		System.out.println(t);
    		System.out.println(name.length());

    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
	public static void main(String[] args) {
		ExceptionDemo4 ed=new ExceptionDemo4();
		ed.myData();
		}
	}
