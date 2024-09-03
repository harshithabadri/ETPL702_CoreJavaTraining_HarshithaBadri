package com.evergent.corejava.Constructor;

public class Employee5Constructor {
//Constructor doesn't have any return type  if write void before constuctor it will be treated as Method
	void Employee5Constructor()
	{
		System.out.println("Constuctor");
	}
	public static void main(String[] args) {
		//So we need to create object reference  for the method because we used void so its not constructor
		Employee5Constructor EC=new Employee5Constructor();
		EC.Employee5Constructor();
		
	}

}
