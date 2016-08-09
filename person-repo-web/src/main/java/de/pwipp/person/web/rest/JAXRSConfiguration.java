package de.pwipp.person.web.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@ApplicationPath("resources")
public class JAXRSConfiguration extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		HashSet<Class<?>> hashSet = new HashSet<>();
		hashSet.add(RestService.class);
		hashSet.add(PersonRestServiceImpl.class);
		hashSet.add(JacksonJsonProvider.class);
		hashSet.add(JacksonContextResolver.class);
		return hashSet;
	}
	
	
	
	
}
