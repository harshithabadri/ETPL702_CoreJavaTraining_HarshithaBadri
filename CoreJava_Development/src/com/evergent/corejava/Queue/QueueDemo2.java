package com.evergent.corejava.Queue;
import java.util.Queue;
import java.util.PriorityQueue;
public class QueueDemo2 {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(5);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
}
}
