
public class L7Info extends GeneralDorm{
	private double price = 5000;
	private String bill = "Pay per unit";
    
    
  public L7Info(String name){
  	 super(name);
   }
   public L7Info(int[][] roomArray){
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
