package Inheritance;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChequingAccount chequingAccount = new ChequingAccount();
		BankAccount bankAccount = new BankAccount();
		TfsaAccount tfsaAccount = new TfsaAccount();
		SavingsAccount savingsAccount = new SavingsAccount();

		chequingAccount.balance = 45000;
		chequingAccount.accountNumber = 1234;
		bankAccount.balance = 2000;
		tfsaAccount.balance = 1000;
		savingsAccount.balance=5000;

		System.out.println("Chequing Account balance is " + chequingAccount.displayBalance());
		System.out.println("Bank account balance is " + bankAccount.displayBalance());

		System.out.println("Calculated interest in TFSA is " + tfsaAccount.calculateInterest());
		System.out.println("Calculated interest in chequing is " + chequingAccount.calculateInterest());
		System.out.println("Calculated interest in savings is " + savingsAccount.calculateInterest());
	}

}
