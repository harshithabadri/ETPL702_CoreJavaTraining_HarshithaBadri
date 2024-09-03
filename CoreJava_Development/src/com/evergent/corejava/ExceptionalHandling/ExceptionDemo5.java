package com.evergent.corejava.ExceptionalHandling;
//finally is a block if exception occurs or not finally block will be executed
public class ExceptionDemo5 {
   public static void main(String[] args) {
		try
		{
			System.out.println("one");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("I am finally block");
		}
	}

}
