package com.vkakarla.springboot.actor.microservice.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.vkakarla.springboot.actor.microservice.model.Actor;
import com.vkakarla.springboot.actor.microservice.service.ActorService;

@Service
public class ActorServiceImpl implements ActorService {
	
	private static Map<String, List<Actor>> industryDB = new HashMap<String, List<Actor>>();

	static {
		industryDB = new HashMap<String, List<Actor>>();

		List<Actor> lst = new ArrayList<Actor>();
		Actor actor = new Actor("Jennifer Lawrence", "American actress.");
		lst.add(actor);
		actor = new Actor("Will Smith", "American actor, producer");
		lst.add(actor);
		industryDB.put("hollywood", lst);
		
		lst = new ArrayList<Actor>();
		actor = new Actor("Mahesh Babu", "Indian Telugu Film Actor");
		lst.add(actor);
		actor = new Actor("Allu Arjun", "Indian Telugu Film Actor");
		lst.add(actor);
		actor = new Actor("Prabash", "Indian Telugu Film Actor");
		lst.add(actor);
		actor = new Actor("Vijay DevaraKonda", "Indian Telugu Film Actor");
		lst.add(actor);

		industryDB.put("tollywood", lst);
		 
		lst = new ArrayList<Actor>();
		actor = new Actor("Amitabh Bachchan", "Indian Hindi Film Actor");
		lst.add(actor);
		actor = new Actor("Salman Khan", "Indian Hindi Film Actor");
		lst.add(actor);
		actor = new Actor("Ranveer Singh", "Indian Hindi Film Actor");
		lst.add(actor);
		actor = new Actor("Aamir Khan", "Indian Hindi Film Actor");
		lst.add(actor);
		
		industryDB.put("bollywood", lst);
		

	}
	

	@Override
	public List<Actor> getActorsByIndustryName(String industryName) {
		
		List<Actor> actorList = industryDB.get(industryName);
		
		if (actorList == null) {
			actorList = new ArrayList<Actor>();
			Actor actor = new Actor("Not Found", "N/A : provide correct Industry Name");
			actorList.add(actor);
		}
		
		return actorList;
	}
	
	

}
