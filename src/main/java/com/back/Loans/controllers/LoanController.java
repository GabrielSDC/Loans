package com.back.Loans.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.back.Loans.core.Client;
import com.back.Loans.dto.LoanDTO;
import com.back.Loans.services.LoanService;

@RestController
@RequestMapping
public class LoanController {
	@Autowired
	private LoanService loanService;
	
	@PostMapping("/customer-loans")
	public LoanDTO listLoans(@RequestBody Client client) {
		return loanService.listLoans(client);
	}
}
