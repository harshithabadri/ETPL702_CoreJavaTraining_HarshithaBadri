package com.evergent.corejava.javabeans;
import java.io.Serializable;
 class product implements Serializable
{
	private int pno;
	private String pname;
	private double price;
	public product(int pno,String pname,double price)
	{
		this.pno=pno;
		this.pname=pname;
		this.price=price;
	}

	public int getPno()
	{
		return pno;
	}
	
	public String getPname()
	{
		return pname;
	}
	
	public double getPrice()
	{
		return price;
	}
}
public class ProductImp {

	public static void main(String[] args) {
		 product e=new  product (500,"item",600.0);
		 System.out.println("product no. "+e.getPno());
		 System.out.println("product name "+e.getPname());
		 System.out.println("product price. "+e.getPrice());
		 
	}

}
