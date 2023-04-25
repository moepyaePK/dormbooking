
public class Sakhtong3Info extends abstractDorm {
	private double price = 15000;
	 private String bill = "Pay per unit";
    private String dormName;
    
    
  public Sakhtong3Info(String name){
  	 dormName = name;
   }
    
  public double getPrice() {
  	return price;
  }
  
  public String getBill() {
  	return bill;
  }
}
