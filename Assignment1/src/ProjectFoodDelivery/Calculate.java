package ProjectFoodDelivery;

public class Calculate {
	double foodCost;
	double deliveryDistance;
	double deliveryCost;
	double tip;
	double customerTip;
	double tax;
	double totalCost;
	double finalFoodCost;
	double grandTotal;

	public Calculate(double foodCost, double distance, double _tip) {
		this.foodCost = foodCost;
		this.deliveryDistance = distance;
		this.customerTip = _tip;
	}

	public double calculateDeliveryCost() {

		if (foodCost >= 100 && deliveryDistance <= 20) {
			deliveryCost = 0;
		} else if (foodCost >= 50 && foodCost < 100 && deliveryDistance <= 10) {
			deliveryCost = 0.05 * foodCost;
		} else if (foodCost < 50 && deliveryDistance <= 5) {
			deliveryCost = 0.10 * foodCost;
		} else if (deliveryDistance > 20) {
			deliveryCost = (0.02 * foodCost);
		} else if (deliveryDistance > 20) {
			double deliveryCost1;
			double deliveryCost2;
			deliveryCost1 = 0.02 * foodCost;
			deliveryCost2 = 2 * (deliveryDistance - 20);
			if (deliveryCost1 <= deliveryCost2) {
				deliveryCost = deliveryCost1;
			} else {
				deliveryCost = deliveryCost2;
			}
		}
		return deliveryCost;
	}

	public double calculateTip() {
		if (foodCost > 40) {
			tip = 0.02 * foodCost;
		} else {
			tip = customerTip;
		}
		return tip;
	}

	public double calculateTax(double costAfterDiscount) {
		tax = costAfterDiscount * 0.13;

		System.out.println("Tax calculated :" + tax);
		return tax;
	}

	public double grandTotal(double costAfterDiscount) {
		// grandTotal = costAfterDiscount+tax+tip;

		grandTotal = costAfterDiscount + calculateTax(costAfterDiscount) + tip;
		return grandTotal;
	}

	public void cashPayment(String paymentMethod) {
		if (paymentMethod.){}
	}
}
