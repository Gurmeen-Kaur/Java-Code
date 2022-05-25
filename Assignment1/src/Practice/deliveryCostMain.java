package Practice;

public class deliveryCostMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeliveryCost deliverycost = new DeliveryCost(101, 21, 0);

		System.out.println("delivery fee is : " + deliverycost.calculateDeliveryCost());
		System.out.println("tip : " + deliverycost.calculateTip());
		System.out.println("tax : " + deliverycost.calculateTax());
		System.out.println("total cost of food is : " + deliverycost.totalCost());
	}

}
