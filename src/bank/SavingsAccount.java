package bank;

public class SavingsAccount extends Account{
	private double minBalance;
	
	/*public double setMinBalance(double MinBalance) {
		this.minBalance=minBalance();
	}*/
	
	public SavingsAccount(int accountNumber, Customer customerObject, double balance, double minBalance) {
		super(accountNumber, customerObject, balance);
		this.minBalance = minBalance;
	}
	public double getMinBalance(){
		return minBalance;
	
		
	}
	public boolean withdraw(double amount)      {
		if(balance-amount>minBalance) {
			balance=balance-amount;
			System.out.println("balance is:" + balance);
			return true;
		}
		else {
			return false;
		}
		
	}



	
	

}
