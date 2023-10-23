package com.sarra.demo.entities;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomAvion", types = { Avion.class })
public interface AvionProjection {
	
	
	public String getNomAvion();
	}



