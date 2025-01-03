package com.back.Emprestimo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.back.Emprestimo.core.Client;
import com.back.Emprestimo.core.LoanResponse;
import com.back.Emprestimo.services.LoanResponseService;

@RestController
@RequestMapping
public class LoanController {
	private LoanResponseService loanResponseService;
	
	@Autowired
	public LoanController(LoanResponseService loanResponseService) {
		this.loanResponseService = loanResponseService; 
	}
	
	@PostMapping("/customer-loans")
	public ResponseEntity<LoanResponse> loanResponse(@RequestBody Client client) {
		return ResponseEntity.ok().body(loanResponseService.listLoans(client));
	}
}
