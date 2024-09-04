package com.evergent.corejava.harshitha.application4;
import java.util.*;
	public class CourseSelection {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Choose your course:");
	        System.out.println("G: GATE");
	        System.out.println("M: MBA");
	        System.out.println("AEE: Assistant Executive Engineer");
	        System.out.println("S: Software");
	        String choice = scanner.nextLine();
	        Course selectedCourse = null;
	        switch (choice) {
	            case "G":
	                selectedCourse = new GateCourse();
	                break;
	            case "M":
	                selectedCourse = new MBAcourse();
	                break;
	            case "AEE":
	                selectedCourse = new AEEcourse();
	                break;
	            case "S":
	                selectedCourse = new SoftwareCourse();
	                break;
	            default:
	                System.out.println("Invalid choice.");
	                break;
	        }
	        if (selectedCourse != null) {
	            System.out.println("You selected: " + selectedCourse.getName());
	            System.out.println("Original course cost: " + selectedCourse.getCost());
	            Scanner cgpaScanner = new Scanner(System.in);
	            System.out.print("Enter your CGPA: ");
	            double cgpa = cgpaScanner.nextDouble();
	            double discountedCost = selectedCourse.applyDiscount(cgpa);
	            System.out.println("Discounted course cost: " + discountedCost);
	            System.out.println("Choose additional services:");
	            System.out.println("AC: AC Classroom");
	            System.out.println("TS: Weekend Tests");
	            System.out.println("F: Food");
	            choice = scanner.nextLine();
	            int discount = 0;
	            switch (choice) {
	                case "AC":
	                    discount += new ACClassroomService().getCost();
	                    break;
	                case "TS":
	                    discount += new WeekendTestService().getCost();
	                    break;
	                case "F":
	                    discount += new FoodService().getCost();
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	                    break;
	            }
	            System.out.println("The final fee is: " + (discountedCost + discount));
	            // Payment and Summary
	            System.out.println("Your Payment Report:");
	            System.out.println("Course Fee: " + discountedCost);
	            System.out.println("Service Charges: " + discount);
	            System.out.println("Total Fee: " + (discountedCost + discount));
	            System.out.println("Enrollment Summary:");
	            System.out.println("Course: " + selectedCourse.getName());
	            System.out.println("Branch: " + selectedCourse.getName() + " in the domain of " + selectedCourse.getName()); // Assuming a domain associated with the course
	            System.out.println("You have to pay: " + (discountedCost + discount));
	            System.out.println("Thank you for enrolling in our B.Tech. Talents Institute.");
	        }
	    }
	}



	