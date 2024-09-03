package com.evergent.corejava.Queue;
import java.util.ArrayDeque;
public class ArrayDeque6 {
	//it follows FIFO
//offer and add used to add elements into list
	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("ram");
		ad.offer("raj");
		ad.add("shankar");
		System.out.println(ad);
//peek() printrs the first element to get removed
		System.out.println(ad.peek());
	}

}
