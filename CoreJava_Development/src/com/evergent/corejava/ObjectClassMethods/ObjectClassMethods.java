package com.evergent.corejava.ObjectClassMethods;

public class ObjectClassMethods {
    String name;
    int age;
    public ObjectClassMethods (String name,int age)
    {
    	this.name=name;
    	this.age=age;
    }
    public String toString()
    {
    	return "Name:"+name+"  \n Age:"+age;
    }
    	
	public static void main(String[] args) {
		ObjectClassMethods oc=new ObjectClassMethods("harshitha",21);
		System.out.println(oc);
		System.out.println(oc.hashCode());
    }
}

