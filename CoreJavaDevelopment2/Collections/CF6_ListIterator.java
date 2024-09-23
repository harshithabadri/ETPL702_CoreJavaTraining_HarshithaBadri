package com.evergent.corejava.collections;
//list iterator checks both previous and next 
import java.util.ArrayList;
import java.util.ListIterator;
public class CF6_ListIterator {
   
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("100");
		list.add("200");
		list.add("90");
		list.add("50");
		
		ListIterator li=list.listIterator();
		li.add("hi");
		li.add("welcome");
		
		while(li.hasNext())
		{
			//System.out.println(li.next());
		String s=(String)li.next();
		System.out.println(s);
		if(s.equals("200"))
			li.remove();
		}
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}

	}

}
