package com.evergent.corejava.IOStream;
import java.io.Serializable;
public class Product implements Serializable{
	private int pid;
	private String pname;
	private double price;
    public Product()
    {
    	System.out.println("Default Constructor");
    }
    public Product(int pid,String pname,double price)
    {
    	this.pid=pid;
    	this.pname=pname;
    	this.price=price;
    } 
	public int getpid()
	{
		return pid;
		
	}
	public String getpname()
	{
		return pname;
		
	}
	public double getprice()
	{
		return price;
		
	}
}
