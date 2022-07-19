package com.testTechWA.TestTechWA.Model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONNE")
public class Personne {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PERSONNE", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "NOM", unique=false, insertable=true, updatable=true, nullable=false)
	private String nom;
	
	@Column(name = "PRENOM", unique=false, insertable=true, updatable=true, nullable=false)
	private String prenom;
	
	@Column(name = "DATE_DE_NAISSANCE", unique=false, insertable=true, updatable=true, nullable=false)
	private LocalDate dateNaissance;

	public Personne() {
		super();
	}

	public Personne(Long id, String nom, String prenom, LocalDate dateNaissance) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateNaissance, id, nom, prenom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return Objects.equals(dateNaissance, other.dateNaissance) && Objects.equals(id, other.id)
				&& Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom);
	}
	
}
