import java.util.Scanner;
public class ATM {
	
	private BankAccount account;
	
	public ATM(BankAccount account) {
		this.account = account;
	}
	
	
	public static void main(String[] args) {
		
		ATM atm = new ATM(new BankAccount(new AccountHolder(123456789, "Aayush", 5555555555L, "123 Main Street"), 100, 12345, 123));
		atm.showMenu();
		
		
	}
	public BankAccount BankAccountget() {
		return account;
	}
	public void BankAccountset(BankAccount input) {
		account = input;
	}
	
	public void showMenu() {
		
		Scanner in = new Scanner(System.in);
		int choice = 0;
		int PINCheck;
		int BankAccountNumCheck;
		System.out.println("Hello welcome to Aayush's bank!");
		
		System.out.println("Enter your pin number");
		PINCheck = in.nextInt();
		System.out.println("Enter your bank account number");
		BankAccountNumCheck = in.nextInt();
		if( PINCheck == account.PINget() && BankAccountNumCheck == account.accountNumberget()) {
			
			while (choice != 4) {
				System.out.println("Would you like to withdraw, deposit, show balance, or exit? Type, 1, 2, 3, or 4 for each of the previous actions respectively.");
				choice = in.nextInt();
				if (choice == 1) {
					System.out.println("Enter how much you would like to withdraw.");
					double withdrawAmount_ = in.nextDouble();
					if(withdrawAmount_ <= account.balanceGet() ) {
						account.withdraw(withdrawAmount_);
						System.out.println("Your balance is now $" + account.balanceGet());
					}
					else {
						System.out.println("You tried to withdraw more money than you have in your bank account. Sorry!");
						System.out.println("Your balance is $" + account.balanceGet());
					}
				}
				else if (choice == 2) {
					System.out.println("Enter how much you would like to deposit.");
					double depositAmount_ = in.nextDouble();
					account.deposit(depositAmount_);
					System.out.println("Your balance is now $" + account.balanceGet());
				}
				else if(choice == 3) {
					System.out.println("Your balance is $" + account.balanceGet());
				}
			}
			System.out.println("Thank you for visiting!");
		}
	}
}