package com.evergent.corejava.Map;
import java.util.Hashtable;
public class HashTableDemo2 {
//doesn't accept null values and randomly printing
	public static void main(String[] args) {
		Hashtable ht=new Hashtable();
		ht.put(100, "lahari");
		ht.put(200,"harshitha");
		ht.put(100,"lahariiiii");
		ht.put(600, "vishishta");
		//ht.put(null," hi" );
		ht.put(800,"hello" );
		System.out.println(ht);
	}

}
