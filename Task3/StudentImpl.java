package com.evergent.corejava.Task3;
import java.util.HashSet;
import java.util.Set;

public class StudentImpl implements StudentInterface {
	Set<Student> studentSet=null;
	public StudentImpl() {
		studentSet=new HashSet<Student>();
	}
	
	
	public String addName(Student b) {
		studentSet.add(b);
		return b.getid();
	} 


	public void searchByID(String id) {
		boolean b=false;
		if(studentSet.size()>0 && studentSet!=null){
			for(Student student:studentSet){
				if(student.getid().equals(id)){
					System.out.println(student.getid()+" "+student.getName());	
					b=true;
					break;	
				}
			}
		}
		if(!b)
			System.out.println("Student details is not found");
			
	}

	public void  getAllstudentDetails() {
			if(studentSet.size()>0){
				for(Student student:studentSet){
					System.out.println(student.getid()+" "+student.getName());
				}
					
			}else{
				System.out.println("Students are available");
			}
	}

}


