import java.math.BigDecimal;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(String clientName, String accountNumber, BigDecimal accountBalance, BigDecimal interestRate) {
		super(clientName, accountNumber, accountBalance, interestRate);
		
	}
	

	@Override
	public String getAccountType() {
		return "Savings Account";
	}

	@Override
	public BigDecimal getBalance() {
		return accountBalance;
	}


	
//	public void update() {
//		
//		BigDecimal interest = accountBalance.multiply(interestRate);
//		accountBalance = accountBalance.add(interest);
//		
//		//rounding the decimal
//		accountBalance = accountBalance.setScale(1, BigDecimal.ROUND_HALF_UP);
//		
//	}
	



}
