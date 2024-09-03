package com.evergent.corejava.basicprogramming;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		name =sc.next();
		int age;
		age=sc.nextInt();
		System.out.println("My Name is:" +name);
		System.out.println("My age is: " +age);
}
}
