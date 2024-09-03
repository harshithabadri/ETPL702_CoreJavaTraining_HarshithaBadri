package com.evergent.corejava.static1;

public class staticdemo4 {
	 static String cname="INDIA";
	 String name="HARSHITHA";
	 static public void myData()
	 {
		 System.out.println("My Data");
	 }
	 public void show()
	 {
		 myData();
		 System.out.println("non static method");
	 }
		public static void main(String[] args) {
			System.out.println(cname);
			//System.out.println(name);
			myData();
			staticdemo4 sd4=new staticdemo4();
			sd4.show();

		}

	}
