package com.evergent.corejava.basicprogramming;

public class BiggestOf5 {

	public static void main(String[] args) {
		int a=10,b=3,c=9,d=8,e=11;
		if(a>b && a>c && a>d && a>e)
			System.out.println("a is greater");
		else if(b>a && b>c && b>d && b>e)
			System.out.println("b is greater");
		else if(c>a && c>b && c>d && c>e)
			System.out.println("c is greater");
		else if(d>a && d>b && d>c && d>e)
			System.out.println("d is greater");
		else
			System.out.println("e is greater");
	}

}
