package it.osc.spring.cloud.lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.osc.spring.cloud.lab1.model.Team;
import it.osc.spring.cloud.lab1.repository.TeamRepository;

@RestController
public class TeamController {
	
	@Autowired
	TeamRepository teamRepository;


	@GetMapping("/teams")
	public Iterable<Team> getTeams() {
		return teamRepository.findAll();
	}
}
