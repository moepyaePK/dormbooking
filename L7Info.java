
public class L7Info extends abstractDorm{
	private double price = 5000;
	 private String bill = "Pay per unit";
    private String dormName;
    
    
  public L7Info(String name){
  	 dormName = name;
   }
    
  public double getPrice() {
  	return price;
  }
  
  public String getBill() {
  	return bill;
  }
}
