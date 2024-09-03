package com.evergent.corejava.ExceptionalHandling;

public class ExceptionDemo2 {
     String name=null;
     public void myData()
     {
    	 try {
    		 System.out.println("one");
    		// System.out.println(name.length());
    		// after the exception remaining all statements are not executed
    		 System.out.println("two");
    		 System.out.println(name.length());
    	 }
    	 catch(NullPointerException e)
    	 {
    		 System.out.println("I can handle this exception"+e);
    	 }
     }
	public static void main(String[] args) {
		ExceptionDemo2 ed=new ExceptionDemo2();
		ed.myData();

	}

}

