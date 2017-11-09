
public class CheckingAccount extends Account {

	private double fee;
	
	public CheckingAccount(double monthlyFee,double balance) {
		super(balance);
		this.fee=monthlyFee;
	}
	
	public void subtractFee() {
		this.withdraw(this.fee);
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
}
