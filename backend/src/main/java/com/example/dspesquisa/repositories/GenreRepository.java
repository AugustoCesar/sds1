package com.example.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dspesquisa.entities.Game;

public interface GenreRepository extends JpaRepository<Game, Long>{
	
}
