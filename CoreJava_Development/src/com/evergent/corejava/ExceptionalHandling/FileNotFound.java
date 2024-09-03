package com.evergent.corejava.ExceptionalHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class FileNotFound {

	public static void main(String[] args) {
		try
		{
			File f=new File("C:/Users/zharshitha.badri/1723629754945_CoreJAVA-ExamPaper (1).txt");
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		

	}

}
