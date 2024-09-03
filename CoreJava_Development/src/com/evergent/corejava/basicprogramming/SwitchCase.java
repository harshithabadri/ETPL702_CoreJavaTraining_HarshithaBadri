package com.evergent.corejava.basicprogramming;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		a=sc.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("monday");
				break;
			case 3:
				System.out.println("tuesday");
				break;
			case 4:
				System.out.println("wedday");
				break;
			case 5:
				System.out.println("thursday");
				break;
			case 6:
				System.out.println("Sunday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Enter Valid Number");
		}
		

	}
}

