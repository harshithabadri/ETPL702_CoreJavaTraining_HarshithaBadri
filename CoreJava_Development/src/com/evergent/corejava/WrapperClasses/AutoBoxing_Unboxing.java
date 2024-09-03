package com.evergent.corejava.WrapperClasses;

public class AutoBoxing_Unboxing {

	public static void main(String[] args) {
		//Auto Boxing
				int a=10;
				Integer i1=new Integer(a);
				System.out.println(i1);
				
				//Auto Unboxing
				
				int a1=i1.intValue();
				System.out.println(a1);
				
				//Autoboxing of character
				char c='a';
				Character c1=new Character(c);
				System.out.println(c1);
				
				//AutoUNboxing of char
				
				char c2=Character.valueOf(c1);
				System.out.println(c2);

	}

}
