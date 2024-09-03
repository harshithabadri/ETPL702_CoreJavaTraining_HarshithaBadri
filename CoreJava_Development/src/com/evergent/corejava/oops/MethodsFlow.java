package com.evergent.corejava.oops;

public class MethodsFlow{
	//No arguments No return value
	public void NANR()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	//Arguments no return valuue
	public void ANR(int a,int b)
	{
		System.out.println(a*b);
	}
	//Arguments and Return value
	public int AR(int a,int b)
	{
		return(a+b);
	}
	//No arguments return value
	public String NAR()
	{
		return("Ammu");
	}
	public static void main(String[] args) {
		MethodsFlow mf=new MethodsFlow();
		mf.NANR();
		mf.ANR(4, 5);
		int s=mf.AR(5,6);
		System.out.println(s);
		String t=mf.NAR();
		System.out.println(t);

	}

}
