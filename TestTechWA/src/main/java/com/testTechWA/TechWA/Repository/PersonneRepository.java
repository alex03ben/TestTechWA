package com.testTechWA.TechWA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testTechWA.TestTechWA.Model.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long>{

}
