package com.dreamsyssoft.demo.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.dreamsyssoft.demo.rest.model.UserRequest;
import com.dreamsyssoft.demo.rest.model.UserResponse;

@Produces("application/json")
public interface UserManager
{

	@GET
	@Path("/customers/{customerId}/activities")
	public UserResponse fetchAllUsers(@PathParam("customerId") String customerId);

}
