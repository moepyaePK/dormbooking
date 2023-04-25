import java.util.*;

import java.lang.*;
public class MainOODP extends OODP{


public static void main (String[] args)throws InsufficientNumberException {
	System.out.println("Welcome to the Registration System.");
	Scanner input = new Scanner(System.in);
	String numberString;
	String gender;
	
		do {
			
			try {
			System.out.println("Enter your student ID");
			Long ID = input.nextLong();
			System.out.println("Enter your gender : m or f ");
			gender = input.next();
			
			numberString = Long.toString(ID);
			gender = gender.toLowerCase();
			if(numberString.length()==10) {
		    String firstTwoDigits = numberString.substring(0, 2);
		    if(gender.equalsIgnoreCase("m")) {
		    	if(firstTwoDigits.equals("65")) {
		    		
		    	
				System.out.println("Male dormitory");
				System.out.println("L1 L2 L3 L4");
				System.out.println("-------------");
				
				String dorm = input.next();
				System.out.println("You have typed : ");
				System.out.print(dorm);
				if(dorm.equals("L1") || dorm.equals("L2")|| dorm.equals("L3")|| dorm.equals("L4")) {
					LamduanInfo dorminfo= new LamduanInfo(dorm);
					System.out.println(dorminfo.getPrice());
					System.out.println(dorminfo.getBill());
					break;}}
		    	
		    
		} }else {
			throw new InsufficientNumberException("Wrong!");
		}
			}
		catch(InputMismatchException e)
		{
		    System.out.println("Error."+e.getMessage());
		    continue;
		}
		catch(InsufficientNumberException e)  {
			System.out.println(e.getMessage()+"Invalid ID");
			continue;
		}
		} while (true);
	
	}
	
	
	
	
	
		}
	
	
	


