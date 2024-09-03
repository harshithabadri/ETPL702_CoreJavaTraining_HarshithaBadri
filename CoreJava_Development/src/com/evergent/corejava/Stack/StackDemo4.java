package com.evergent.corejava.Stack;
import java.util.Stack;
public class StackDemo4 {
//methods 
	public static void main(String[] args) {
	Stack myStack =new Stack();
	myStack.push("Red");// number 3
	myStack.push("blue");//number 2
	myStack.push("white");//number 1
	
	System.out.println(myStack);
	myStack.clear();
	System.out.println(myStack);
	boolean b=myStack.isEmpty();
	System.out.println(b);
	System.out.println(myStack);
	}

}
