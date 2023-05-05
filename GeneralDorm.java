
// github commit history htl ko ma yout bu yw
public abstract class GeneralDorm
{
   public int[][] rooms = new int[40][2];
   //public int[][] unavailabe = new int[40][2];
   //public int[][] availabe = new int[40][2];
   //MainOODP obj;
   
   //Constructor
   public GeneralDorm(int[][] roomArray){
      this.rooms=roomArray;
      
   }

   //Abstract Methods
   public abstract double getPrice();

   public abstract String getBill();


   // Concrete methods
   public String dormName(String dorm){
      return dorm;
   }
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
   public int[][] fillRandomRoom(int[][] rooms) 
   { 
      int roomnum = 101;
      for (int i = 0; i < rooms.length; i++) 
      {
         rooms[i][0] = roomnum;
         if (roomnum%10==0)
         {
            roomnum+=91;
         }
         else 
         {
            roomnum++;
         }         
         rooms[i][1] = fillRandomPeople();
         
      }
      return rooms;
   
   }
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public int fillRandomPeople() {
      return (int) (Math.random() * (4 - 0 + 1)) + 0;
   }
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public int sumArray(int[][] rooms){
      int sum=0;
      for(int i=0;i<rooms.length;i++){
         sum=sum+ rooms[i][1];
      }
      return sum;
   }
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public int[][] checkRooms()
   {  
      if(sumArray(rooms)==0){
         fillRandomRoom(rooms);  
      }
      //AvailabeRooms(rooms);
      //UnavailabeRooms(rooms);    
      System.out.println("Availabe Room numbers\n-------------");
      for (int i=0;i<rooms.length ; i++)
      {
         if(rooms[i][1]<4) {
            System.out.println(rooms[i][0]+","+rooms[i][1]+" people." );
            }              
      }
      return rooms;
   }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public boolean bookRoom(int roomNo) 
   {
      boolean roomAvailable = false;         
      for(int i =0; i<rooms.length; i++)
      {
         if(roomNo==rooms[i][0] && !(rooms[i][1]==4))
         {
            System.out.println("Room No."+roomNo+" has been booked successfully!");    
            rooms[i][1]+=1;
            //AvailabeRooms(rooms);
            //UnavailabeRooms(rooms);   
            return true;
         }
         else if (roomNo==rooms[i][0] && rooms[i][1]==4)
         {
            System.out.println("This room is unavailable!");         
            return false;
         }    
      }
      return roomAvailable;                
   } 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /* 
   public int[][] AvailabeRooms(int[][] rooms)
   {
      for (int i=0;i<rooms.length ; i++){
         if(rooms[i][1]<4) {
            availabe[i][0]=rooms[i][0];
            availabe[i][1]=rooms[i][1];
         }
      }
      return availabe;
   }

   public int[][] UnavailabeRooms(int[][] rooms){
      for (int i=0;i<rooms.length ; i++){
         if(rooms[i][1]==4) {
            unavailabe[i][0]=rooms[i][0];
            unavailabe[i][1]=rooms[i][1];
         }
      }
      return unavailabe;
   } */
}
