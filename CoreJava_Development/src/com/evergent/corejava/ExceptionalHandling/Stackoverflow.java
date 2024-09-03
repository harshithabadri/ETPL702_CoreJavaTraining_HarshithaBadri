package com.evergent.corejava.ExceptionalHandling;

public class Stackoverflow {

	public static void main(String[] args) {
		try
		{
			recursiveMethod();
		}
		catch(StackOverflowError e)
		{
			System.out.println("STACKOVERFLOW CAUGHT: "+e.getMessage());
		}

	}
	public static void recursiveMethod()
	{
		recursiveMethod();
	}

}
