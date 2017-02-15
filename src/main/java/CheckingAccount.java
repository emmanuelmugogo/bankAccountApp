import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(String clientName, String accountNumber, BigDecimal accountBalance,
			BigDecimal interestRate) {
		super(clientName, accountNumber, accountBalance, interestRate);s

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAccountType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal getBalance() {
		// TODO Auto-generated method stub
		return null;
	}

}
