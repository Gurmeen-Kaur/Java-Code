package Practice;

public class DeliveryCost {

	double costOfFood;
	double deliveryDistance;
	double deliveryCost;
	double tip;
	double customerTip;
	double tax;
	double totalCost;

	public DeliveryCost(double foodCost, double distance, double _tip) {
		this.costOfFood = foodCost;
		this.deliveryDistance = distance;
		this.customerTip = _tip;
	}

	public double calculateDeliveryCost() {

		if (costOfFood > 100 && deliveryDistance <= 20) {
			deliveryCost = 0;
		} else if (costOfFood > 50 && costOfFood < 100 && deliveryDistance <= 10) {
			deliveryCost = 0.05 * costOfFood;
		} else if (costOfFood < 50 && deliveryDistance < 5) {
			deliveryCost = 0.10 * costOfFood;
		} else if (deliveryDistance > 20) {
			deliveryCost = (0.02 * costOfFood);
		}
		return deliveryCost;
	}

	public double calculateTip() {
		if (costOfFood > 40) {
			tip = 0.02 * costOfFood;
		} else {
			tip = customerTip;
		}
		return tip;
	}

	public double calculateTax() {
		tax = 0.13 * costOfFood;
		return tax;
	}

	public double totalCost() {
		totalCost = costOfFood + deliveryCost + tip + tax;

		return totalCost;
	}

}
