package com.evergent.corejava.collections;

import java.util.LinkedHashSet;

public class CF13_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> ls=new LinkedHashSet();
		ls.add("Apple");
		ls.add("banana");
		ls.add("orange");
		ls.add("mango");
		ls.add("grapes");
		//Displaying linkedHashSet
		System.out.println("LinkedHashSet" +ls);
		//iterating throgh linkedhashset
		System.out.println("iterating through linkedhashset");
		for(String s:ls)
		{
			System.out.println(s);
		}
		//checking the contains
		System.out.println(ls.contains("mango"));
		//removing
		ls.remove("grapes");
		System.out.println(ls);
		//size
		System.out.println(ls.size());
		//clearing the linkedhashset
		ls.clear();
		System.out.println(ls);
   }
}






























