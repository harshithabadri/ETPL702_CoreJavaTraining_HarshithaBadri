package com.evergent.corejava.oops;
class BaseClass extends CalculationEncapsulation{
    public void show()
    {
	System.out.println("I am Base class");
}
}
public class Inheritance extends BaseClass {

	public static void main(String[] args) {
	   Inheritance ih=new Inheritance();
	   ih.show();
	   ih.addition();

	}

}
