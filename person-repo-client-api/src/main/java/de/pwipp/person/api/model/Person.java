package de.pwipp.person.api.model;

import java.time.LocalDate;

public class Person {
	private String name;
	private LocalDate dateOfBirth;
	private Sex sex;

	public Person(String name, LocalDate dateOfBirth, Sex sex) {
		this();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.sex = sex;
	}
	
	public Person() {
		super();
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

	public void setName(String name) {
		this.name = name;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

}
