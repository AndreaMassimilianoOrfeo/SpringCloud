package it.osc.spring.cloud.lab1.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4529548983608505969L;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player( String name, String position ) {	
		this.name = name;
		this.position = position;
	}

	@Id
	@GeneratedValue
	private Long id ; 
	private String name;
	private String position ;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}
