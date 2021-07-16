package week3;

public class IceCream  extends DessertItem{
	
	private int scoopCount;

    private double pricePerScoop, iceCreamCost;

    public IceCream() {
            super();
            this.setPackaging("");
    }

    public IceCream(String name, int scoopCount, double pricePerScoop) {
            super(name);
            this.scoopCount = scoopCount;
            this.pricePerScoop = pricePerScoop;
            this.setPackaging("Bowl");
    }

    public int getScoopCount() {
            return scoopCount;
    }

    public double getPricePerScoop() {
            return pricePerScoop;
    }

    public void setScoopCount(int scoopCount) {
            this.scoopCount = scoopCount;
    }

    public void setPricePerScoop(double pricePerScoop) {
            this.pricePerScoop = pricePerScoop;
    }

    public double calculateCost() {
            this.iceCreamCost = this.scoopCount * this.pricePerScoop;
            return iceCreamCost;

    }
    public String toString()
    {
            return String.format("%s\n\t%d scoops @ $%.2f/scoop %15s$%.2f%15s[Tax: $%.2f]\n", this.getName(),this.getPackaging()
            		,this.getScoopCount(),this.getPricePerScoop()," ",this.calculateCost()," ",this.calculateTax());
    }
}
