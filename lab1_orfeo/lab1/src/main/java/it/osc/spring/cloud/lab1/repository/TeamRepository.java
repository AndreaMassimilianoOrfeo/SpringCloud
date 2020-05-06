package it.osc.spring.cloud.lab1.repository;

import org.springframework.data.repository.CrudRepository;

import it.osc.spring.cloud.lab1.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {

}
