import java.util.Scanner;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int accountPin = 1234;
		int userPin;
		int tries = 0;
		int userChoice;
		
		System.out.println("WELCOME TO THE BANK ACCOUNT APP\n\nPlease enter your PIN: ");
		userPin = scanner.nextInt();
		
		while (userPin != accountPin && tries < 3) {
			System.out.println("\nYou have entered INCORRECT PIN, TRY AGAIN\n"
					+ "Please enter your PIN: ");
			userPin = scanner.nextInt();
			tries++;
			
		}
		
		if (userPin == accountPin) {
			System.out.println("\nPIN Accepted \n\nWelcome to your Account what would you like to do?\n"
					+ "\t1 - View Balances \n\t2 - Deposit Funds \n\t3 - Withdraw Funds \n\t4 - Exit...");
			userChoice = scanner.nextInt();
			
			switch (userChoice) {
			case 1:
				System.out.println("What account balance would you like to view?"
						+ "\n\t1 - Checking Account \n\t2 - Savings Account \n\t3 - Credit Card Account ");
				userChoice = scanner.nextInt();
				
				if (userChoice == 1) {
					//get the checking account balance
				}else if (userChoice == 2) {
					//get a savings account balance
				}else if (userChoice == 3) {
					//get credit card account balnce
				}
				break;
				
			case 2:
				System.out.println("What account would you like to deposit Funds to?"
						+ "\n\t1 - Checking \n\t2 - Savings");
				userChoice = scanner.nextInt();
				
				if (userChoice == 1) {
					//deposit to checking
				} else if (userChoice == 2){ 
					//deposit to Savings
				}
				break;
				
			case 3:
				System.out.println("What account would you like to withdraw Funds from?"
						+ "\n\t1 - Checking \n\t2 - Savings");
				userChoice = scanner.nextInt();
				
				if (userChoice == 1) {
					//withdraw from checking
				} else if (userChoice == 2){ 
					//withdraw from Savings
				}
				break;
				
			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("You have entered the INVALID selection");
				break;
			}
			
			
		}else if (tries >= 3) {
			System.out.println("\nYour Account Has been LOCKED \nplease call your Banker to fix this..!!");
		}
	
		scanner.close();
	}

}
