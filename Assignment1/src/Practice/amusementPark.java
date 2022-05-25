package Practice;

public class amusementPark {
	double height;
	double weight;
	boolean istrue = false;

	public amusementPark(double enteredHeight, double enteredWeight) {
		this.height=enteredHeight;
		this.weight=enteredWeight;
	}

	public boolean conditionCheck() {
		if (height < 90 || height > 200 || weight < 15 || weight > 95) {
			// istrue = true;
			System.out.println("You cannot go on the ride");
		} else {
			istrue = true;
			System.out.println("you can go on the ride");

		}
		return istrue;
	}
}
