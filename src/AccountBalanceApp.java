import java.text.NumberFormat;

public class AccountBalanceApp {
	
	public static void displayAccountInformation(CheckingAccount myChecking, SavingsAccount mySavings) {
		NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("Monthly Payments and Fees");
        System.out.println("Checking fee: \t \t  "+money.format(myChecking.getFee()));
        myChecking.withdraw(myChecking.getFee());
        System.out.println("Savings interest payment: "+money.format(mySavings.getInterestPayment()));
        mySavings.deposit(mySavings.getInterestPayment());
        System.out.println();
        System.out.println("Final Balances");
        System.out.println("Checking: "+money.format(myChecking.getBalance()));
        System.out.println("Savings: "+money.format(mySavings.getBalance()));
	}
	
	public static Account returnAccountType(Account mychecking, Account mysavings) {
		while (true) {
			String accountType = Console.getString("Checking or Savings? (c/s) : ");
			if (accountType.equalsIgnoreCase("c")) {
				return mychecking;
			} else if (accountType.equalsIgnoreCase("s")) {
				return mysavings;
			} else {
				System.out.println("Please select either checking or savings. (c/s)");
				continue;
			}
		}
	}
	
	public static void performTransaction(int amount, Account selectedaccount, String transactionType) {
		if (transactionType.equalsIgnoreCase("w")) {
			selectedaccount.withdraw(amount);
		} else if (transactionType.equalsIgnoreCase("d")) {
			selectedaccount.deposit(amount);
		}
	}
	
	public static String getTransactionType() {
		String validChoices = "wd";
		String userChoice = Console.getString("Withdrawal or deposit? (w/d) : ").toLowerCase();
		while (!validChoices.contains(userChoice)) {}
		return userChoice;
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Account simulation application");
        System.out.println();
        CheckingAccount myChecking = new CheckingAccount(10,1000);
        myChecking.setBalance(1000);
        SavingsAccount mySavings = new SavingsAccount(.05,1000);
        mySavings.setBalance(1000);
    	System.out.println("Starting Balances");
    	System.out.println("Checking: "+myChecking.getBalance());
    	System.out.println("Savings: "+mySavings.getBalance());
    	System.out.println();
    	System.out.println("Enter the transactions for the month");
        Boolean cont = true;
        while (cont) {
        	String transactionType = getTransactionType();
        	Account selectedAccount = returnAccountType(myChecking, mySavings);
        	int amount = Console.getInt("Amount? : ");
        	performTransaction(amount,selectedAccount,transactionType);
        	System.out.println();
            cont = Console.userWantsToContinue();
            System.out.println();
        }
        displayAccountInformation(myChecking, mySavings);
	}

}
