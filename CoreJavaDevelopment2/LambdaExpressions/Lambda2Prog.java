package com.evergent.java8.LambdaExpressions;
//we use functional interface to reduce the code
 @FunctionalInterface
 interface Person2
 {
	abstract public void eat();
 }

public class Lambda2Prog {

	public static void main(String[] args) {
		 
		Person2 p2=() -> { //-> lamda expression for functional interface
			
			 {
				System.out.println("Rich Food...");
			  } 			
		};
        p2.eat();
	}

}
