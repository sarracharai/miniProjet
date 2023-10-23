package com.sarra.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Avion {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAvion;
	private String nomAvion;
	private Long capacite;
	private String compagnie;
	
	
	@ManyToOne
	private Destination destination;
	
	
	public Avion() {
		super();
	}

	public Avion(String nomAvion, Long capacite, String compagnie) {
		super();
		this.nomAvion = nomAvion;
		this.capacite = capacite;
		this.compagnie = compagnie;
	}
	
	public Long getIdAvion() {
		return idAvion;
	}
	public void setIdAvion(Long idAvion) {
		this.idAvion = idAvion;
	}
	public String getNomAvion() {
		return nomAvion;
	}
	public void setNomAvion(String nomAvion) {
		this.nomAvion = nomAvion;
	}
	public Long getCapacite() {
		return capacite;
	}
	public void setCapacite(Long capacite) {
		this.capacite = capacite;
	}
	public String getCompagnie() {
		return compagnie;
	}
	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}

	@Override
	public String toString() {
		return "Avion [idAvion=" + idAvion + ", nomAvion=" + nomAvion + ", capacite=" + capacite + ", compagnie="
				+ compagnie + "]";
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	
	
	
	
	
	
	

}
