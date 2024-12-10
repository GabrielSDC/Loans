package core;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class Client {
	private String name;
	private int age;
	private String cpf;
	private int income;
	private String location;
}
