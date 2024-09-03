package com.evergent.corejava.IOStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class ProductDeserializable {
   public static void main(String[] args) {
	   try {
		   Product p=new Product();
		FileInputStream fis=new FileInputStream("C://myData/Products.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		while((p=(Product)ois.readObject())!= null)
		{
			System.out.println("product data:"+p.getpid() +p.getpname() +p.getprice());
		}
		
	} catch (Exception e) {
		
		System.out.println("end of file");
		e.printStackTrace();
	} 
	   
		

	}

}
