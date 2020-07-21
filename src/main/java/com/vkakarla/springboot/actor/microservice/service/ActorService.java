package com.vkakarla.springboot.actor.microservice.service;

import java.util.List;

import com.vkakarla.springboot.actor.microservice.model.Actor;

public interface ActorService {

	public List<Actor> getActorsByIndustryName(String industryName);

}
