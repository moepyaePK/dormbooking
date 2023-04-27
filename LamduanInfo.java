import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import java.util.Iterator;
// hello
public class LamduanInfo extends abstractDorm {

   private double price = 4000;
   private String bill = "Pay per unit";
   private String dormName;
   private ArrayList<Integer> reserved = new ArrayList<Integer>();
   private int[][] rooms = new int[40][2];
   private int[][] unavailabe = new int[40][2];
   private int[][] availabe = new int[40][2];
   Scanner input = new Scanner(System.in);

   public LamduanInfo(String name) {
      this.dormName = name;
   }

   public double getPrice() {
      return price;
   }

   public String getBill() {
      return bill;
   }

   public boolean bookRoom(int roomNo)   {
      boolean m = false;         
      for(int i =0; i<rooms.length; i++){
         if(roomNo==availabe[i][0]){
            System.out.println("Room No."+roomNo+" has been booked successfully!");
            rooms[i][0]+=1;
            return true;
         }
         else if (roomNo==unavailabe[i][0]){
            System.out.println("This room is unavailable!");
            return false;
         }
         
      }
      return m;                
   } 
         
   public int[][] fillRoom(int[][] rooms) {
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
      return (int) (Math.random() * (4 - 0 + 1)) + 0;
   }

   public int[][] checkRooms(){
      fillRoom(rooms);
      AvailabeRooms(rooms);
      UnavailabeRooms(rooms);      
      System.out.print("Availabe Room number : ");
      for (int i=0;i<rooms.length ; i++){
         if(rooms[i][1]!=4) {
            System.out.println(rooms[i][0] );
         }              
      }
      return rooms;
   }
   public int[][] AvailabeRooms(int[][] rooms){
      for (int i=0;i<rooms.length ; i++){
         if(rooms[i][1]!=4) {
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

}

}
