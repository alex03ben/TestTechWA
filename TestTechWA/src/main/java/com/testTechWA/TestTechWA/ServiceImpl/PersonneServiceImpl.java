package com.testTechWA.TestTechWA.ServiceImpl;


import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testTechWA.TestTechWA.Model.Personne;
import com.testTechWA.TestTechWA.Repository.PersonneRepository;
import com.testTechWA.TestTechWA.Service.PersonneService;

@Service
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
		return personneRepository.findAllByOrderByNomAsc();
	}

	@Override
	public Personne savePersonne(Personne personne) {
		return personneRepository.save(personne);
	}
	
	
}
