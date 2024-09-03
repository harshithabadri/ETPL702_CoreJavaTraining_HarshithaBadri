package com.evergent.corejava.javabeans;

import java.io.Serializable;

public class StudentBean implements Serializable {
	private String sname;
	private int sno;
	private String address;
	public void setsname(String sname)
	{
		this.sname=sname;
	}
	public void setsno(int sno)
	{
		this.sno=sno;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
    public String toString()
    {
    	return "student no: " +sno+ "\n student name : "+sname+ "\n student address "+address;
    	
    }
	public static void main(String[] args) {
		StudentBean sb=new StudentBean();
		sb.setsno(100);
		sb.setsname("sai");
		sb.setAddress("metpally");
		System.out.println(sb);
	}

}
