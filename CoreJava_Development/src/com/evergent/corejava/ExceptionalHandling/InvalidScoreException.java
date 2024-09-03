package com.evergent.corejava.ExceptionalHandling;
//unchecked exception
class InvalidScore extends RuntimeException
{
	InvalidScore(String name)
	{
		super(name);
	}
}
public class InvalidScoreException   {
   public static void validScore(int score) throws InvalidScore
   {
	   if(score<0 || score>100)
	   {
		   throw new InvalidScore("score should be between 0 and 100");
	   }
	   else
	   {
		   System.out.println("valid score");
	   }
   }
	public static void main(String[] args) {
		try
		{
			InvalidScoreException ie=new InvalidScoreException();
			ie.validScore(167);
		}
		catch(InvalidScore e)
		{
			System.out.println("caught "+e.getMessage());
			System.out.println(e);
		}

	}

}
