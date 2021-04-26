package com.ftninformatika.dostava.DostavaApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.dostava.DostavaApp.model.Dostavljac;

@Repository
public interface DostavljacRepository extends JpaRepository<Dostavljac, Long> {
	
	Dostavljac findOneById(Long id);

}
