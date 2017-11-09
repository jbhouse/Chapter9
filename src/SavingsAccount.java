
public class SavingsAccount extends Account {
	
	private double interestRate;
	private double interestPayment;
	
	public SavingsAccount(double monthlyInterestRate, double balance) {
		super(balance);
		this.interestRate = monthlyInterestRate;
		this.setInterestPayment();
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestPayment() {
		return this.getBalance()*this.getInterestRate();
	}

	public void setInterestPayment() {
		this.interestPayment = this.getBalance()*this.getInterestRate();
	}
	
	public void setInterestPayment(double monthlyInterestPayment) {
		this.interestPayment=monthlyInterestPayment;
	}
	
}
