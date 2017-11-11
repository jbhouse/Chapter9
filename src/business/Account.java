package business;

public class Account implements Depositable, Withdrawable, Balanceable {

	private double balance;
	
	public Account(double balance) {
		this.balance=balance;
	}
	
	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public void setBalance(double amount) {
		this.balance=amount;
	}

	@Override
	public void withdraw(double amount) {
		this.balance-=amount;
	}

	@Override
	public void deposit(double amount) {
		this.balance+=amount;
	}

	
}
