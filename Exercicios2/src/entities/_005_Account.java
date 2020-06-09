package entities;

public class _005_Account {

	
	private int number;
	private String holder;
	private double balance;
	
		public _005_Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}
	
	public _005_Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount - 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number 
				+", Holder: "
				+ holder
				+", balance: $ "
				+ String.format("%.2f", balance);
	}
	
	
}
