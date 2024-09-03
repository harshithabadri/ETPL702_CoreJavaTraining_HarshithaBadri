package com.evergent.corejava.oops;
class MyData{
	void my()
	{
		System.out.println("Meth overriding");
	}
}
public class MethodOverridingClasses extends MyData {
    
	public static void main(String[] args) {
		MethodOverridingClasses moc=new MethodOverridingClasses();
		moc.my();
		
		
	}

}
