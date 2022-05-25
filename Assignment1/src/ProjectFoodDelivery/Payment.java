package ProjectFoodDelivery;

public interface Payment {
	final int pinNumber=1234;
	
	public abstract void paymentViaCash();
	public abstract void paymentViaCard();
	

}
