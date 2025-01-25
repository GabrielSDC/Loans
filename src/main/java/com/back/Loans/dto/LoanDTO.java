package com.back.Loans.dto;

import java.util.ArrayList;

import com.back.Loans.core.Loan;

public class LoanDTO {
	private String customer;
	private ArrayList<Loan> loans;
	
	public LoanDTO(String customer, ArrayList<Loan> loans) {
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
