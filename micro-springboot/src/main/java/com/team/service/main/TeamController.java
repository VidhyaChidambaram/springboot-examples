package com.team.service.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team.service.entity.Team;
import com.team.service.interfaces.TeamRepository;


public class TeamController {

	@Autowired
	private TeamRepository teamRepository;
	
	@RequestMapping("/teams")
	public List<Team> getTeams() {
		List<Team> teamList = teamRepository.findAll();
		return teamList;
	}
	
	@RequestMapping("/team/{id}")
	public Team getTeamById(@PathVariable Integer id) {
		
		return teamRepository.findById(id);
	}
	
}
