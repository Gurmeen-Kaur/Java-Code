package Inheritance;

public class SavingsAccount extends BankAccount {

	@Override
	public double calculateInterest() {
		double interest = 0.02;
		interestCalculated = balance * interest;
		return interestCalculated;
	}

}
