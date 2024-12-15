package com.back.Emprestimo.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.back.Emprestimo.core.Client;
import com.back.Emprestimo.core.Loan;
import com.back.Emprestimo.core.LoanResponse;

@Service
public class LoanResponseService {
	public LoanResponse listLoans(Client client) {
		ArrayList<Loan> loans = new ArrayList<Loan>();
		
		// Conceder o empréstimo pessoal se o salário do cliente for igual ou inferior a R$ 3000.
		// Conceder o empréstimo pessoal se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30 anos e residir em São Paulo (SP).
		// Conceder o empréstimo com garantia se o salário do cliente for igual ou inferior a R$ 3000.
		// Conceder o empréstimo com garantia se o salário do cliente estiver entre R$ 3000 e R$ 5000, se o cliente tiver menos de 30 anos e residir em São Paulo (SP).

		if(client.getIncome() <= 3000
		|| client.getIncome() > 3000 && client.getIncome() <= 5000 && client.getAge() < 30 && client.getLocation().equals("SP")) {
			loans.add(new Loan("PERSONAL", 4));
			loans.add(new Loan("GARANTEED", 3));
		}
		
		// Conceder o empréstimo consignado se o salário do cliente for igual ou superior a R$ 5000.
		if(client.getIncome() >= 5000)
			loans.add(new Loan("CONSINGMENT", 2));

		return new LoanResponse(client.getName(), loans);
	}
}
