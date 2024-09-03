package com.evergent.corejava.ExceptionalHandling;
class InsufficientFunds extends Exception
{
	public InsufficientFunds(String msg)
	{
		super(msg);
	}
}
public class InsufficientFundsException {
    public static void withdraw(double amount) throws InsufficientFunds
    { 
    	double balance=50000;
    	if(amount > balance)
    	throw new InsufficientFunds("InsufficientFunds for withdrawl");
    	else
    	System.out.println("withdraw successfull");
    }
	public static void main(String[] args) {
		try
		{
		InsufficientFundsException ife=new InsufficientFundsException();
		ife.withdraw(56000);
		}
		catch(InsufficientFunds e)
		{
			System.out.println("caught exception "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("pgm continues after handling");

	}

}
