import java.util.*;
//hello world
public  class MainOODP{
	
private String gender;
private String firstTwoDigit;
static long longID;
static String name;
public int [][] Frooms = new int[40][2];
public int [][] Lrooms = new int[40][2];
public int [][] L7rooms = new int[40][2];
public int [][] Chineserooms = new int[40][2];
public int [][] S12rooms = new int[40][2];
public int [][] S3rooms = new int[40][2];

ChineseDormInfo ChineseDorm= new ChineseDormInfo(Chineserooms);
L7Info L7Dorm= new L7Info(L7rooms);
Sakhtong12Info S12Dorm= new Sakhtong12Info(S12rooms);
Sakhtong3Info S3Dorm= new Sakhtong3Info(S3rooms);
LamduanInfo lamduanDorm= new LamduanInfo(Lrooms);
FInfo fDorm= new FInfo(Frooms);

HashSet<Long> listStudent = new HashSet<Long>();
Scanner input = new Scanner(System.in); // if make this non static field to static, all value will be the same




    public static void main (String[] args) {
	MainOODP start = new MainOODP();
		boolean loop = true;
		//start.writeFile(10,6531503185L, "Meo");		
		while(loop){
			
			start.checkStudentID();
			System.out.print("1===>Back to Main Menu\n2===>Exit\n Select : ");
			int menu = start.input.nextInt();
			System.out.println("-----------------------------------------------------------------------------");
			if(menu==1){
				loop=true;
			}
			else{
				System.out.println("\nThank you for using our system!");
				loop=false;
			}
		}
	
    }
	
	

    public void checkStudentID(){
		boolean IDcheck = false;
		while(!IDcheck)
		{
			try
			{
			 	System.out.print("Enter your student ID : ");
				String ID = input.next();
				longID = Long.parseLong(ID);	
				firstTwoDigit = ID.substring(0, 2);			 
			 	if (ID.length()==10)
				{ 	
					if(checkAlreadyBooked(listStudent, longID)==false){
						IDcheck = true;
						checkStudentYear(firstTwoDigit);
						addID(listStudent, longID);
					}
					else{
						System.out.println("\nThis ID has already booked a room!\nPlease choose another ID!\n");
						return;
					}
					
					
				} 
			    else 
				{
					System.out.println("ID must have 10 numbers");
				}
				System.out.println();
			} 
			catch (NumberFormatException e) 
			{
				System.out.println("ID must be Numbers only!");
				System.out.println();
				continue;
			}
		} 
					
	}

	public void addID(HashSet<Long> list,long ID){
		list.add(ID);
	}
	public boolean checkAlreadyBooked(HashSet<Long> list, long ID){
		if (list.size()==0){
			return false;
		} else {
			for(long lists : list){
				if (lists==ID){
					return true;
				}
				else{
					return false;
				}
				
			}
		}		
		return false;


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

    public void checkStudentYear(String firstTwoDigit) {
		if (firstTwoDigit.equals("65")){
			if(checkGender())
			{
				System.out.print("Male dormitory\nL1, L2, L3, L4\n-------------\nYou select : ");
				String dorm = input.next();
				dorm=dorm.toUpperCase();
				if(dorm.equals("L1") || dorm.equals("L2")|| dorm.equals("L3")|| dorm.equals("L4")) 
				{	
					GenericBooking<LamduanInfo> myDorm= new GenericBooking<>(lamduanDorm);
					myDorm.print();
																												
				}
				else{
					System.out.println("You type wrong.");
				}
			}
			else{
				System.out.print("Female dormitory\nF , L5\n-------------\nYou select : ");
				String dorm = input.next();
				dorm=dorm.toUpperCase();
				if(dorm.equals("F")){
					GenericBooking<FInfo> myDorm = new GenericBooking<>(fDorm);
					myDorm.print();
				}
				else{
					System.out.println("You type wrong.");
				}
			}
		}
		
		else if(firstTwoDigit.equals("64")||firstTwoDigit.equals("63")||firstTwoDigit.equals("62")||firstTwoDigit.equals("61")){
			if(checkGender()){
				System.out.print("Male dormitory\nL1, L2, L3\n-------------\nYou select : ");
				String dorm = input.next();
				dorm=dorm.toUpperCase();
				if(dorm.equals("L1") || dorm.equals("L2")|| dorm.equals("L3")) 
				{	
					GenericBooking<LamduanInfo> myDorm= new GenericBooking<>(lamduanDorm);
					myDorm.print();
																												
				}
			}
			else{
				System.out.print("Female dormitory\nChinese Dorm\nSakhtong 1\nSakhtong 2\nSakhtong 3\nL7\n-------------\nYou select : ");
				String dorm = input.next();
				dorm=dorm.toUpperCase();
				if(dorm.equals("CHINESE DORM")) 
				{ GenericBooking<ChineseDormInfo> myDorm = new GenericBooking<>(ChineseDorm);
					myDorm.print();																									
				}
				else if(dorm.equals("SAKHTONG 1")||dorm.equals("SAKHTONG 2")) 
				{ GenericBooking<Sakhtong12Info> myDorm = new GenericBooking<>(S12Dorm);
					myDorm.print();																									
				}
				else if(dorm.equals("SAKHTONG 3")) 
				{ GenericBooking<Sakhtong3Info> myDorm = new GenericBooking<>(S3Dorm);
					myDorm.print();																									
				}
				else if(dorm.equals("L7")) 
				{ GenericBooking<L7Info> myDorm = new GenericBooking<>(L7Dorm);
					myDorm.print();																									
				}
				else{
					System.out.println("You type wrong.");
				}
				
		}
		}
		else {
			System.out.println("Wrong ID!");
		}
	}
		
}
	
	
	


