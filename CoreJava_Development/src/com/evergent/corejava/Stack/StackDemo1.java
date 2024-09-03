package com.evergent.corejava.Stack;
import java.util.Stack;
public class StackDemo1 {

	public static void main(String[] args) {
	Stack myStack =new Stack();
	myStack.push("Red");// number 3
	myStack.push("blue");//number 2
	myStack.push("white");//number 1
	
	System.out.println(myStack);
	System.out.println(myStack.pop());
	System.out.println(myStack.pop());
	System.out.println(myStack.pop());
	
	System.out.println(myStack);
	}

}
