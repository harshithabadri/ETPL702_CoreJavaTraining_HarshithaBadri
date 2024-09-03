package com.evergent.corejava.basicprogramming;

public class LoopsDemo6 {

	public static void main(String[] args) {
		int i,j,count=25;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				//count--;
				System.out.print(" " +count);
				count--;
			}
			System.out.println();
		}

	}

}
