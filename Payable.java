package week3;

public interface Payable {
	 enum PayType
	   {
	       CASH,
	       CARD,
	       PHONE;
	   }
	  
	   public PayType getPayType();
	   public PayType setType(PayType payType);

}
