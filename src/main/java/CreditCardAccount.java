import java.math.BigDecimal;

public class CreditCardAccount extends BankAccount {

	public CreditCardAccount(String clientName, String accountNumber, BigDecimal accountBalance,
			BigDecimal interestRate) {
		super(clientName, accountNumber, accountBalance, interestRate);
		
	}


	@Override
	public String getAccountType() {
		return "Credit Card Account";
	}

	@Override
	public BigDecimal getBalance() {
		return accountBalance;
	}


	
//	public void update() {
//		BigDecimal interest = accountBalance.multiply(interestRate);
//		accountBalance = accountBalance.add(interest);
//		
//		//rounding the decimal
//		accountBalance = accountBalance.setScale(1, BigDecimal.ROUND_HALF_UP);
//		
//	}

	
	
	

}
