import java.math.BigDecimal;

abstract class BankAccount {
	
	private String clientName;
	private String accountNumber;
	private BigDecimal accountBalance;
	private BigDecimal interestRate;
	
	public BankAccount(String clientName, String accountNumber, BigDecimal accountBalance, BigDecimal interestRate) {
		super();
		this.clientName = clientName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.interestRate = interestRate;
	}

	public String getClientName() {
		return clientName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}
	
	public abstract void update();
	
	public abstract void getAccountType();
}
