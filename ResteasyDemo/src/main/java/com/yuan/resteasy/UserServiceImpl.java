package com.yuan.resteasy;

import com.yuan.model.User;
import com.yuan.service.UserService;
import com.yuan.model.GenericResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Map;

@Path("/api/user")
public class UserServiceImpl {
	//Service to search products
	UserService userService = new UserService();
	Map<Integer, User> all = userService.getUserMap();

	//Fetch user by unique identification
	@GET
	@Path("/get/{id}")
	@Produces("application/json")

	public User getOneUser(@PathParam("id") int id) {
		return userService.getUserById(id);
	}


	//Fetch all users
	@GET
	@Path("/getAll")
	@Produces("application/json")
	public User[] getAllUsers() {
		return userService.getAllUsers();
	}

	//Add operation
	@POST
	@Path("/add")
	@Consumes("application/json")

	public Response addUser(User user) {
		GenericResponse response = new GenericResponse();
		if(userService.getUserById(user.getId()) != null){
			response.setStatus(false);
			response.setMessage("User Already Exists");
			response.setErrorCode("EC-01");
			return Response.status(422).entity(response).build();
		}
		all.put(user.getId(), user);
		response.setStatus(true);
		response.setMessage("User created successfully");
		return Response.ok(response).build();
	}


	//Delete operation
	@DELETE
	@Path("/delete/{id}")
	@Consumes("application/json")
	public Response deleteUser(@PathParam("id") int id) {
		GenericResponse response = new GenericResponse();
		if(all.get(id) == null){
			response.setStatus(false);
			response.setMessage("User Doesn't Exists");
			response.setErrorCode("EC-02");
			return Response.status(404).entity(response).build();
		}
		all.remove(id);
		response.setStatus(true);
		response.setMessage("User deleted successfully");
		return Response.ok(response).build();
	}
}