package com.avdhoot.jerseyproject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to the
	 * client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
	public String getIt() {
		System.out.println("hi");
		return "Got it!";
	}
}
