package com.evergent.corejava.Map;
import java.util.HashMap;
public class HashMapDemo1 {
//put - keep values inside the hashmap
//with same key when we update different values then the last updated will be printed
//randomly stores values
//if we take null as key value in multiple times then the upadated one is printed
	public static void main(String[] args) {
		HashMap myMap=new HashMap();
		myMap.put(10,"harshitha");
		myMap.put(20,"harshini");
		myMap.put(30, "badri");
		myMap.put(20,"ammu");
		myMap.put(40,"honey");
		myMap.put(null, "abc");
		myMap.put(70, null);
		myMap.put(90, null);
		myMap.put(null, "hii");
		System.out.println(myMap);
	
	}

}
