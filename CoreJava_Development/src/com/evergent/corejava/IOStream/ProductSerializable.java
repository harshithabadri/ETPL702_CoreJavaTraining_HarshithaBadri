package com.evergent.corejava.IOStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
public class ProductSerializable {

	public static void main(String[] args) {
		try
		{
		FileOutputStream fos=new FileOutputStream("C://myData/Products.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Product p1=new Product(100,"book",45);
		Product p2=new Product(101,"pen",40);
		Product p3=new Product(102,"pencil",30);
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		System.out.println("Write object into text file");
		oos.close();
		}
		catch(Exception e)
		{
			System.out.println("Handled "+e);
		}

	}

}
