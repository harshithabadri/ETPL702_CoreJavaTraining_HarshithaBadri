package com.evergent.corejava.Map;
import java.util.HashMap;
public class HashMapDemo3 {
    
	public static void main(String[] args) {
	HashMap<String,String> hm=new HashMap<>();
	hm.put("s", "lahari");
	hm.put("b","harshitha");
	hm.put("a","slahariiiii");
	hm.put("c", "vishishta");
	System.out.println(hm);
	for(String q:hm.keySet())
	{
		System.out.println(q);
	}
	}
	}
