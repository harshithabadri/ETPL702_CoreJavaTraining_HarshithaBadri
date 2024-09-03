package com.evergent.corejava.Arrays;

public class DDArray5 {

	public static void main(String[] args) {
		int i,j;
		int arr[][]=new int[5][5];
		int count=1;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{ 	arr[i][j]=count;
				System.out.print(" "+arr[i][j]);
				count++;
			}
			System.out.println();
		}

	}

}
