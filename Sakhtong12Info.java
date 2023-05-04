
public class Sakhtong12Info extends GeneralDorm{
	 private double price = 4000;
	 private String bill = "Pay per unit";
        

   public Sakhtong12Info(int[][] roomArray){
      super(roomArray);
      this.rooms=roomArray;
   }
     
   public double getPrice() {
   	return price;
      
   }
   
   public String getBill() {
   	return bill;
   }
   
   
}
