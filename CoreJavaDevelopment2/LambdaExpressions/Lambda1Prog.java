package com.evergent.java8.LambdaExpressions;
//Generally we won't create object to interface.But by using Anonymous inner class we can
 interface Person1
 {
	abstract public void eat();
 }

public class Lambda1Prog {

	public static void main(String[] args) {
		// \\Anonymous Inner class
		Person1 p1=new Person1() {
			
			public void eat() {
				System.out.println("Eat..");
			}
			
		} ;
		p1.eat();
		//  \\
	}

}
