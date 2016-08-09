package de.pwipp.person.web.rest;

import java.util.Collection;

import javax.ws.rs.NotFoundException;

import de.pwipp.person.api.model.Person;
import de.pwipp.person.core.repo.PersonRepository;

public class PersonRestServiceImpl implements PersonRestService {

	@Override
	public Collection<Person> getAllPersons() {
		return new PersonRepository().getAllPersons();
	}

	@Override
	public Person getPersonByName(String name) {
		Person person = new PersonRepository().getPersonByName(name);
		if (person == null) {
			throw new NotFoundException();
		} else {
			return person;
		}
	}
}