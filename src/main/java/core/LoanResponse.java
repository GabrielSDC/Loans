package core;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
public class LoanResponse {
	private String customer;
	private ArrayList<Loan> loans;
}
