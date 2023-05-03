

public class LamduanInfo extends GeneralDorm {

   private double price = 4000;
   private String bill = "Pay per unit";

   public LamduanInfo(String name) {
      super(name);
   }
   public LamduanInfo(int[][] roomArray){
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
