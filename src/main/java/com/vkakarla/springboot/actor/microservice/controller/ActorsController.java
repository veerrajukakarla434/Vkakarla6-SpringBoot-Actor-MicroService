package com.vkakarla.springboot.actor.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vkakarla.springboot.actor.microservice.model.Actor;
import com.vkakarla.springboot.actor.microservice.service.ActorService;

@RestController
public class ActorsController {

	@Autowired
	ActorService actorService;
	
	@GetMapping(value = "/getActorsByIndustry/{industryName}")
	public List<Actor> getActors(@PathVariable String industryName) {

		List<Actor> studentList = actorService.getActorsByIndustryName(industryName);
		
		return studentList;
	}
	
}
