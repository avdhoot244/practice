package com.avdhoot.jerseyproject;

import java.util.List;

import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/persons")
public class PersonResource {

	PersonRepository repo = new PersonRepository();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getPerson() {
		System.out.println("hi");
		return repo.getPersons();

	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("createPerson")
	public Person createPerson(JsonObject jOb) {
		System.out.println("hi");
		System.out.println(jOb.getString("string"));
		return null;

	}

}
