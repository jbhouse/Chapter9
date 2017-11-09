
public class Account implements Depositable, Withdrawable, Balanceable {

	private double balance;
	
	public Account(double balance) {
		this.balance=balance;
	}
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}

	@Override
	public void setBalance(double amount) {
		// TODO Auto-generated method stub
		this.balance=amount;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		this.balance-=amount;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.balance+=amount;
	}

	
}
