package com.evergent.corejava.ExceptionalHandling;

class ProductNotFound extends Exception {
	public ProductNotFound(String message)
	{
		System.out.println("Hello" +message);
	}
}
public class ProductNotFoundException
{
	int pno=160;
	public void myData() throws ProductNotFound
	{
		if(pno>150)
		{
		throw new ProductNotFound("There are no products");
		}
		else
		System.out.println("pRoduct found");
	}

public static void main(String[] args) {
	try
	{
		ProductNotFoundException p=new ProductNotFoundException();
		p.myData();
	}
	catch(Exception e)
	{
		System.out.println("handled  "+e);
	}
}
		

	}

