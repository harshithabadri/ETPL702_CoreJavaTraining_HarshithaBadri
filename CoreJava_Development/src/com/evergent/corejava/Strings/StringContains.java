package com.evergent.corejava.Strings;

public class StringContains {

	public static void main(String[] args) {
		String str="the quick brown fox jumps over the lazy dog";
		String str1="the quick brown ooofox jumps over the lazy dog";
		String str2="the quick brown oooFox jumps over the lazy dog";
		String substr="fox";
		System.out.println(str.contains(substr));
		System.out.println(str1.contains(substr));
		System.out.println(str2.contains(substr));
	}

}
