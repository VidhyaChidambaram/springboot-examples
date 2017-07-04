package com.service.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.service.entity.Team;

@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team, Integer>{

	public Team save(Team team);
	
	public List<Team> findAll();
	
	public Team findById(Integer id);
}
