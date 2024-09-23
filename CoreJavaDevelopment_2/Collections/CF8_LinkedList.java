package com.evergent.corejava.collections;
import java.util.LinkedList;
public class CF8_LinkedList {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(100);
		list.add(200);
		list.add(400);
		list.add("ammu");
		list.addFirst("Harshitha");
		list.addLast("badri");
		list.remove(4);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		
	}

}
