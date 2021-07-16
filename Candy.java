package week3;

public class Candy extends DessertItem {
	 private double candyWeight, pricePerPound, candyCost;

     public Candy() {
             super();
             this.setPackaging("");
     }

     public Candy(String name, double candyWeight, double pricePerPound) {
             super(name);
             this.candyWeight = candyWeight;
             this.pricePerPound = pricePerPound;
             this.setPackaging("Bag");
     }

     public double getCandyWeight() {
             return candyWeight;
     }

     public double getPricePerPound() {
             return pricePerPound;
     }

     public void setCandyWeight(double candyWeight) {
             this.candyWeight = candyWeight;
     }

     public void setPricePerPound(double pricePerPound) {
             this.pricePerPound = pricePerPound;
     }

     public double calculateCost() {
             this.candyCost = this.pricePerPound * this.candyWeight;

             return candyCost;
     }
     public String toString()
     {
             return String.format("%s\n\t%.2f lbs @ $%.2f/lb %15s$%.2f%15s[Tax: $%.2f]\n", this.getName()
            		 ,this.getPackaging(),this.getCandyWeight(),this.getPricePerPound()," "
            		 ,this.calculateCost()," ",this.calculateTax());
     }
}
