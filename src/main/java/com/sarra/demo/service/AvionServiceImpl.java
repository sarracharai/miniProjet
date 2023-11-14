<<<<<<< HEAD
package com.sarra.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarra.demo.entities.Avion;
import com.sarra.demo.entities.Vol;
import com.sarra.demo.repos.AvionRepository;

@Service
public class AvionServiceImpl implements AvionService {
	
	@Autowired
	AvionRepository avionRepository;

	@Override
	public Avion saveAvion(Avion a) {
		return avionRepository.save(a);
	}

	@Override
	public Avion updateAvion(Avion a) {
		return avionRepository.save(a);
	}

	@Override
	public void deleteAvion(Avion a) {
		avionRepository.delete(a);
		
	}

	@Override
	public void deleteAvionById(Long id) {
		avionRepository.deleteById(id);
		
	}

	@Override
	public Avion getAvion(Long id) {
		return avionRepository.findById(id).get();
	}

	@Override
	public List<Avion> getAllAvions() {
		return avionRepository.findAll();
	}

	@Override
	public List<Avion> findByNomAvion(String nom) {
		return avionRepository.findByNomAvion(nom) ;
	}

	@Override
	public List<Avion> findByNomAvionContains(String nom) {
		return avionRepository.findByNomAvionContains(nom);
	}

	@Override
	public List<Avion> findByNomCapacite(String nom, Long capacite) {
		return avionRepository.findByNomCapacite(nom, capacite);
	}


	@Override
	public List<Avion> findByVolIdV(Long id) {
		return avionRepository.findByVolIdV(id);
	}

	@Override
	public List<Avion> findByOrderByNomAvionAsc() {
		return avionRepository.findByOrderByNomAvionAsc();
	}

	@Override
	public List<Avion> trierAvionsNomsCapacite() {
		return avionRepository.trierAvionsNomsCapacite();
	}

	@Override
	public List<Avion> findByVol(Vol vol) {
		return avionRepository.findByVol(vol);
	}
	
	
	
	

}
=======
package com.sarra.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarra.demo.entities.Avion;
import com.sarra.demo.entities.Destination;
import com.sarra.demo.repos.AvionRepository;


@Service
public class AvionServiceImpl implements AvionService {
	
	@Autowired
	AvionRepository avionRepository;

	@Override
	public Avion saveAvion(Avion a) {
		return avionRepository.save(a);
	}

	@Override
	public Avion updateAvion(Avion a) {
		return avionRepository.save(a);
	}

	@Override
	public void deleteAvion(Avion a) {
		 avionRepository.delete(a);
		
	}

	@Override
	public void deleteAvionById(Long id) {
		avionRepository.deleteById(id);
		
	}

	@Override
	public Avion getAvion(Long id) {
		return avionRepository.findById(id).get();
	}

	@Override
	public List<Avion> getAllAvions() {
		
		return avionRepository.findAll() ;
	}

	@Override
	public List<Avion> findByNomAvion(String nom) {
		return avionRepository.findByNomAvion(nom);
	}

	@Override
	public List<Avion> findByNomAvionContains(String nom) {
		return avionRepository.findByNomAvionContains(nom) ;
	}

	@Override
	public List<Avion> findByNomCapacite(String nom, Long capacite) {
		return avionRepository.findByNomCapacite(nom,capacite) ;
	}

	@Override
	public List<Avion> findByDestination(Destination destination) {
		return avionRepository.findByDestination(destination) ;
	}

	@Override
	public List<Avion> findByDestinationIdDest(Long idDestination) {
		return avionRepository.findByDestinationIdDestination(idDestination);
	}

	@Override
	public List<Avion> findByOrderByNomAvionAsc() {
		return avionRepository.findByOrderByNomAvionAsc();
	}

	@Override
	public List<Avion> trierAvionsNomsCapacite() {
		return avionRepository.trierAvionsNomsCapacite();
	}

}
>>>>>>> 5ac019e9f3e38adb64c6212ca89703128a2443c6
