package com.evergent.corejava.static1;

public class staticdemo5 {
    static
    {
    	System.out.println("Static block is executed first:no need to call explicitly");
    }
    static String cname="INDIA";
    static public void myData()
    {
    	System.out.println("MY DATA");
    }
	public static void main(String[] args) {
		System.out.println(staticdemo5.cname);
		staticdemo5.myData();

	}

}
