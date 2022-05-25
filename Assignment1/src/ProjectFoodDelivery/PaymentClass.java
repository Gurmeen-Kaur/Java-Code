package ProjectFoodDelivery;

public class PaymentClass implements Payment{
	
	double amount_Entered;
	double grand_Total;
	public PaymentClass(double amountEntered,double grandTotal) {
		this.amount_Entered=amountEntered;
		this.grand_Total=grandTotal;
	}

	@Override
	public void paymentViaCash() {
		// TODO Auto-generated method stub  
	}

	@Override
	public void paymentViaCard() {
		// TODO Auto-generated method stub
		
	}

}
