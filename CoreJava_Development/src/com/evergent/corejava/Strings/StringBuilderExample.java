package com.evergent.corejava.Strings;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("HARSHITHA");
		//append()
		//insert()
		//delete()
		//reverse()
		//replace()
		System.out.println(str.append("BADRI"));
		str.insert(10,"BADRI" );
		System.out.println(str);
		System.out.println(str.delete(10, 15));
		System.out.println(str.reverse());
		System.out.println(str.replace(6,9,"ni"));

	}

}
