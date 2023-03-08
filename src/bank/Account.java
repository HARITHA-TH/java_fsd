package bank;

public abstract class Account {
	protected int accountNumber;
	protected Customer customerObject;
	protected double balance;
	public Account(int accountNumber, Customer customerObject, double balance) {
		
		this.accountNumber = accountNumber;
		this.customerObject = customerObject;
		this.balance = balance;
	}
	
	public abstract boolean withdraw(double amount);

}
