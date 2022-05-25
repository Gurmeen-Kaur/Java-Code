package Inheritance;

public class ChequingAccount extends BankAccount {

	public long accountNumber;

	@Override
	public double calculateInterest() {
		double interest = 0.01;
		interestCalculated = balance * interest;
		return interestCalculated;
	}
}
