package Inheritance;

public class TfsaAccount extends BankAccount {
	
	@Override
	public double calculateInterest() {
		double interest = 0.03;
		interestCalculated = balance * interest;
		return interestCalculated;
	}
}
