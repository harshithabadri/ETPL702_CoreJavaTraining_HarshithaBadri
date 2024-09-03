package com.evergent.corejava.oops;

public class PersonEncapsulation {
	int age=19;;
	String name="honey";
	String address="metpally";
	void PersonDetails()
	{
		System.out.println(name+" is"+age+ " years old.She is from "+address);
	}
	public static void main(String[] args) {
		PersonEncapsulation PE =new PersonEncapsulation();
		PE.PersonDetails();
		
	}
}
