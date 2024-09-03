package com.evergent.corejava.basicprogramming;

public class LoopsDemo4 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(i=4;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
