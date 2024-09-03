package com.evergent.corejava.collections;
import java.util.ArrayList;
public class CF12_ArrayList_forEachObject {
//we usee object here instead of iterator
//by using object we can use generics and also we can enter different datatypes
	public static void main(String[] args) {
		ArrayList<Object> myList=new ArrayList<>();
		myList.add(100);
		myList.add("HARSHITHA");
		myList.add("ramesh");
		myList.add(55.5);
		for(Object o:myList)
		{
			System.out.println(o);
		}
		

	}

}
