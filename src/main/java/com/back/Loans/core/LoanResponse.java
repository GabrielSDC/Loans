package com.back.Loans.core;

import java.util.ArrayList;

public class LoanResponse {
	private String customer;
	private ArrayList<Loan> loans;
	
	public LoanResponse(String customer, ArrayList<Loan> loans) {
		this.setCustomer(customer);
		this.setLoans(loans);
	}

	public ArrayList<Loan> getLoans() {
		return loans;
	}

	public void setLoans(ArrayList<Loan> loans) {
		this.loans = loans;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}	
}
