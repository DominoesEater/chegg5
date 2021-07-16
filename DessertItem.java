package week3;

 abstract class DessertItem implements Packaging{

	 private String name;
	   public double taxPercent = 7.25;
	    public String packaging;


	   public DessertItem(String name) {
	       this.name = name;
	   }

	   public DessertItem() {
	       name="";
	   }

	   public String getName() {
	       return name;
	   }

	   public void setName(String name) {
	       this.name = name;
	   }
	public double getTaxPercent ()
	{
	    return taxPercent;
	} 
	public void setTaxPercent(double tp) 
	{
	      this.taxPercent = tp;
	} 
	abstract double calculateCost() ; // abstract method

	public double calculateTax() 
	{
	    double itemCost = calculateCost() ;

	    double tax =
	            itemCost  *  (this.taxPercent/100);
	    
	    return tax;
	    
}
    public String getPackaging() {
        return this.packaging;
    }

    public String setPackaging(String packaging) {
        this.packaging = packaging;
        return packaging;
    }
}