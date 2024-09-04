package com.evergent.corejava.harshitha.application2;
import java.io.IOException;
import java.util.*;
public class TrainingInstituteManagement {
	enum module1{B,P,R,E,S;}
	enum submodule1{EC,CS,EE,CV;}
	enum submodule2{G,V,E,I,S;}
	enum submodule3{J,AI,DS,CS,S;}
	enum submodule4{GA,M,AEE,S;}
	enum submodule6{G,AEE,S;}
	enum submodule5{AC,TS,F;}
	static int CourseCost;
	static double Discount;
	static String Branch;
	static String Domain;
	public static void main(String[] args) {
		System.out.println("\n *****************WELCOME TO BTECH_TALENTS INSTITUTE**************** \n");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Name");
		String name;
		name=sc.next();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Hi "+name+" Thank you for Choosing our BTech_Talents Institute for your Bright Career");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		String module = null;
		Scanner sc1=new Scanner(System.in);
		while(true)
		{
		System.out.println("=================Enter your code module============== \n \t =============Code:Module============ \n \t\t\t B-Branch \n \t\t\t P-Payment \n \t\t\t R-Report \n  \t\t\t S-Services \n \t\t\t E-Exit");
		System.out.println("Enter the Code (B,S,P,R,E):");
		module=sc1.next();
		switch(module1.valueOf(module))
		{
		case B:
			
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^May I know your Branch?^^^^^^^^^^^^^^^^^^^^");
			System.out.println();
			System.out.println("Code ------------> Branch");
			System.out.println(" EC : ECE \n CS : CSE \n EE : EEE \n CV : CIVIL");
			System.out.println("Enter the Code (EC,CS,EE,CV):");
			module=sc1.next();
			switch(submodule1.valueOf(module))
			{
			case EC:
				Branch="ECE";
				System.out.println("Dear ECE graduate...Which Field Dou You wanna choose for Ur Career");
				System.out.println();
				System.out.println("**********************The Domains we have************************ \n \t\t\t Code: \t\t\t Domain: \t\t Cost \n \t\t\t G: \t\t\t Gate: \t\t\t 56000 \n \t\t\t V: \t\t\t VLSI: \t\t\t 150000 \n \t\t\t E: \t\t\t Embedded: \t\t 50000 \n \t\t\t I: \t\t\t IES: \t\t\t 70000 \n \t\t\t S: \t\t\t Software: \t\t\t 30000");
				System.out.println("Enter the Code (G,V,E,I,S):");
				module=sc1.next();
				switch(submodule2.valueOf(module))
				{
				case G:
				{
					Domain="Gate";
					System.out.println("********************The fee of Your Course is 56000*******************");
					CourseCost=56000;
					break;
					
				}
				case V:
				{
					Domain="VLSI";
					System.out.println("********************The fee of Your Course is 150000*******************");
					CourseCost=150000;
					break;
				}
				case E:
				{
					Domain="Embedded";
					System.out.println("********************The fee of Your Course is 50000*******************");
					CourseCost=50000;
					break;
				}
				case I:
				{
					Domain="IES";
					System.out.println("********************The fee of Your Course is 70000*******************");
					CourseCost=70000;
					break;
				}
				case S:
				{
					Domain="Software";
					System.out.println("\n ********************The fee of Your Course is 30000 *******************");
					CourseCost=30000;
					break;
				}
				}
				break;
			case CS:
			{
				Branch="CSE";
				System.out.println("\n Dear CSE graduate...Which Field do You wanna choose for Ur Career");
				System.out.println("\n \"**********************The Domains we have************************ \n \t\t\t Code: \t\t\t Domain: \t\t\t Cost \n \t\t\t J: \t\t\t JAVA: \t\t\t\t 56000 \n \t\t\t AI: \t\t\t Artificial Intelligence: \t 150000 \n \t\t\t DS: \t\t\t Data Science: \t\t\t 50000 \n \t\t\t CS: \t\t\t Cyber Security: \t\t 70000");
				System.out.println("Enter the Code (J,AI,DS,CS):");
				module=sc1.next();
				switch(submodule3.valueOf(module))
				{
			    case J:
			    {
			    Domain="JAVA";
				System.out.println("\n ********************The fee of Your Course is 56000*******************");
				CourseCost=56000;
				break;
				
			    }
			    case AI:
			    {
			    Domain="Artificial Intelligence";
				System.out.println("\n ********************The fee of Your Course is 150000*******************");
				CourseCost=150000;
				break;
			    }
			    case DS:
			    {
			    Domain="Data Science";
				System.out.println("\n ********************The fee of Your Course is 50000*******************");
				CourseCost=50000;
				break;
			    }
			    case CS:
			    {
			    Domain="Cyber Security";
				System.out.println("\n ********************The fee of Your Course is 70000*******************");
				CourseCost=70000;
				break;
			    }
			   }
			}
			   break;
			case EE:
			{
				Branch="EEE";
				System.out.println("\n Dear EEE graduate...Which Field do You wanna choose for Ur Career");
				System.out.println("\n **********************The Domains we have************************ \n \t\t\t Code: \t\t\t Domain: \t\t\t Cost \n \t\t\t GA: \t\t\t Gate: \t\t\t         56000 \n \t\t\t M: \t\t\t MBA: \t\t\t         150000 \n \t\t\t AEE: \t\t\t Assistant Executive Engineer: \t 500000 \n \t\t\t S: \t\t\t Software: \t\t\t 30000");
				System.out.println("Enter the Code (GA,M,AEE,S):");
				module=sc1.next();
				switch(submodule4.valueOf(module))
				{
				case GA:
				{
					Domain="GATE";
					System.out.println("\n ********************The fee of Your Course is 56000*******************");
					CourseCost=56000;
					break;
					
				}
				case M:
				{
					Domain="MBA";
					System.out.println("\n ********************The fee of Your Course is 150000*******************");
					CourseCost=150000;
					break;
				}
				case AEE:
				{
					Domain="Assistant Executive Engineer";
					System.out.println("\n ********************The fee of Your Course is 50000 *******************");
					CourseCost=50000;
					break;
				}
				case S:
				{
					Domain="Software";
					System.out.println("\n ********************The fee of Your Course is 30000 *******************");
					CourseCost=30000;
					break;
				}
				}
				break;
			}
			case CV:
			{
				Branch="CIVIL";
				System.out.println("\n Dear CIVIL graduate...Which Field do You wanna choose for Ur Career");
				System.out.println("\n **********************The Domains we have************************ \n \t\t\t Code: \t\t\t Domain: \t\t\t Cost \n \t\t\t G: \t\t\t Gate: \t\t\t         56000 \n \t\t\t AEE: \t\t\t Assistant Executive Engineer: \t 500000 \n \t\t\t S: \t\t\t Software: \t\t\t 30000");
				System.out.println("Enter the Code (G,AEE,S):");
				module=sc1.next();
				switch(submodule6.valueOf(module))
				{
				case G:
				{
					Domain="GATE";
					System.out.println("\n ********************The fee of Your Course is 56000*******************");
					CourseCost=56000;
					break;
					
				}
				case AEE:
				{
					Domain="AEE";
					System.out.println("\n ********************The fee of Your Course is 150000*******************");
					CourseCost=150000;
					break;
				}
				case S:
				{
					Domain="Software";
					System.out.println("\n ********************The fee of Your Course is 30000 *******************");
					CourseCost=30000;
					break;
				}
			}
			System.out.println("\n *******You have discount based on your cgpa.Can you please Enter your CGPA********");
				double gpa=sc1.nextDouble();
				if(gpa > 8.0)
				{
					Discount=((CourseCost)*(0.2));
					System.out.println("\n ^^^^^^^^^^^^^^^^^^^^^^^^^^^^Hurry! You have Discount of 20% i.e: " +Discount+ " ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				}
				else
				{
					System.out.println("\n =============Sorry Uh don't have Discount============ \n");
					Discount=CourseCost;
				}
				break;
			}
			}
				
		case S:
		{
			System.out.println("========The services we have ====== \n Code  :  Service  \nAC  :   AC Classrooms \nTS  :  Weekend Tests  \nF  :  Food");
			System.out.println("Code (AC,TS,F)");
			module=sc1.next();
			switch(submodule5.valueOf(module))
			{
			case AC:
			{
				Discount=Discount+10000;
				System.out.println("The Final Fee is: "+Discount);
				break;
		    }
			case TS:
			{
				Discount=Discount+5000;
				System.out.println("The Final Fee is: " +Discount);
				break;
			}
			case F:
			{
				Discount=Discount+2000;
				System.out.println("The Final fee is: "+Discount);
				break;
			}
			}
			break;
		}
		case P:
		{
			System.out.println("\n ~~~~~~~~~~~~Your Payment Report is~~~~~~~~~~~~ \n");
			System.out.println("*******You Have to Pay Rs:"+Discount+"******** \n");
			break;
		}
		case R:
		{
			System.out.println("\n ************Here the Final Summary Report of your Enrollment***************");
			System.out.println("\n Uh r Enrolled for Branch "+ Branch+" in the domain of "+ Domain +".You have to pay "+ Discount);
			break;
		}
		case E:
		{
			System.out.println("\n ^^^^^^^^^^^^^^^^^^^^^^Thank you For Enrolling in our BTech_Talents Institution^^^^^^^^^^^^^^^^^^");
			System.exit(0);
			break;
		}
				
			}
		}
		
	}
	
}

