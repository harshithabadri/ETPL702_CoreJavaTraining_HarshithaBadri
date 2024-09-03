package com.evergent.corejava.Stack;
import java.util.Stack;
public class StackDemo5 {

	public static void main(String[] args) {
	Stack myStack =new Stack();
	myStack.push("apple");// number 3
	myStack.push("banana");//number 2
	myStack.push("cherry");//number 1
	myStack.push("date");
	
	System.out.println(myStack);
	//peeking the element
	String a=(String) myStack.peek();
	System.out.println("top element" +a);
	String b=(String) myStack.pop();
	System.out.println("removed element" +b);
	System.out.println("after popping"+myStack);
	boolean c=myStack.isEmpty();
	System.out.println("empty or not  "+c);
	int s=myStack.search("date");
	System.out.println(s);
	//if element is not present we get output as -1
	//clearing stack
	myStack.clear();
	System.out.println(myStack);
	}

}
