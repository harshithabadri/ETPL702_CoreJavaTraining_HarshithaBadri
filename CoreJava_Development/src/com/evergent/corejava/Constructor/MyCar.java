package com.evergent.corejava.Constructor;
class car{
	String color;
	int speed;
	car(){
		color="white";
		speed=20;
	}
	car(String color,int speed)
	{
		this.color=color;
		this.speed=speed;
	}
	void display() {
		System.out.println("color:"+color);
		System.out.println("max speed"+speed);
	}
}
public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1=new car();
		car c2=new car("red",50);
		c1.display();
		c2.display();

	}

}
