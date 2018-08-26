package com.javablick.openshift.demo.ee.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("message")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageService {

	@GET
	public List<String> getMessages() {
		List<String> result = new ArrayList<>();
		result.add("test");
		return result;
	}

}
