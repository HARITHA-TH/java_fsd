package bank;

public class Main {

	public static void main(String[] args) {
		Customer c=new Customer(2459,"hari","harithath003@gmail.com");
		SavingsAccount s=new SavingsAccount(2459,c,2444.44,234.45);
		System.out.println(s.withdraw(235.44));
	
	}

}
