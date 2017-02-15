import java.math.BigDecimal;

abstract class BankAccount {
	
	protected String clientName;
	protected String accountNumber;
	protected BigDecimal accountBalance;
	protected BigDecimal interestRate;
	
	
	
	public BankAccount(String clientName, String accountNumber, BigDecimal accountBalance, BigDecimal interestRate) {
		super();
		this.clientName = clientName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.interestRate = interestRate;
	}

	public abstract void update();
	
	public abstract String getAccountType();
	
	public abstract BigDecimal getBalance();
	
	public void withDraw(BigDecimal withDrawAmount) {
		accountBalance =  accountBalance.subtract(withDrawAmount);
	}
	
	public void deposit(BigDecimal depositAmount) {
		accountBalance = accountBalance.add(depositAmount);
	}
}
