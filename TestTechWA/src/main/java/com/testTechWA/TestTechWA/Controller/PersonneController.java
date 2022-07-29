package com.testTechWA.TestTechWA.Controller;

import java.net.URI;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.testTechWA.TestTechWA.Model.Personne;
import com.testTechWA.TestTechWA.Repository.PersonneRepository;
import com.testTechWA.TestTechWA.Service.PersonneService;

@RestController
public class PersonneController {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonneController.class);  
	
	@Autowired
	private PersonneService personneService;
	
	@GetMapping("/personnesOrdered")
	public ResponseEntity<Collection<Personne>> getAllPersonneOrderedWithAge() {
        logger.info("Recupère toutes les personnes ...");
        
        Collection<Personne> allPersonneOrdered = personneService.getAllPersonneOrdered();
        
        return new ResponseEntity<Collection<Personne>>(allPersonneOrdered, HttpStatus.FOUND);
    }
	
	@PutMapping(value = "/savePersonne",
	        consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
	        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	 public ResponseEntity<Personne> savePersonneS(@RequestBody Personne personne) {
		
		Personne personneSaved = personne;
		
		if(personneSaved != null) {

			if(personne.getAge() < 150) {
				personneService.savePersonne(personne);
				return new ResponseEntity(HttpStatus.OK);
			}else {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
			}
		}else {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		

	}

}
