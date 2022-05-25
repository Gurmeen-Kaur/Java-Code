package Inheritance;

public class BankAccount {

	public double balance;
	public double interestCalculated;

	public double displayBalance() {
		return balance;
		// System.out.println("Balance is : " + balance);
	}

	public double calculateInterest() {
		double interest = 1;
		interestCalculated = balance * interest;
		return interestCalculated;
	}

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public BankAccount() {

	}

}
