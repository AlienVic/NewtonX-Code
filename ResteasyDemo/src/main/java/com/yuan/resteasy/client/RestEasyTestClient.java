package com.yuan.resteasy.client;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.yuan.model.GenericResponse;

public class RestEasyTestClient {

	public static void main(String[] args) {

		ResteasyClient client = new ResteasyClientBuilder().build();

		//GET example

		System.out.println("Get start");
		ResteasyWebTarget getUser = client.target("http://localhost:8080/app/user/1");
		Response getUserResponse = getUser.request().get();
		String value = getUserResponse.readEntity(String.class);
        System.out.println(value);
		System.out.println("HTTP Response Code:"+getUserResponse.getStatus());
		getUserResponse.close();

        //POST example

		System.out.println("POST start");
		ResteasyWebTarget add = client.target("http://localhost:8080/app/user/add");
		String input = "{\"id\":50,\"firstname\":\"Bibo\", \"lastname\":\"chris\"}";
		Response addResponse = add.request().post(Entity.entity(input, "application/json"));
		System.out.println(addResponse.readEntity(String.class));
		System.out.println("HTTP Response Code:"+addResponse.getStatus());
		addResponse.close();


		//DELETE example
		System.out.println("delete start");
		ResteasyWebTarget delete = client.target("http://localhost:8080/app/user/delete/50");
		Response deleteResponse = delete.request().delete();
		System.out.println(deleteResponse.readEntity(String.class));
		System.out.println("HTTP Response Code:"+deleteResponse.getStatus());
		deleteResponse.close();

	}

}
