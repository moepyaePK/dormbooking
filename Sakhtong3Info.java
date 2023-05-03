
public class Sakhtong3Info extends GeneralDorm {
  public static int[][] rooms = new int[40][2];
	private double price = 15000;
	 private String bill = "Pay per unit";
    
  public Sakhtong3Info(String name){
  	super(name);
  }

  public Sakhtong3Info(int[][] roomArray){
    super(roomArray);
    Sakhtong3Info.rooms=roomArray;
  }
    
  public double getPrice() {
  	return price;
  }
  
  public String getBill() {
  	return bill;
  }
}
