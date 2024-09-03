package com.evergent.corejava.Constructor;
class Employee{
public Employee()
{
}
public Employee(int eno)
{
	System.out.println("Employee number"+eno);
	}
}
public class Employee6ConstructorSuper1 extends Employee {
//Super keyword is used to call super call constructor.
	int eno;
	String ename;
	double sal;
	Employee6ConstructorSuper1(){
		System.out.println("Default constructor");
	}
	Employee6ConstructorSuper1 (int eno,String ename,double sal )
	{
		super(eno);
		this.ename=ename;
		this.sal=sal;
	}
	public void display()
	{
		System.out.println("ename is"+ename);
		System.out.println("sal is:"+sal);
	}
	public static void main(String[] args) {
		new Employee6ConstructorSuper1();
		Employee6ConstructorSuper1 emp=new Employee6ConstructorSuper1(123,"HARSHITHA",5000);
		emp.display();
	}
		

	}
