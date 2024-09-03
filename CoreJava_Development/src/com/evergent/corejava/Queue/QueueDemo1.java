package com.evergent.corejava.Queue;
import java.util.PriorityQueue;
import java.util.Queue;
//add and offer are used to add methods into queue
//follow insertion order
public class QueueDemo1 {
    public static void main(String[] args) {
    	Queue<Integer> q=new PriorityQueue<>();
    	q.add(10);
    	q.offer(29);
    	q.add(30);
    	q.add(50);
    	System.out.println(q);
	}

}
