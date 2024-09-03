package com.evergent.corejava.Arrays;

public class DDArray1 {

	public static void main(String[] args) {
		int ar[][]=new int[5][5];
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				ar[i][j]=7;
				System.out.print(" "+ar[i][j]);
			}
			System.out.println();
		}

	}

}
