package com.programaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programaspring.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
