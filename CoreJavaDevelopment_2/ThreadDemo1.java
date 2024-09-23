package com.evergent.corejava.MultiThreading;
//class extends Thread
class myClass extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		myClass mc=new myClass();
		mc.setPriority(5);
		mc.start();
		myClass mc2=new myClass();
		mc2.setPriority(1);
		mc2.start();
		

	}

}
