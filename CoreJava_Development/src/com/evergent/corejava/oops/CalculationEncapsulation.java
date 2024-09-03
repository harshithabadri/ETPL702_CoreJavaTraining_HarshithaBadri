package com.evergent.corejava.oops;

public class CalculationEncapsulation {
	int a=5,b=6,c;
	void addition()
	{
		c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		CalculationEncapsulation CE=new CalculationEncapsulation();
		CE.addition();
		
		

	}

}
