package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	//CONSTRUCTS...............................................
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	//METODOS DE ACESSO...............................................
	
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
	
	//OPERAÇÕES.........................................................
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	public String toString() {
		return "\nAccount data:\n"
				+ "Account " + number + ","
				+ " Holder: " + holder + ", "
				+ "Balance: $ " + String.format("%.2f", balance);
	}


}