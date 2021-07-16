package week3;

public class Cookie  extends DessertItem{
	
	private int cookieQty;
    private double pricePerDozen, cookieCost;

    public Cookie() {
            super();
            this.setPackaging("");
    }

    public Cookie(String name, int cookieQty, double pricePerDozen) {
            super(name);
            this.cookieQty = cookieQty;
            this.pricePerDozen = pricePerDozen;
            this.setPackaging("Box");
    }

    public int getCookieQty() {
            return cookieQty;
    }

    public double getPricePerDozen() {
            return pricePerDozen;
    }

    public void setCookieQty(int cookieQty) {
            this.cookieQty = cookieQty;
    }

    public void setPricePerDozen(double pricePerDozen) {
            this.pricePerDozen = pricePerDozen;
    }

    public double calculateCost() {
            this.cookieCost = (this.cookieQty * pricePerDozen) / 12; // price per dozen /12 = price per cookie
            return cookieCost;
    }
    public String toString()
    {
            return String.format("%s\n\t%d cookies @ $%.2f/dozen %15s$%.2f%15s[Tax: $%.2f]\n", this.getName(),this.getPackaging()
            		,this.getCookieQty(),this.getPricePerDozen()," ",this.calculateCost()," ",this.calculateTax());
    }
}