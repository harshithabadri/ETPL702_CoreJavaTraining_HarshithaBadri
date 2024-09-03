package com.evergent.corejava.Queue;
import java.util.ArrayDeque;
public class ArrayDeque8 {

	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("banana");
		ad.add("apple");
		ad.addFirst("orange");
		ad.addLast("mango");
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());

	}

}
