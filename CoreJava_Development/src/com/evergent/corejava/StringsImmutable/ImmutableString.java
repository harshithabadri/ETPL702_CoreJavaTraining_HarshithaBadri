package com.evergent.corejava.StringsImmutable;

public final class ImmutableString {
	private final String value;
	public ImmutableString(String value)
	{
		this.value=value;
	}
	public String myValue()
	{
		return value;
	}
	public String toString()
	{
		return value;
	}

	public static void main(String[] args) {
		ImmutableString iss=new ImmutableString("HARSHITHA");
		System.out.println(iss.myValue());
		System.out.println(iss.toString());
     
	}

}
