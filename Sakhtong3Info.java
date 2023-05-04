
public class Sakhtong3Info extends GeneralDorm {
	private double price = 15000;
	private String bill = "Pay per unit";
    

  public Sakhtong3Info(int[][] roomArray){
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
