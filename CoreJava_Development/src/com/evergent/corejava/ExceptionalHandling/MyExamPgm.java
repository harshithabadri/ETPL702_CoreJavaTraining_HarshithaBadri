package com.evergent.corejava.ExceptionalHandling;
class EmailException extends Exception
{
	public EmailException(String msg)
	{
		System.out.println(msg);
	}
}
public class MyExamPgm {
	
	public void gmail(String gmail) throws EmailException
	{
	   if(!(gmail.contains("@")) || !(gmail.contains(".")))
	   {
		   throw new EmailException("Invalid email");
	   }
	   else
	   {
		   System.out.println("correct email");
	   }
	}

	public static void main(String[] args) {
		try
		{
			MyExamPgm mp=new MyExamPgm ();
			mp.gmail("examplegmail.com");
		}
		catch( EmailException e)
		{
			System.out.println("Invalid formot   " +e.getMessage());
		}

	}

}
