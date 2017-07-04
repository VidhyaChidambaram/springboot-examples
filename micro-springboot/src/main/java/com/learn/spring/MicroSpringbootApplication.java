package com.learn.spring;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.service.entity.Player;
import com.service.entity.Team;
import com.service.interfaces.TeamRepository;

@SpringBootApplication
@EnableJpaRepositories("com.service.interfaces")
@EntityScan("com.service.entity")
public class MicroSpringbootApplication extends SpringBootServletInitializer {

	@Autowired
	private TeamRepository teamRepository;
	
	@PostConstruct
	public void init() {

		Team t1 = new Team();
		t1.setTeamMascot("lion");
		t1.setTeamName("tsunami");
		
		Team t2 = new Team();
		t2.setTeamMascot("camel");
		t2.setTeamName("desertFun");
		
			
		Set<Player> playerList = new HashSet<Player>();
		playerList.add(new Player("john", "bowling"));
		playerList.add(new Player("carstairs", "fielding"));
		
		t1.setPlayerList(playerList);
		t2.setPlayerList(null);
		
		teamRepository.save(t1);
		teamRepository.save(t2);

	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(MicroSpringbootApplication.class, args);
	}
	
	
}
