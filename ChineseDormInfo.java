import java.util.*;
public class ChineseDormInfo extends abstractDorm{
	private double price = 4000;
	 private String bill = "Pay per unit";
    private String dormName;
    private List<Integer> reserved= new ArrayList<Integer>();
    private int[] available = new int[40];
    
    
  public ChineseDormInfo
  (String name){
  	 dormName = name;
   }
    
  public double getPrice() {
  	return price;
  }
  
  public String getBill() {
  	return bill;
  }
  public int getRandomPeople() {
    return 
  }

}