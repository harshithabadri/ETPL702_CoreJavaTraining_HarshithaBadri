package com.evergent.corejava.Constructor;

public class Employee3ConstuctorThis {
	String name;
	int age;
	double salary;
	Employee3ConstuctorThis()
	{
		System.out.println("Default Constructor");
	}
	Employee3ConstuctorThis(String name,int age,double salary)
	{
		//this is used to point instance variables here no need to create new variables again in the above method we can use which were there
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
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
