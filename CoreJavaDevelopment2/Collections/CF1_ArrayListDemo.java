package com.evergent.corejava.collections;
import java.util.ArrayList;
public class CF1_ArrayListDemo 
{
//list allows duplicates
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(100);
		list.add(200);
		list.add(400);
		list.add(100);
		System.out.println(list);
	}
}
