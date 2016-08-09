package de.pwipp.person.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;

import de.pwipp.person.core.CoreApp;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/testservice")
public class RestService {

	// The Java method will process HTTP GET requests
	@GET
	// The Java method will produce content identified by the MIME Media
	// type "text/plain"
	@Produces("text/plain")
	public String getClichedMessage() {
		// Return some cliched textual content
		return CoreApp.hello() + "2";
	}

	@GET
	@Produces("text/plain")
	@Path("{name}")
	public String getClichedMessage2(@PathParam("name") String name) {
		return CoreApp.hello() + " " + name;
	}
}