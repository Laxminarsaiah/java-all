package com.lnragi.java.rest.jaxrs.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.lnragi.java.rest.jaxrs.entity.UserEntity;

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
	public UserEntity addUser(UserEntity user) {

		return user;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getall")
	public List<UserEntity> getAllUsers(UserEntity user) {

		return null;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getbyid")
	public List<UserEntity> getById(@QueryParam("id") Integer id) {

		return null;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public List<UserEntity> findById(@PathParam("id") Integer id) {

		return null;
	}

	@Path("/update")
	public List<UserEntity> updateUser(@QueryParam("id") Integer id) {

		return null;
	}

	@Path("/delete")
	public List<UserEntity> deleteUser(@QueryParam("id") Integer id) {

		return null;
	}

}
