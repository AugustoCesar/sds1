package com.example.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dspesquisa.entities.Genre;

public interface GameRepository extends JpaRepository<Genre, Long>{
	
}
