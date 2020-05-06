package it.osc.spring.cloud.lab1.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Team implements Serializable {
	
	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	public Team(String name,String location,Set<Player> players) {
		this.name = name;
		this.location = location;
		this.players = players;
	}

	private static final long serialVersionUID = -7592250870032009014L;

	@Id
	@GeneratedValue
	private Long id ;
	
	private String location;
	private String name ;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="teamId")
	private Set<Player> players ;
	
	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
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
