package com.vkakarla.springboot.actor.microservice.model;

public class Actor {
	
	private String starName;
	private String description;
	
	
	public Actor(String starName, String description) {
		super();
		this.starName = starName;
		this.description = description;
	}


	public String getStarName() {
		return starName;
	}


	public void setStarName(String starName) {
		this.starName = starName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

}
