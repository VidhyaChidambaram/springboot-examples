package com.service.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.service.entity.Player;

@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player, Integer> {

	public Player save(Player player);
	
	public List<Player> findAll();
	
	public Player findById(Integer id);
}
