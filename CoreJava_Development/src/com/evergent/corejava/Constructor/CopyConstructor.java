package com.evergent.corejava.Constructor;

public class CopyConstructor {
 String name;
 int age;
 public CopyConstructor(String name,int age)
 {
	 this.name=name;
	 this.age=age;
 }
 public CopyConstructor(CopyConstructor C)
 {
	 this.name=C.name;
	 this.age=C.age;
 }
 public void display()
 {
	 System.out.println("name"
			  +name);
	 System.out.println("age" + age);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstructor c1=new CopyConstructor("ha",21);
		CopyConstructor c2=new CopyConstructor(c1);
		c1.display();
		c2.display();
		

	}

}
