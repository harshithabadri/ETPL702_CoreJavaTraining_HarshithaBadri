package com.evergent.corejava.Strings;

public class StringReverse {

	public static void main(String[] args) {
		String str="Hello world!";
		StringBuilder reverse=new StringBuilder(str).reverse();
		System.out.println(reverse);

	}

}
