package smallBanksim;

public class BankAccount {

	private Bank bank;
	private Person owner;
	private int balance;
	private int accountNumber;
	static public int bankAccountCounter;

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public static int getBankAccountCounter() {
		return bankAccountCounter;
	}

	public static void setBankAccountCounter(int bankAccountCounter) {
		BankAccount.bankAccountCounter = bankAccountCounter;
	}

	public void withdraw(int money) {
		if (balance >= money) {
			balance -= money;
		} else {
			System.out.println("Cannot withdraw " + money + " from account #"
					+ accountNumber);

		}
	}

	public void deposit(int money) {
		balance += money;
	}

	public void interest() {
		if (balance < 250) {
			balance += 15;
		} else if (balance > 500) {
			balance += 35;
		} else {
			balance += 20;
		}
	}

	public String toString() {
		return "#" + accountNumber + " @ " + bank + ": " + balance + "$" + "\n"
				+ "Owner Information:" + "\n" + owner;

	}

}
