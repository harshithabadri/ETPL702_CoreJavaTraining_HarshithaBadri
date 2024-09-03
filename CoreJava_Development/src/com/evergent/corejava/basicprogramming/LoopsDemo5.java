package com.evergent.corejava.basicprogramming;

public class LoopsDemo5 {

	public static void main(String[] args) {
		int i,j,count=0;
        for(i=1;i<=5;i++)
        {
        	for(j=1;j<=5;j++)
        	{
        		count++;
        		System.out.print(" " +count);
        	}
        	System.out.println();
        }

	}

}
