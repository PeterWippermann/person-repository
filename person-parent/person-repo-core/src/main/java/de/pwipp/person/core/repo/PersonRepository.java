package de.pwipp.person.core.repo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import de.pwipp.person.api.model.Person;
import de.pwipp.person.api.model.Sex;

public class PersonRepository {
	private final Map<String, Person> persons;

	private static Person PHILIPP = new Person("Philipp", LocalDate.of(1980, 3, 30), Sex.MALE);
	private static Person ELISABETH = new Person("Elisabeth", LocalDate.of(1960, 12, 24), Sex.FEMALE);

	public PersonRepository() {
		persons = new HashMap<String, Person>() {
			{
				put(PHILIPP.getName(), PHILIPP);
				put(ELISABETH.getName(), ELISABETH);
			}
			private static final long serialVersionUID = 4959742574840165661L;
		};
	}

	public Person getPersonByName(String name) {
		return persons.get(name);
	}
	
	public Collection<Person> getAllPersons() {
		return persons.values();
	}
}
