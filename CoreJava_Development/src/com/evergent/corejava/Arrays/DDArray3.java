package com.evergent.corejava.Arrays;

public class DDArray3 {

	public static void main(String[] args) {
		int i,j;
		int arr[][]=new int[5][5];
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(i==j || (i+j==4))
				{
					arr[i][j]=7;
					System.out.print(" "+arr[i][j]);
				}
				else
				{
					arr[i][j]=1;
					System.out.print(" "+arr[i][j]);
				}
			}
			System.out.println();
		}
	}

}
