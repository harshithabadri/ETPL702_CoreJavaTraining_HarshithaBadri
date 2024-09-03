package com.evergent.corejava.WrapperClasses;

import java.util.ArrayList;

public class ArrayList_WrapperClass {

	public static void main(String[] args) {
		//JDK 1.44
		int a=10;
		Integer i1=new Integer(a);
		ArrayList mylist=new ArrayList();
		mylist.add(i1);
		Integer i2=new Integer(100);
		mylist.add(i2);
		mylist.add(new Integer(200));
		System.out.println(mylist);
		
		//JDK 1.5
		ArrayList mylist1=new ArrayList();
		mylist1.add(200);
		System.out.println(mylist1);
		System.out.println(mylist1.get(0));
		

	}

}
