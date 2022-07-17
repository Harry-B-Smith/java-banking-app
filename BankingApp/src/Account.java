import java.util.Scanner;

public class Account {
	
	//class variables
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	
	//Class Constructor
	public Account(String cName, String cId) {
		this.customerName = cName;
		this.customerId = cId;
	}
	
	//Function for Deposit
	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	//Function for Withdrawing Money
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	//Function showing the previous transaction
	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Amount Deposited " + previousTransaction);
		}
		else if (previousTransaction < 0) {
			System.out.println("Amount Withdrawn " + Math.abs(previousTransaction));
		}
		else {
			System.out.println("No transaction occured");
		}
	}
	
	//Function calculating interest
	void calculateInterest(int years) {
	double interestRate = .0185;
	double newBalance = (balance * interestRate * years) + balance;
	System.out.println("The current interest rate is " + (100 * interestRate) + "%");
	System.out.println("After " + years + " years, your balance will be: " + newBalance);
	}
	
	//Function showing meu 
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome, " + customerName + "!");
		System.out.println("Your ID is " + customerId);
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("A: Check your balance");
		System.out.println("B: Make a deposit");
		System.out.println("C: Make a withdrawal");
		System.out.println("D: View previous transaction");
		System.out.println("E: Calculate interest");
		System.out.println("F: Exit");
		
		do {
			System.out.println();
			System.out.println("Enter an option: ");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			
			switch(option) {
			//Case 'A' allows the user to check their account balance
			  case 'A':
				System.out.println("=====================================================");
			    System.out.println("Your current balance is: $" + balance);
			    System.out.println("=====================================================");
			    break;
			  //Case 'B' allows the user to deposit money
			  case 'B':
				System.out.println("Please enter amount to deposit: ");
				int amount = scanner.nextInt();
			    deposit(amount);
			    System.out.println();
			    break;
			  //Case 'C' allows the user to withdraw money
			  case 'C':
				System.out.println("Please enter amount to withdraw: ");
				int amountToWithdraw = scanner.nextInt();
				withdraw(amountToWithdraw);
				System.out.println();
			  //Case 'D' allows the user to check previous transaction amount
			  case 'D':
				System.out.println("=====================================================");
				getPreviousTransaction();
				System.out.println("=====================================================");
				System.out.println();
				break;
			  //Case 'E' allows the user to calculate interest
			  case 'E':
				  System.out.println("Enter estimated years of accrued interest");
				  int years = scanner.nextInt();
				  calculateInterest(years);
				  break;
		      //Case 'F' allows the user to exit the application
			  case 'F':
				  System.out.println("=====================================================");
				    break;
				    
			  default:
			    System.out.println("ERROR. INVALID ENTRY. Please enter A, B, C, D, E, F");
			}
			
			} while (option != 'F'); {
				System.out.println("Thank you for banking wit us today. Have a nice day.");
			}
		
	}

}
