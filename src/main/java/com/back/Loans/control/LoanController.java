package com.back.Loans.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.back.Loans.core.Client;
import com.back.Loans.core.LoanResponse;
import com.back.Loans.services.LoanResponseService;

@RestController
@RequestMapping
public class LoanController {
	@Autowired
	private LoanResponseService loanResponseService;
	
	@PostMapping("/customer-loans")
	public ResponseEntity<LoanResponse> loanResponse(@RequestBody Client client) {
		return ResponseEntity.ok().body(loanResponseService.listLoans(client));
	}
}
