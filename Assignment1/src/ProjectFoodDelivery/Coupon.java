package ProjectFoodDelivery;

public class Coupon {

	double costAfterDiscount;
	String coupon;
	double foodCost;

	public Coupon(double foodCost, String coupon) {
		this.coupon = coupon;
		this.foodCost = foodCost;
	}

	public double calculateDiscountWithCoupon(double deliveryCost) {

		if (coupon.equalsIgnoreCase("Coupon5")) {
			double discount = foodCost * 0.05;
			System.out.println("coupon discount given is :" + discount);
			costAfterDiscount = (foodCost - discount) + deliveryCost;
		} else if (coupon.equalsIgnoreCase("Coupon10")) {
			double discount = foodCost * 0.10;
			System.out.println("coupon discount given is :" + discount);
			costAfterDiscount = (foodCost - discount) + deliveryCost;
		} else if (coupon.equalsIgnoreCase("coupon$10")) {
			double discount = (foodCost - 10) + deliveryCost;
			System.out.println("coupon discount given is :" + discount);
			costAfterDiscount = discount;
		} else if (coupon.equalsIgnoreCase("FreeDel")) {
			deliveryCost = 0;
			costAfterDiscount = foodCost + deliveryCost;
		} else if (coupon.equalsIgnoreCase("none")) {
			double discount = 0;
			System.out.println("coupon discount given is :" + discount);
			costAfterDiscount = foodCost + deliveryCost;

		}
		return costAfterDiscount;
	}
}
