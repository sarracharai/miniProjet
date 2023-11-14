<<<<<<< HEAD
package com.sarra.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sarra.demo.entities.Avion;
import com.sarra.demo.entities.Vol;

@RepositoryRestResource(path = "rest")
public interface AvionRepository  extends JpaRepository<Avion, Long>{
	
	 List<Avion> findByNomAvion(String nom);
	 List<Avion> findByNomAvionContains(String nom); 
	 
	 //@Query("select a from Avion a where a.nomAvion like %?1 and a.capacite > ?2")
	// List<Avion> findByNomCapacite (String nom, long l);

	 @Query("select a from Avion a where a.nomAvion like %:nom and a.capacite > :capacite")
	 List<Avion> findByNomCapacite (@Param("nom") String nom,@Param("capacite") long capacite);
	 
	 
	 @Query("select a from Avion a where a.vol = ?1")
	 List<Avion> findByVol (Vol vol);
	 
	 List<Avion> findByVolIdV(Long id);
	 
	 List<Avion> findByOrderByNomAvionAsc();
	 
	 
	 @Query("select a from Avion a order by a.nomAvion ASC, a.capacite DESC")
	 List<Avion> trierAvionsNomsCapacite ();
}
=======
package com.sarra.demo.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sarra.demo.entities.Avion;
import com.sarra.demo.entities.Destination;

@RepositoryRestResource(path = "rest")
public interface AvionRepository extends JpaRepository<Avion, Long> {
	
	List<Avion> findByNomAvion(String nom);
	List<Avion> findByNomAvionContains(String nom);
	
	/*@Query("select a from Avion a where a.nomAvion like %?1 and a.capacite > ?2")
	List<Avion> findByNomCapacite (String nom, Long capacite); */
	
	@Query("select a from Avion a where a.nomAvion like %:nom and a.capacite > :capacite")
	List<Avion> findByNomCapacite (@Param("nom") String nom,@Param("capacite") Long capacite);

	@Query("select a from Avion a where a.destination = ?1")
	List<Avion> findByDestination (Destination destination);
	
	List<Avion> findByDestinationIdDestination(Long idDest);
	
	List<Avion> findByOrderByNomAvionAsc();
	
	@Query("select a from Avion a order by a.nomAvion ASC, a.capacite DESC")
	List<Avion> trierAvionsNomsCapacite ();
}
>>>>>>> 5ac019e9f3e38adb64c6212ca89703128a2443c6
