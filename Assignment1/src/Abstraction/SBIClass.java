package Abstraction;

public class SBIClass extends RBIClass implements GovtRules,SBIInhouseRules {
	double balance;

	public SBIClass(double _balance) {
		this.balance=_balance;
	}
	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		interest = balance * 4;
		return interest;
	}
	@Override
	public double depositMoneyinRBI() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void lendMoney() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void depositMoney() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void issueCreditCards() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void newCustomerDeposit() {
		// TODO Auto-generated method stub
		
	}

}
