package control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import core.Client;
import core.LoanResponse;
import services.LoanResponseService;

@RestController
public class LoanController {
	private LoanResponseService loanResponseService;
	
	@Autowired
	public LoanController(LoanResponseService loanResponseService) {
		this.loanResponseService = loanResponseService; 
	}
	
	@GetMapping("/loans")
	public String loans() {
		return "Aqui deu certo!";
	}
	
	@PostMapping("/customer-loans")
	public LoanResponse loanResponse(@RequestBody Client client) {
		return loanResponseService.listLoans(client);
	}
}
