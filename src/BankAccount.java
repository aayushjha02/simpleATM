public class BankAccount {
	private AccountHolder user;
	private double balance;
	private int accountNumber;
	private int PIN;
	
	public BankAccount(AccountHolder user, double balance, int accountNumber, int PIN) {
		this.user = user;
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.PIN = PIN;
	}
	public void deposit(double depositAmount) {
		balanceSet(depositAmount + balanceGet());
	}
	public void withdraw(double withdrawAmount) {
		balanceSet(balanceGet() - withdrawAmount);
	}
	public void showBalance() {
		System.out.println("Your balance is $" + balanceGet());
	}
	public void balanceSet(double balanceInput) {
		balance = balanceInput;
	}
	public void accountNumberSet(int accountNumberInput) {
		accountNumber = accountNumberInput;
	}
	public void PINSet(int PINInput) {
		PIN = PINInput;
	}
	public double balanceGet() {
		return balance;
	}
	public int accountNumberget() {
		return accountNumber;
	}
	public int PINget() {
		return PIN;
	}
	public void userSet(AccountHolder input) {
		user = input;
	}
	public AccountHolder userGet() {
		return user;
	}
	
	
}