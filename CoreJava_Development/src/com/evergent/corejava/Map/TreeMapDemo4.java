package com.evergent.corejava.Map;

import java.util.Map;
import java.util.TreeMap;
//print based on sorted order
public class TreeMapDemo4 {

	public static void main(String[] args) {
		TreeMap<Integer,String> hm=new TreeMap<>();
		hm.put(100, "lahari");
		hm.put(101,"harshitha");
		hm.put(99,"slahariiiii");
		hm.put(109, "vishishta");
		System.out.println(hm);
for(Map.Entry<Integer,String> entry:hm.entrySet())
{
	System.out.println("ID: "+entry.getKey() +"value" +entry.getValue());
}
	}

}
