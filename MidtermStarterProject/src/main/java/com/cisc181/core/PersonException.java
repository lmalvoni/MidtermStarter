package com.cisc181.core;

public class PersonException extends Exception {

	private String Person;

	public String getPerson() {
		return Person;
	}

	public void setPerson(String person) {
		this.Person = person;
	}
	public PersonException(int age){
		System.out.println("too old");
		
	}
	public PersonException(String phone_number){
		System.out.println("invalid phone number");
	}
}

