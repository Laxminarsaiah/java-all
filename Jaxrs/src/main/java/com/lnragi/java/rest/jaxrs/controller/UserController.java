package com.lnragi.java.rest.jaxrs.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.lnragi.java.rest.jaxrs.entity.UserEntity;
import com.lnragi.java.rest.jaxrs.exceptions.UserNotFoundException;
import com.lnragi.java.rest.jaxrs.service.UserService;
import com.lnragi.java.rest.jaxrs.service.UserServiceImpl;

/**
 * @author Laxminarsaiah Ragi
 *
 */
@Path("/users/api")
public class UserController {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/save")
	public Response addUser(UserEntity user) {
		return Optional.ofNullable(new UserServiceImpl().addUser(user))
				.map(usr -> Response.ok(usr).build()).get();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getall")
	public Response getAllUsers() {
		return Optional.of(new UserServiceImpl().findAll())
				.map(usrList -> Response.ok(usrList).build()).get();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getbyid")
	public Response getById(@QueryParam("id") Integer id) {
		return Optional.of(new UserServiceImpl().findById(id))
				.map(usr -> Response.ok(usr).build()).get();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response findById(@PathParam("id") Integer id) {
		return Optional.of(new UserServiceImpl().findById(id))
				.map(usr -> Response.ok(usr).build()).get();
	}

	/*
	 * @PUT
	 * 
	 * @Path("/update") public Response updateUser(@QueryParam("user")
	 * UserEntity user) { Optional<UserEntity> u = Optional.of(new
	 * UserServiceImpl().updateUser(user)); if (!u.isPresent()) { throw new
	 * UserNotFoundException("Something went wrong while update"); } return
	 * u.map(usr -> Response.status(200).entity(user).build()).get(); }
	 */

	/*
	 * @DELETE
	 * 
	 * @Path("/delete") public Response deleteUser(@QueryParam("id") Integer id)
	 * { new UserServiceImpl().deleteUser(id); return Response.ok().build(); }
	 */

}
