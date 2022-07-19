package com.testTechWA.TestTechWA.ServiceImpl;


import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.testTechWA.TechWA.Repository.PersonneRepository;
import com.testTechWA.TestTechWA.Model.Personne;
import com.testTechWA.TestTechWA.Service.PersonneService;

public class PersonneServiceImpl implements PersonneService{

	private static final Logger logger = LoggerFactory.getLogger(PersonneServiceImpl.class);
	
	private PersonneRepository personneRepository;
	
	

	public PersonneServiceImpl() {
		super();
	}

	@Autowired
	public PersonneServiceImpl(PersonneRepository personneRepository) {
		super();
		this.personneRepository = personneRepository;
	}


	@Override
	public List<Personne> getAllPersonneOrdered() {
		return personneRepository.findAll().stream().sorted((x1, x2) -> x1.getNom().compareTo(x2.getNom())).collect(Collectors.toList());
	}

	@Override
	public void savePersonne(Personne personne) {
		// TODO Auto-generated method stub
		
	}
	
	
}
