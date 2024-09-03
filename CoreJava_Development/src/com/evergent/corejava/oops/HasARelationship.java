package com.evergent.corejava.oops;

public class HasARelationship{
	void show()
	{
		System.out.println("Has a Relation");
	}

	public static void main(String[] args) {
		HasARelationship has=new HasARelationship();
		has.show();
		CalculationEncapsulation ce=new CalculationEncapsulation();
		ce.addition();
		
	}

}
