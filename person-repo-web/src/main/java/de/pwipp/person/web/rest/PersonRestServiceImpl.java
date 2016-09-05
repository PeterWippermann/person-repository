package de.pwipp.person.web.rest;

import java.util.Collection;

import javax.ws.rs.NotFoundException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.pwipp.person.api.model.Person;
import de.pwipp.person.core.repo.PersonRepository;

public class PersonRestServiceImpl implements PersonRestService {
	Logger logger = LogManager.getLogger(PersonRestServiceImpl.class);

	@Override
	public Collection<Person> getAllPersons() {
		return new PersonRepository().getAllPersons();
	}

	@Override
	public Person getPersonByName(String name) {
		Person person = new PersonRepository().getPersonByName(name);
		if (person == null) {
			NotFoundException exception = new NotFoundException("There's no person named " + name + "!");
			logger.info("No Person found!", exception);
			throw exception;
		} else {
			logger.info("Found person " + name + ": " + person);
			return person;
		}
	}
}