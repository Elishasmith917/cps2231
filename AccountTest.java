package cps_2231_Assignment3;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account1 = new Account(1122, 20000);

	        // Set the annualInterestRate to 0.045
	        account1.setAnnualInterestRate(0.045);

	        // Use the withdraw() method to withdraw $2,500
	        account1.withdraw(2500);

	        // Print the balance, the monthly interest, and the date
	        System.out.println("Balance: $" + account1.getBalance());
	        System.out.println("Monthly Interest: $" + account1.getMonthlyInterest());
	        System.out.println("Date Created: " + account1.getDataCreated());
	    }
	
	}


