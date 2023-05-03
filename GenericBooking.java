import java.util.Scanner;

public class GenericBooking<T extends GeneralDorm> {
    T dormType;
    int roomNo;
    Scanner input = new Scanner(System.in);
    public GenericBooking(T dormType){
        this.dormType= dormType;
    }
    public void print(){
        System.out.println(dormType.dormName+" room price : "+dormType.getPrice()+" per semester");
        System.out.println(dormType.dormName+" utility fees : "+dormType.getBill());
        dormType.checkRooms();
        boolean a=false;
        while(a==false){
        System.out.print("\nPlease enter Room No. to book : ");
        roomNo= input.nextInt();
        a = dormType.bookRoom(roomNo);
        }
    }
    
}
