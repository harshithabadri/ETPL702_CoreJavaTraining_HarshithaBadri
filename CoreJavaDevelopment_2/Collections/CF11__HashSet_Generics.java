package com.evergent.corejava.collections;
import java.util.HashSet;
import java.util.Iterator;
public class CF11__HashSet_Generics {

	public static void main(String[] args) {
		HashSet<Integer> list=new HashSet<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(100);
		//doesn't allow duplicates
		System.out.println(list);
		Iterator i1=list.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
