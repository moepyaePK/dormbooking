
public class LamduanInfo extends abstractDorm {

	
	 private double price = 4000;
     private String bill = "Pay per unit";
     private String dormName;
     
     
   public LamduanInfo(String name){
   	 dormName = name;
    }
     
   public double getPrice() {
   	return price;
   }
   
   public String getBill() {
   	return bill;
   }
   
}
