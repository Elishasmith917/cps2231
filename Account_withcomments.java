package cps_2231_Assignment3;

	import java.util.Date;

	public class Account_withcomments {
	    // Data fields
	    private int id; // Unique identifier for the account
	    private double balance; // Current balance of the account
	    private double annualInterestRate; // Annual interest rate
	    private Date dateCreated = new Date(); // Date when the account was created

	    // Constructors
	    /**
	     * Default constructor.
	     * Initializes id, balance, and annualInterestRate to default values.
	     */
	    public Account() {
	        id = 0;
	        balance = 0;
	        annualInterestRate = 0.2;
	    }

	    /**
	     * Constructor with parameters.
	     * Initializes id, balance, and annualInterestRate with specified values.
	     * @param id Account ID
	     * @param balance Initial balance
	     */
	    public Account(int id, double balance) {
	        this.id = id;
	        this.balance = balance;
	        annualInterestRate = 0.2;
	    }

	    // Getters and setters
	    /**
	     * Getter for account ID.
	     * @return Account ID
	     */
	    public int getId() {
	        return id;
	    }

	    /**
	     * Setter for account ID.
	     * @param id Account ID
	     */
	    public void setId(int id) {
	        this.id = id;
	    }

	    /**
	     * Getter for balance.
	     * @return Current balance
	     */
	    public double getBalance() {
	        return balance;
	    }

	    /**
	     * Setter for balance.
	     * @param balance New balance
	     */
	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    /**
	     * Getter for annualInterestRate.
	     * @return Annual interest rate
	     */
	    public double getAnnualInterestRate() {
	        return annualInterestRate;
	    }

	    /**
	     * Setter for annualInterestRate.
	     * @param annualInterestRate New annual interest rate
	     */
	    public void setAnnualInterestRate(double annualInterestRate) {
	        this.annualInterestRate = annualInterestRate;
	    }

	    /**
	     * Getter for dateCreated.
	     * @return Date when the account was created
	     */
	    public Date getDataCreated() {
	        return dateCreated;
	    }

	    /**
	     * Calculate monthly interest rate.
	     * @return Monthly interest rate
	     */
	    public double getMonthlyInterestRate() {
	        return annualInterestRate / 12;
	    }

	    /**
	     * Calculate monthly interest.
	     * @return Monthly interest
	     */
	    public double getMonthlyInterest() {
	        return balance * getMonthlyInterestRate();
	    }

	    /**
	     * Deposit a specified amount to the account.
	     * @param depositAmount Amount to deposit
	     */
	    public void deposit(double depositAmount) {
	        balance += depositAmount;
	    }

	    /**
	     * Withdraw a specified amount from the account.
	     * @param withdrawAmount Amount to withdraw
	     */
	    public void withdraw(double withdrawAmount) {
	        balance -= withdrawAmount;
	    }

	    // toString() method
	    /**
	     * String representation of the Account object.
	     * @return String representation
	     */
	    @Override
	    public String toString() {
	        return "Account{" +
	                "id=" + id +
	                ", balance=" + balance +
	                ", annualInterestRate=" + annualInterestRate +
	                ", dateCreated=" + dateCreated +
	                '}';
	    }
	}
}
