package com.evergent.corejava.Arrays;

public class DDArray4 {

	public static void main(String[] args) {
		int arr[][]=new int[5][5];
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(i==0 || j==0 || i==4 || j==4)
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
