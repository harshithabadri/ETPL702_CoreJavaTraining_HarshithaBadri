package com.evergent.corejava.MultiThreading;
class mine implements Runnable
{

	public void run() {
		for(int i=0;i<50;i++)
		{
			System.out.println(i);
		}
		
	}
	
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		mine m=new mine();
		Thread t=new Thread(m);
		t.start();
		
	}

}
