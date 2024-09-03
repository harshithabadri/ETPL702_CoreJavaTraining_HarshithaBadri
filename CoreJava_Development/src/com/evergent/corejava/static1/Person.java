package com.evergent.corejava.static1;

public class Person {
    static String name="sai";
    int age=21;
    String add="WARANGAL";
    public void display()
    {
    	name="welcome";
    	System.out.println(name);
    	System.out.println(age);
    	System.out.println(add);
    }
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p.name);
		p.display();
		Person p1=new Person();
		System.out.println(p1.name);

	}

}
