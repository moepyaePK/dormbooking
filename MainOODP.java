import java.util.*;

import java.lang.*;
public  class MainOODP extends OODP{
private String gender;
private String firstTwoDigit;
Scanner input = new Scanner(System.in);


public static void main (String[] args) {
	System.out.println("Welcome to the Registration System.");
	MainOODP start = new MainOODP();
	
		start.checkStudentID();
	
		
	
	}
	public void checkStudentID()
	{
		boolean IDcheck = false;
		while(!IDcheck){
			try 
			{
			 System.out.println("Enter your student ID");
			 String ID = input.next();
			 Long intID = Long.parseLong(ID);	
			 firstTwoDigit = ID.substring(0, 2);
			 
			 if (ID.length()==10){
				IDcheck = true;
				checkStudentYear(firstTwoDigit);
				
			} 
			 else {
				System.out.println("ID must have 10 numbers");}
			} 
			catch (NumberFormatException e) 
			{
				System.out.println("ID must be Numbers only!");
				continue;
			}
		} 
					
	}
	public boolean checkGender(){
		System.out.println("Enter your gender : m or f ");
			gender = input.next();
			gender = gender.toLowerCase();
			if(gender.equalsIgnoreCase("m")) {
		    	return true;		    
		}
		return false;
	}

	public void checkStudentYear(String firstTwoDigit){
		if (firstTwoDigit.equals("65")){
			if(checkGender())
			{
				System.out.println("Male dormitory");
						System.out.println("L1 L2 L3 L4");
						System.out.println("-------------");
						
						String dorm = input.next();
						System.out.println("You have typed : ");
						System.out.print(dorm);
						if(dorm.equals("L1") || dorm.equals("L2")|| dorm.equals("L3")|| dorm.equals("L4")) 
						{
							LamduanInfo dorminfo= new LamduanInfo(dorm);
							System.out.println(dorminfo.getPrice());
							System.out.println(dorminfo.getBill());
							
						}
			}
			else{/*female 1st year dorm */}
		}
		else if(firstTwoDigit.equals("64")){
			if(checkGender()){/* 64 male dorm */}
			else{/*64 female dorm */}
		}
		else if (firstTwoDigit.equals("63")){
			if(checkGender()){/*63 male dorm */}
			else{/*63 female */}
		}
	}
		
	}
	
	
	


