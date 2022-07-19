package com.testTechWA.TestTechWA.Controller;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.testTechWA.TechWA.Repository.PersonneRepository;
import com.testTechWA.TestTechWA.Model.Personne;
import com.testTechWA.TestTechWA.Service.PersonneService;

@Controller
public class PersonneController {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonneController.class);  
	
	@Autowired
	private PersonneService personneService;
	
	@GetMapping(value = "/personnesOrdered")
	public ResponseEntity<Collection<Personne>> getAllPersonneOrderedWithAge() {
        logger.info("Recupère toutes les personnes ...");
        
        Collection<Personne> allPersonneOrdered = personneService.getAllPersonneOrdered();
        
        return new ResponseEntity<Collection<Personne>>(allPersonneOrdered, HttpStatus.FOUND);
    }

}
