
public class StudentInfo {
       private String  gender;
       private long ID;
       private int roomNo;
       private String name;
       
       public StudentInfo(Long studentID){
              this.ID=studentID;
       }
       
       public int getRoomNo(){
              return roomNo;
       }
       public long getID() {
    	   return ID;
       }
       public String getName(){
              return name;
       }
   
       public String getGender() {
    	   return gender;
       }
}
