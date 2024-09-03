package com.evergent.corejava.Stack;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
public class StackDemo6 {
public static void main(String[] args) {
		Stack<String> myStack =new Stack<>();
		myStack.push("Red");// number 3
		myStack.push("blue");//number 2
		myStack.push("white");//number 1
		System.out.println(myStack);
		System.out.println("3 ways of printing the elements in stack");
		System.out.println("Enumeration iterator");
		Enumeration e=myStack.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("Iterator");
		Iterator i=myStack.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("For each loop");
		for(String s:myStack)
		{
			System.out.println(s);
		}
   }
}
