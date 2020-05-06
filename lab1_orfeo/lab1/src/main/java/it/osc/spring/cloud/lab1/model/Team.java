package it.osc.spring.cloud.lab1.model;

import java.io.Serializable;

public class Team implements Serializable {

	private static final long serialVersionUID = -7592250870032009014L;

	private Long id ;
	private String location;
	private String name ;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
