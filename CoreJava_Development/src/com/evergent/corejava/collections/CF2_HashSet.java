package com.evergent.corejava.collections;
import java.util.HashSet;
public class CF2_HashSet {
//Set doesn't allow duplicates
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(200);
		hs.add(100);
		hs.add(200);
		hs.add(300);
		System.out.println(hs);
		

	}

}
