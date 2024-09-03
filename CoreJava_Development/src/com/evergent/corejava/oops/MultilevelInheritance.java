package com.evergent.corejava.oops;
class father
{
	void f(){
	System.out.println("I am Ftaher");
	}
}
class mother extends father{
	void m() {
	System.out.println("I am Mother");
}
}
class children extends mother{
	void c() {
	System.out.println("we are Children");
}
}
public class MultilevelInheritance extends children{

	public static void main(String[] args) {
		MultilevelInheritance mi=new MultilevelInheritance();
		mi.f();
		mi.m();
		mi.c();
		
		

	}

}
