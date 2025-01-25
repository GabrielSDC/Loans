package com.back.Loans.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.back.Loans.core.Client;
import com.back.Loans.core.Loan;
import com.back.Loans.dto.LoanDTO;

@Service
public class LoanService {
	public LoanDTO listLoans(Client client) {
		ArrayList<Loan> loans = new ArrayList<Loan>();

		if(client.getIncome() <= 3000
		|| client.getIncome() > 3000 && client.getIncome() <= 5000 && client.getAge() < 30 && client.getLocation().equals("SP")) {
			loans.add(new Loan("PERSONAL", 4));
			loans.add(new Loan("GARANTEED", 3));
		}

		if(client.getIncome() >= 5000)
			loans.add(new Loan("CONSINGMENT", 2));

		return new LoanDTO(client.getName(), loans);
	}
}
