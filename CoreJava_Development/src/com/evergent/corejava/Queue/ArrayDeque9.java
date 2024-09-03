package com.evergent.corejava.Queue;
import java.util.ArrayDeque;
public class ArrayDeque9 {
//poll,remove,pollFirst,removeFirst
	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque();
		ad.add("harshitha");
		ad.add("venugopal");
		ad.add("sujatha");
		ad.add("harshini");
        System.out.println(ad);
        System.out.println(ad.poll());
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
	}

}
