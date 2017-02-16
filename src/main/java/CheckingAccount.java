import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(String clientName, String accountNumber, BigDecimal accountBalance,
			BigDecimal interestRate) {
		super(clientName, accountNumber, accountBalance, interestRate);

	}

	@Override
	public String getAccountType() {		
		return "Checking Account";
	}

	@Override
	public BigDecimal getBalance() {
		return accountBalance;
	}

//	@Override
//	public void update() {
//		// TODO Auto-generated method stub
//		
//	}

}
