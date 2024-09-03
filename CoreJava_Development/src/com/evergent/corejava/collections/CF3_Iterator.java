package com.evergent.corejava.collections;
import java.util.ArrayList;
import java.util.Iterator;
//ierator is used to print the elements of array one by one
public class CF3_Iterator {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
        Iterator i1=list.iterator();
        while(i1.hasNext())//it returns booloean value if next elemnet there it returns True
        {
        System.out.println(i1.next());//here it return the value of next elemnt
        //these are the 2 methods used in iterator to [print the elemnets
	}

}
}
