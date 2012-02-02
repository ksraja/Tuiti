package com.persistent.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.persistent.entity.Tutorial;
import com.persistent.service.TutorialService;

@Component
@Path("/tutorial")
@Scope("request")
public class TutorialResource {

	@Autowired
	TutorialService tutorialService;

	@GET
	@Path("/getAll")
	@Produces("text/plain")
	public String getAllTutorials() {

		StringBuffer buffer = new StringBuffer();
		
		List<Tutorial> tutorials = tutorialService.getAll();
		
		for (Tutorial tutorial : tutorials) {
			buffer.append(tutorial.getTutorialName()).append(":").append(tutorial.getTutorialDesc()).append("\n");
		}
		
		return buffer.toString();
	}

}