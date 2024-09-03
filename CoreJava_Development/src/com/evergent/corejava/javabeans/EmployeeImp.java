package com.evergent.corejava.javabeans;
import java.io.Serializable;
 class Employee implements Serializable
{
	private int eno;
	private String ename;
	private double sal;
	public void setEno(int eno)
	{
		this.eno=eno;
	}
	public int getEno()
	{
		return eno;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public String getEname()
	{
		return ename;
	}
	public void setsal(double sal)
	{
		this.sal=sal;
	}
	public double getsal()
	{
		return sal;
	}
}
public class EmployeeImp {

	public static void main(String[] args) {
		 Employee e=new  Employee ();
		 e.setEno(500);
		 e.setEname("har");
		 e.setsal(50000.0);
		 System.out.println("emp no. "+e.getEno());
		 System.out.println("emp name "+e.getEname());
		 System.out.println("emp no. "+e.getsal());
		 
	}

}
