package com.example.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{
	
}
