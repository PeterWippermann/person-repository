package de.pwipp.person.api.model;

import java.time.LocalDate;

public class Person {
	private String name;
	private LocalDate dateOfBirth;
	private Sex sex;

	public Person(String name, LocalDate dateOfBirth, Sex sex) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public Sex getSex() {
		return sex;
	}

}
