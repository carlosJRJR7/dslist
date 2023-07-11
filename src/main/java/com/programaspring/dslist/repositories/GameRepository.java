package com.programaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programaspring.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
