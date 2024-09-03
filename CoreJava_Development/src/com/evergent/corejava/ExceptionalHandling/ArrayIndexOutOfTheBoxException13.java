package com.evergent.corejava.ExceptionalHandling;

public class ArrayIndexOutOfTheBoxException13 {

	public static void main(String[] args) {
		int[] num= {1,4,6,8,3};
		try
		{
			System.out.println("accessing elmt"+num[8]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("caught "+e);
		}

	}

}
