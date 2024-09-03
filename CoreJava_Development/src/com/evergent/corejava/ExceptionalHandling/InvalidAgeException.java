package com.evergent.corejava.ExceptionalHandling;
class InvalidAge extends Exception
{
	public InvalidAge(String message)
	{
	System.out.println("Hello" +message);
}
}
public class InvalidAgeException {
	public static void checkAge(int age) throws InvalidAge
	{
		if(age<18)
		throw new InvalidAge("Age must be older than 18");
		else
		{
			System.out.println("you are eligible");
		}
	}

	public static void main(String[] args) {
		try
		{
		InvalidAgeException  ie=new InvalidAgeException ();
		ie.checkAge(15);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
