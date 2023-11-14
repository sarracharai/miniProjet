<<<<<<< HEAD
package com.sarra.demo.service;

import java.util.List;
import com.sarra.demo.entities.Avion;
import com.sarra.demo.entities.Vol;

public interface AvionService {
	
	Avion saveAvion(Avion a);
	Avion updateAvion(Avion a);
	void deleteAvion(Avion a);
	void deleteAvionById(Long id);
	Avion getAvion(Long id);
	List<Avion> getAllAvions();
	List<Avion> findByNomAvion(String nom);
	List<Avion> findByNomAvionContains(String nom);
	List<Avion> findByNomCapacite (String nom, Long capacite);
	List<Avion> findByVol (Vol vol);
	List<Avion> findByVolIdV(Long id);
	List<Avion> findByOrderByNomAvionAsc();
	List<Avion> trierAvionsNomsCapacite();



}
=======
package com.sarra.demo.service;

import java.util.List;

import com.sarra.demo.entities.Avion;
import com.sarra.demo.entities.Destination;

public interface AvionService {
	
	Avion saveAvion(Avion a);
	Avion updateAvion(Avion a);
	void deleteAvion(Avion a);
	void deleteAvionById(Long id);
	Avion getAvion(Long id);
	List<Avion> getAllAvions();
	List<Avion> findByNomAvion(String nom);
	List<Avion> findByNomAvionContains(String nom);
	List<Avion> findByNomCapacite (String nom, Long capacite);
	List<Avion> findByDestination (Destination destination);
	List<Avion> findByDestinationIdDest(Long idDestination);
	List<Avion> findByOrderByNomAvionAsc();
	List<Avion> trierAvionsNomsCapacite();



}
>>>>>>> 5ac019e9f3e38adb64c6212ca89703128a2443c6
