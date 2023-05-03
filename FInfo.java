
public class FInfo extends GeneralDorm{
	private double price = 4000;
  private String bill = "400";
     
   public FInfo(String name){
   	 super(name);
    }
    public FInfo(int[][] roomArray){
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
