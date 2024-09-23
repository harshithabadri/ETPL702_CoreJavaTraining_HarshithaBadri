package com.evergent.corejava.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class CF10_ArrayList_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(100);
		System.out.println(list);
		Iterator i1=list.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
