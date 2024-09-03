package com.evergent.corejava.collections;
//Print the elements in sorted order
//Based on Binary SEarch Tree Algorithm
import java.util.TreeSet;
import java.util.Iterator;
public class CF4_TreeSetIterator {
//Set doesn't allow duplicates
	public static void main(String[] args) {
		TreeSet hs=new TreeSet();
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