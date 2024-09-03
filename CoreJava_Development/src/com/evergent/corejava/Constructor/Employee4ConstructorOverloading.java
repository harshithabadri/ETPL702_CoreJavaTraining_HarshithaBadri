package com.evergent.corejava.Constructor;

public class Employee4ConstructorOverloading {
	String name;
	int age;
	double salary;
	Employee4ConstructorOverloading()
	{
		System.out.println(" Method overloading");
	}
	Employee4ConstructorOverloading(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	Employee4ConstructorOverloading(int age,String name,double salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(salary);
		System.out.println(age);
	}
	public static void main(String[] args) {
		new Employee4ConstructorOverloading();
		Employee4ConstructorOverloading EO1=new Employee4ConstructorOverloading("HARSHITHA",21);
		Employee4ConstructorOverloading EO2=new Employee4ConstructorOverloading(19,"HARSHINI",500000);
        EO1.display();
        EO2.display();
		

	}

}
