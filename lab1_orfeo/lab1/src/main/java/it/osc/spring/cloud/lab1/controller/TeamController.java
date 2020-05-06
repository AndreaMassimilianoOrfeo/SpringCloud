package it.osc.spring.cloud.lab1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/teams/{id}")
	public Optional<Team> getTeam(@PathVariable Long id) {
		return teamRepository.findById(id);
	}
}
