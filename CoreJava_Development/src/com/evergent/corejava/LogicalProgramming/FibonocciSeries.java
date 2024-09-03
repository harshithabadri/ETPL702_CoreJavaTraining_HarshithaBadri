package com.evergent.corejava.LogicalProgramming;

public class FibonocciSeries {

	public static void main(String[] args) {
		int a=0,b=1,i;
		System.out.print(a+" "+b);
		for(i=0;i<5;i++)
		{
			int fib=a+b;
			a=b;
			b=fib;
		
		System.out.print(" "+fib);
		}

	}

}
