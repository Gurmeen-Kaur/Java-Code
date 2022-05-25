package ProjectFoodDelivery;

import java.util.Scanner;

public class FoodDeliveryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter cost of food");
		double foodCost = scanner.nextDouble();
		System.out.println("Please enter distance");
		double distance = scanner.nextDouble();
		System.out.println("Please enter tip amount");
		double tip = scanner.nextDouble();
		System.out.println("Please enter the coupon name if applicable");
		String coupon = scanner.next();

		Calculate calculate = new Calculate(foodCost, distance, tip);
		Coupon _coupon = new Coupon(foodCost, coupon);


		double deliveryCost = calculate.calculateDeliveryCost();
		double discountedCost = _coupon.calculateDiscountWithCoupon(deliveryCost);

		System.out.println("Delivery Cost is : " + deliveryCost);
		System.out.println("Subtotal after discount is : " + discountedCost);

		System.out.println("Tip calculated is : " + calculate.calculateTip());
		System.out.println("Grand Total is : " + calculate.grandTotal(discountedCost));
		
		System.out.println("Please enter payment method card or cash?");
		String paymentMethod=scanner.next();
		//String card=scanner.next();
		
		
		System.out.println("Enter amount ");
		double amountEntered= scanner.nextDouble();
		
		double grandTotal=calculate.grandTotal(discountedCost);
		PaymentClass payment= new PaymentClass(amountEntered,grandTotal);
		
		
		if(paymentMethod.equalsIgnoreCase("cash")) {
			payment.paymentViaCash();
		}
		else {
			payment.paymentViaCash();
		}
		
		scanner.close();
	}

}
