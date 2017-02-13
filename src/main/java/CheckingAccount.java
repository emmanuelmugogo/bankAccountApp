
public class CheckingAccount extends BankAccount {
	
	private double balance;

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double depositAmount) {
		balance += depositAmount;
	}
	
	public void withdraw (double withdrawAmount) {
		balance -= withdrawAmount;
	}

}
