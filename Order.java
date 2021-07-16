package week3;
import java.util.ArrayList;
public  class Order extends DessertItem implements Payable {
	  //DessertItem a = new Order();
    private ArrayList<DessertItem> order;
    private PayType payMethod; 
    public Order() {
            order = new ArrayList<>();
            payMethod = PayType.CASH;
    }

    public ArrayList<DessertItem> getOrderList() {
            return order;
    }

    public DessertItem add(DessertItem a) {
            order.add(a);// adding element to array
            return a;
    }

    public int itemCount() {
            return order.size(); // size of array
    }

    public double orderCost() {
            double itemCost, totalCost = 0;
            int count = itemCount();

            for (int i = 0; i < count; i++) {
                    itemCost = order.get(i).calculateCost();
                    totalCost += itemCost;
            }
            return totalCost;
    }

    public double orderTax() {
            double itemTax, totalTax = 0;
            int count = itemCount();
            for (int i = 0; i < count; i++) {
                    itemTax = order.get(i).calculateTax();
                    totalTax += itemTax;
            }
            return totalTax;

    }

    @Override
    double calculateCost() {
            return orderCost() + orderTax();
    }
    
    public String toString()
    {
            double total =0,totaltax=0;
            String out="";
            out+="----------------------------Recipt---------------------------\n";
            for(int i=0;i<order.size();i++)
            {
                    out+=order.get(i).toString();
                    total+=order.get(i).calculateCost();
                    totaltax+=order.get(i).calculateTax();
            }
            out+="--------------------------------------------------------------\n";
            out+="Total number of items in order: "+order.size()+'\n';
            out+=String.format("Order Subtotals:%25s$%.2f%15s[Tax: $%.2f]\nOrder Total:%25s$%.2f\n", " ",orderCost()," ",
            		orderTax()," ",calculateCost() );
            out+="--------------------------------------------------------------\n";
            
            out += "Paid for with: "+payMethod.name()+".\n"; // add the line in the output specifying the payment method

            return out;

            }

            // return PayType
            @Override
            public PayType getPayType() {
                return payMethod;
            }

            // update PayType
            @Override
            public PayType setType(PayType payType) {
                payMethod = payType;
                return payType;
            }
	}
