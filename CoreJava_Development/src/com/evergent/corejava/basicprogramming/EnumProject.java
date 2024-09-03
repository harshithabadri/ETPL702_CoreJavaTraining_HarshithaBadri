package com.evergent.corejava.basicprogramming;
enum color{
	Red,Green,Blue;
}
enum News{
	East,West,North,South;
}
enum ABCproducts{
	Laptop,Desktop,Tabs;
}
enum Days{
	Monday,tuesday,wednesday,thursaday,friday,saturday;
}

public class EnumProject {

	public static void main(String[] args) {
		color c=color.Red;
		System.out.println(c);
		News s=News.West;
		System.out.println(s);
		ABCproducts t=ABCproducts.Laptop;
		System.out.println(t);
		Days d=Days.tuesday;
		System.out.println(d);
	   
	}

}
