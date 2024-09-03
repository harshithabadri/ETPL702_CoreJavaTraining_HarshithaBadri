package com.evergent.corejava.collections;
import java.util.HashSet;
import java.util.Iterator;
public class CF2_HashSet_ITERATOR {
//Set doesn't allow duplicates
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(200);
		hs.add(100);
		hs.add(200);
		hs.add(300);
		System.out.println(hs);
		Iterator i1=hs.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
