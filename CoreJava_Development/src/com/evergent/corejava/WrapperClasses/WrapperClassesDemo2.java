package com.evergent.corejava.WrapperClasses;

public class WrapperClassesDemo2 {

	public static void main(String[] args) {
		int a=10;
		Integer i1=new Integer(a);
		int a1=i1.intValue();
		System.out.println(a1);
		
		double d=10.123;
		Double d1=new Double(d);
		Double d2=d1.doubleValue();
		System.out.println(d2);
		
	    float f=1.0f;
		Float f1=new Float(f);
		Float f2=f1.floatValue();
		System.out.println(f2);
		
		byte b=10;
		Byte b2=new Byte(b);
		Byte b3=b2.byteValue();
		System.out.println(b3);

	}

}
