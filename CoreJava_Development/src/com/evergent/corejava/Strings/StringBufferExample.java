package com.evergent.corejava.Strings;

public class StringBufferExample {

	public static void main(String[] args) {
		//append()
		//delete()
		//insert()
		//replace()
		//capacity()
		//length()
		StringBuffer str=new StringBuffer("Hello");
		System.out.println("Initial String"+str);
		//append
		str.append("World");
		System.out.println("After append "+str);
		//delete
		str.delete(0, 3); 
		System.out.println("Delete "+str);
		//insert
		str.insert(6,"Beautiful");
		System.out.println("Inserted "+str);
		//replace
		str.replace(0, 5, "Hi");
		System.out.println("replaced "+str);
		//capacity
		System.out.println(str.capacity());
		//length
		System.out.println("Length "+str.length());
		}
	}
