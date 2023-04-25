
public class Sakhtong12Info extends abstractDorm{
	 private double price = 4000;
	 private String bill = "Pay per unit";
     private String dormName;
     
     
   public Sakhtong12Info(String name){
   	 dormName = name;
    }
     
   public double getPrice() {
   	return price;
   }
   
   public String getBill() {
   	return bill;
   }
}
