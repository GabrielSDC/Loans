package com.back.Emprestimo.core;

public class Client {
	private String name;
	private int age;
	private String cpf;
	private float income;
	private String location;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public float getIncome() {
		return income;
	}
	
	public void setIncome(float income) {
		this.income = income;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Client(int age, String cpf, String name, float income, String location) {
		this.name = name;
		this.age =  age;
		this.cpf = cpf;
		this.income = income;
		this.location =  location;
	}
}
