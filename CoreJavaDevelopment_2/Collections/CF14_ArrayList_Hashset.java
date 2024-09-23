package com.evergent.corejava.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
public class CF14_ArrayList_Hashset {
//Comparing the list and Set using equals method
	public static void main(String[] args) {
	List<String> al=new ArrayList<String>();
	al.add("CoreJava");
	al.add("J2EE");
	al.add("J2SE");
	al.add("My Java");
	al.add("Core JAVA");
    System.out.println(al);
    
    HashSet <String>  sl=new HashSet<String>();
    sl.add("Core Java");
	sl.add("J2EE");
	sl.add("J2SE");
	sl.add("My Java");
	sl.add("Core JAVA");
	System.out.println(sl);
	
	if(al.equals(sl))
	{
		System.out.println("Same");
	}
	else
	{
		System.out.println("not same");
	}
	
	System.out.println(al.contains(sl));
    
	}
	}
