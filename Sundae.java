package week3;

public class Sundae extends DessertItem {
	  private String toppingName;
      private double toppingPrice;
      public Sundae() {
              super();
              toppingName="";
              this.setPackaging("");
              }
      public Sundae(String name, String toppingName, double toppingPrice) {
              super(name);
              this.toppingName = toppingName;
              this.toppingPrice = toppingPrice;
              this.setPackaging("Boat");
      }
      public String getToppingName() {
              return toppingName;
      }
      public double getToppingPrice() {
              return toppingPrice;
      }
      public void setToppingName(String toppingName) {
              this.toppingName = toppingName;
      }
      public void setToppingPrice(double toppingPrice) {
              this.toppingPrice = toppingPrice;
      }
      @Override
      double calculateCost() {
              return toppingPrice;
      }
      public String toString()
      {
              return String.format("%s\n\t%s @ $%.2f %15s$%.2f%15s[Tax: $%.2f]\n", this.getName(),this.getPackaging()
            		  ,this.getToppingName(),this.getToppingPrice()," ",this.calculateCost()," ",this.calculateTax());
      }
      
}