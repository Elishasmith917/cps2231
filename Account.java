package cps_2231_Assignment3;

import java.util.Date;

	public class Account {
	    // Data fields
	    private int id;
	    private double balance;
	    private double annualInterestRate; 
	    private Date dateCreated; 

	    // Constructors
	   
	    public Account() {
	        id = 0;
	        balance = 0;
	        annualInterestRate = 0.02;
	        dateCreated = new java.util.Date();
	    }

	    //Constructor with parameters.
	    public Account(int id, double balance) {
	        this.id = id;
	        this.balance = balance;
	        annualInterestRate = 0.02;
	        dateCreated = new java.util.Date();
	    }

	    // Getters and setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int newid) {
	        id = newid;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double newbalance) {
	        balance = newbalance;
	    }
	    double getAnnualInterestRate() {
	        return annualInterestRate;
	    }
	    public void setAnnualInterestRate(double newRate) {
	        annualInterestRate = newRate;
	    }
	    public Date getDataCreated() {
	        return dateCreated;
	    }
	    public double getMonthlyInterestRate() {
	        return annualInterestRate / 12;
	    }

	    public double getMonthlyInterest() {
	        return balance * getMonthlyInterestRate();
	    }
	    public void deposit(double depositAmount) {
	        balance += depositAmount;
	    }

	    public void withdraw(double withdrawAmount) {
	        balance -= withdrawAmount;
	    }
	    // toString() method

		@Override
		public String toString() {
			return "Account [id=" + id + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate
					+ ", dateCreated=" + dateCreated + "]";
		}
	}


