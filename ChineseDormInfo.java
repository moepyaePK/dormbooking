
// test update
public class ChineseDormInfo extends GeneralDorm{
	private double price = 5500;
	private String bill = "Pay per unit";
    


   public ChineseDormInfo(int[][] roomArray){
      super(roomArray);
      this.rooms=roomArray;
   }
    
  public double getPrice() {
  	return price;
  }
  
  public String getBill() {
  	return bill;
  }

  @Override
  public boolean bookRoom(int roomNo) 
   {
      boolean m = false;         
      for(int i =0; i<rooms.length; i++)
      {
         if(roomNo==rooms[i][0] && !(rooms[i][1]==3))
         {
            System.out.println("Room No."+roomNo+" has been booked successfully!");

            
            rooms[i][1]+=1;

            AvailabeRooms(rooms);
            UnavailabeRooms(rooms);
            
            return true;
         }
         else if (roomNo==rooms[i][0] && rooms[i][1]==3)
         {
            System.out.println("This room is unavailable!");
            
            return false;
         }
         
      }
      return m;                
   } 
  public int[][] fillRandomRoom(int[][] rooms) {
    int roomnum = 101;
    for (int i = 0; i < rooms.length; i++) {
       
       rooms[i][0] = roomnum;
       if (roomnum%10==0){
          roomnum+=91;
       }else {
          roomnum++;
       }         
       rooms[i][1] = fillRandomPeople();
    }
    return rooms;

 }

 public int fillRandomPeople() {
    return (int) (Math.random() * (3 - 0 + 1)) + 0;
 }

 public int sumArray(int[][] rooms){
   int sum=0;
   for(int i=0;i<rooms.length;i++){
      sum=sum+ rooms[i][1];
   }
   return sum;
}

 public int[][] checkRooms(){
   if(sumArray(rooms)==0){
      fillRandomRoom(rooms);  
   }
  AvailabeRooms(rooms);
  UnavailabeRooms(rooms);      
  System.out.println("Availabe Room number\n-----------");
  for (int i=0;i<rooms.length ; i++){
     if(rooms[i][1]!=3) {
        System.out.println(rooms[i][0]+","+rooms[i][1]+" people." );
     }              
  }
  return rooms;
}

  public int[][] AvailabeRooms(int[][] rooms){
    for (int i=0;i<rooms.length ; i++){
       if(rooms[i][1]!=3) {
          availabe[i][0]=rooms[i][0];
          availabe[i][1]=rooms[i][1];
       }
 }
 return availabe;

}
public int[][] UnavailabeRooms(int[][] rooms){
 for (int i=0;i<rooms.length ; i++){
    if(rooms[i][1]==3) {
       unavailabe[i][0]=rooms[i][0];
       unavailabe[i][1]=rooms[i][1];
    }
}
return unavailabe;

}


  

}