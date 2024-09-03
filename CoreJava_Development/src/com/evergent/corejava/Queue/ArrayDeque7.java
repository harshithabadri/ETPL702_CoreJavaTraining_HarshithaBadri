package com.evergent.corejava.Queue;

import java.util.ArrayDeque;

public class ArrayDeque7 {
//offerFirst,offerLast,addFirst,addLast
//peekFirst,peekLast,peek
//pollFirst,pollLast,poll,remove,removeFirst,removeLast
	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("ram");
		ad.offer("raj");
		ad.add("shankar");
		System.out.println(ad);
		System.out.println(ad.peekLast());
		System.out.println(ad.peekFirst());
		System.out.println(ad.pollLast());
		System.out.println(ad.pollFirst());
		System.out.println(ad.removeFirst());
		

	}

}
