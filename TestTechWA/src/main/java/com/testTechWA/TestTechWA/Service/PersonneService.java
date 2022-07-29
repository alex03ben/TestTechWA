package com.testTechWA.TestTechWA.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.testTechWA.TestTechWA.Model.Personne;

@Service
public interface PersonneService {

	List<Personne> getAllPersonneOrdered();
	
	Personne savePersonne(Personne personne);
}
