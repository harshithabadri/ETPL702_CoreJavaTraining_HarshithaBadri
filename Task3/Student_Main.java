package com.evergent.corejava.Task3;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Student_Main 
{
	private static StudentInterface student;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentInterface book=new StudentImpl();
		for(;;){
			System.out.println("1. Add Student 2.Search by id 3.displayAll 4. exit");
			int no=sc.nextInt();
			switch(no){
			case 1:System.out.println("Enter the id");
			   String id=sc.next();
			   System.out.println("Enter the name");
			   String StudentName=sc.next();
			   System.out.println("Enter the grade");
			   int grade=sc.nextInt();
			   Student b=new Student();
			   b.setid(id);
			   b.setName(StudentName);
			   b.setgrade(grade);
			   String message=student.addName(b);
			   System.out.println(message);
			   break;
			case 2:System.out.println("Enter the id");
		   	   String id1=sc.next();
		   	   book.searchByID(id1);
		   	   break;
		  			
		case 3:book.getAllstudentDetails();
			break;
		case 4:System.exit(0);
			}
		}
}
}
	