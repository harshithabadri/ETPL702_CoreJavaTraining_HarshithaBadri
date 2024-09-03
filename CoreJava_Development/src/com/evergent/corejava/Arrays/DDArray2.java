package com.evergent.corejava.Arrays;

public class DDArray2 {

	public static void main(String[] args) {
		int i,j;
		int ar[][]=new int[5][5];
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(i==j)
				{
			        ar[i][j]=7;
					System.out.print(" "+ar[i][j]);
				}
				else
				{
					ar[i][j]=1;
					System.out.print(" "+ar[i][j]);
				}
			}
			System.out.println();
		}
		

	}

}
