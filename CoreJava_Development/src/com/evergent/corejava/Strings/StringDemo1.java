package com.evergent.corejava.Strings;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1=new String("JAVA");
		String s2=new String("JAVA");
		if(s1==s2)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
	    }
		if(s1.equals(s2))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

}
}
