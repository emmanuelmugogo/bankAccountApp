import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;



public class BankAccountApp {
	
	public static void main(String[] args) throws IOException, URISyntaxException {
		
//		 // get resource from classpath
//        java.net.URL resource = ClassLoader.getSystemResource("quickfind/largeUF.txt");
//        Path path = Paths.get(((java.net.URL) resource).toURI());
//
//        // read all lines
//        List<String> allLines = Files.readAllLines(path);
//
//        // print all lines
//        allLines.stream().forEach(System.out::println);
		
		BankAccount myChecking = new CheckingAccount("John", "00000Check", new BigDecimal("1000.00"), new BigDecimal("0.05"));
		BankAccount mySaving = new SavingsAccount("Doe", "00000Saving", new BigDecimal("2000"), new BigDecimal("0.10"));
		BankAccount myCard = new CreditCardAccount("Foo", "00000Card", new BigDecimal("3000"), new BigDecimal("0.15"));
		
		
		
		Scanner scanner = new Scanner(System.in);
		int accountPin = 1234;
		int userPin;
		int tries = 0;
		int userChoice;
		String mainMenu = "\t1 - View Balances \n\t2 - Deposit Funds \n\t3 - Withdraw Funds \n\t4 - Exit...";
		
		
		System.out.println("\n*********************************"
				+ "\nWELCOME TO THE BANK ACCOUNT APP"
				+ "\n*********************************\n\nPlease enter your PIN: ");
		userPin = scanner.nextInt();
		
		while (userPin != accountPin && tries < 2) {
			System.out.println("\nYou have entered INCORRECT PIN, TRY AGAIN\n"
					+ "Please enter your PIN: ");
			userPin = scanner.nextInt();
			tries++;
			
		}
		
		if (userPin == accountPin) {
			System.out.println("\nPIN accepted\nWelcome to your Account what would you like to do?\n" + mainMenu);
			
			//update the balances 
			myCard.update();
			myChecking.update();
			mySaving.update();
			
			
			userChoice = scanner.nextInt();
			
			//user choice should be only between 1 - 4
			while (userChoice < 1 || userChoice > 4) {
		        System.out.print("\nError! Incorrect choice.\nPlease choose between 1 - 4\n" + mainMenu);
		        userChoice = scanner.nextInt();
		    }
			
			switch (userChoice) {
			case 1:
				System.out.println("What account balance would you like to view?"
						+ "\n\t1 - Checking Account \n\t2 - Savings Account \n\t3 - Credit Card Account ");
				userChoice = scanner.nextInt();
				
				if (userChoice == 1) {
					System.out.println("\nYour " + myChecking.getAccountType() + " balance is: $" + myChecking.getBalance());
				}else if (userChoice == 2) {
					System.out.println("\nYour " + mySaving.getAccountType() + " balance is: $" + mySaving.getBalance());
				}else if (userChoice == 3) {
					System.out.println("\nYour " + myCard.getAccountType() + " balance is: $" + myCard.getBalance());
				}
				break;
				
			case 2:
				System.out.println("What account would you like to deposit Funds to?"
						+ "\n\t1 - Checking \n\t2 - Savings");
				userChoice = scanner.nextInt();
				
				if (userChoice == 1) {
					System.out.println("Your Account Balance after updates is $" + myChecking.getBalance()
							+ "\nHow much would you like to deposit in Your Checking Account?");
					BigDecimal depositAmount = scanner.nextBigDecimal();
					myChecking.deposit(depositAmount);
					System.out.println("******RECEIPT******\nNow your Checking Balance is $" + myChecking.getBalance());
					
				} else if (userChoice == 2){ 
					System.out.println( "Your Account Balance after updates is $" + mySaving.getBalance()
							+ "\nHow much would you like to deposit in Your Savings Account?");
					BigDecimal depositAmount = scanner.nextBigDecimal();
					mySaving.deposit(depositAmount);
					System.out.println("******RECEIPT******\nNow your Savings Balance is $" + mySaving.getBalance());
				}
				break;
				
			case 3:
				System.out.println("What account would you like to withdraw Funds from?"
						+ "\n\t1 - Checking \n\t2 - Savings");
				userChoice = scanner.nextInt();
				
				if (userChoice == 1) {
					System.out.println("Your Checking account Balance is $" + myChecking.getBalance() + 
							"\nHow much would you like to withdraw from this account?");
					BigDecimal withDrawAmount = scanner.nextBigDecimal();
					BigDecimal bal = myChecking.getBalance();
				//checking the balance vs amount to be drawn
					while(bal.compareTo(withDrawAmount) == -1 ) {
						System.out.println("ERROR\nYou have entered more than your account Balance,"
								+ "\nYour maximum withdraw amount is $" + bal + " 'please enter $" + bal + " or less'");
						withDrawAmount = scanner.nextBigDecimal();
					}
				
					
					myChecking.withDraw(withDrawAmount);
					System.out.println("******RECEIPT*******\nYou have withdrawn $" + withDrawAmount + 
							" from your " + myChecking.getAccountType() + "\nYour new balance is $" + myChecking.getBalance() );
					
				} else if (userChoice == 2){ 
					System.out.println("Your Savings account Balance is $" + mySaving.getBalance() + 
							"\nHow much would you like to withdraw from this account?");
					BigDecimal withDrawAmount = scanner.nextBigDecimal();
					BigDecimal bal = mySaving.getBalance();
					//checking the balance vs amount to be drawn
						while(bal.compareTo(withDrawAmount) == -1 ) {
							System.out.println("ERROR\nYou have entered more than your account Balance,"
									+ "\nYour maximum withdraw amount is $" + bal + " 'please enter $" + bal + " or less'");
							withDrawAmount = scanner.nextBigDecimal();
						}
						
					mySaving.withDraw(withDrawAmount);
					System.out.println("******RECEIPT*******\n"
							+ "You have withdrawn $" + withDrawAmount + 
							" from your " + mySaving.getAccountType() + "\nYour new balance is $" + mySaving.getBalance() );
				}
				break;
				
			case 4:
				System.out.println("Bye and Have a great Day");
				System.exit(0);
				break;
			}
			
			
		}else if (tries >= 3) {
			System.out.println("\nYour Account Has been LOCKED \nplease call your Banker to fix this..!!");
		}
		
	
		scanner.close();
	}

}
