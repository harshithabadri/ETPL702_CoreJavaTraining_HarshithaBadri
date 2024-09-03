package com.evergent.corejava.Strings;

public  class StringSplit2 {
//For each loop
	public static void main(String[] args) {
		String str="JAVA IS A POWERFUL LANGUAGE";
		String[] words=str.split(" ");
		for(String s:words)
		{
		System.out.println(s);
	}

}
}
