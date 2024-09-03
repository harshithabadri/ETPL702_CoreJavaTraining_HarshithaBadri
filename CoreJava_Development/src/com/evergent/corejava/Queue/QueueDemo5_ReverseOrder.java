package com.evergent.corejava.Queue;
//priority queue reverse order using comparator
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueDemo5_ReverseOrder {
//randomly printing   
	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
		q.offer(8);
		q.offer(2);
		q.offer(5);
		q.add(9);
		q.add(100);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}
}

