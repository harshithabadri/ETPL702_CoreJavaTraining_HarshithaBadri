package com.evergent.corejava.Strings;

public class StringSplit1 {

	public static void main(String[] args) {
		String str="JAVA IS A POWERFUL PROGRAMMING LANGUAGE";
		//Here the str.split method splits the string str based on space and store
		//them into the array  wORDS then we access each one in the arry by using loop
		String[] WORDS=(str.split(" "));
		for(int i=0;i<WORDS.length;i++)
		{
			System.out.println(WORDS[i]);
		}


	}

}
