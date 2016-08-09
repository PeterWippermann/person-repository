package de.pwipp.person.web.rest;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.pwipp.person.api.model.Person;

@Path("persons")
public interface PersonRestService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	Collection<Person> getAllPersons();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{name}")
	Person getPersonByName(@PathParam("name") String name);

}