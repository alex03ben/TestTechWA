package com.testTechWA.TestTechWA.Controller;

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

@Controller
public class PersonneController {
	
	private static final Logger logger = LoggerFactory.getLogger(DefaultController.class);  
	
	@Autowired
	private PersonneRepository personneRepository;
	
	@GetMapping(value = "/personnes")
	public ResponseEntity<String> getAllPersonne() {
        logger.info("Recupère toutes les personnes .....");
        List<Personne> lRetour = personneRepository.findAll();
        
        return new ResponseEntity<String>("Liste des personnes = "+lRetour, HttpStatus.OK);
    }

}