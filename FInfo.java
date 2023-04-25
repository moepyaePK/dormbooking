
public class FInfo extends abstractDorm{
	 private double price = 4000;
     private String bill = "400";
     private String dormName;
     
     
   public FInfo(String name){
   	 dormName = name;
    }
     
   public double getPrice() {
   	return price;
   }
   
   public String getBill() {
   	return bill;
   }
   
}
