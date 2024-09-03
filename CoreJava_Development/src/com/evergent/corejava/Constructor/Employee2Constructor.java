package com.evergent.corejava.Constructor;

public class Employee2Constructor {
	String name;
	int age;
	double salary;
	Employee2Constructor()
	{
	System.out.println("Default Constructor");	
	}
	Employee2Constructor(String name1,int age1,double salary1)
	{
		name=name1;
		age=age1;
		salary=salary1;
	}
	/*{
	System.out.println("Name is: "+name);
	System.out.println("Age is: "+age);
	System.out.println("Salary is: "+salary);
	}*/
	void display()
	{
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Salary is: "+salary);
	}
	public static void main(String[] args) {
		new Employee2Constructor();
		Employee2Constructor ep2=new Employee2Constructor("Harshitha",21,50000);
		ep2.display();
		

	}

}
