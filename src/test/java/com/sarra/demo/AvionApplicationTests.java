package com.sarra.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sarra.demo.entities.Avion;
import com.sarra.demo.entities.Destination;
import com.sarra.demo.repos.AvionRepository;

@SpringBootTest
class AvionApplicationTests {

	@Autowired
	private AvionRepository avionRepository;
	@Test
	public void testCreateAvion() {
	Avion av = new Avion("Atlas ",900L,"Nouvelair");
	avionRepository.save(av);
	}
	
	@Test
	public void testFindAvion()
	{
	Avion a = avionRepository.findById(1L).get();
	System.out.println(a);
	}

	@Test
	public void testUpdateAvion()
	{
	Avion a = avionRepository.findById(3L).get();
	a.setCapacite(1200L);
	a.setNomAvion("Pilatus");
	a.setCompagnie("Nouvelair");
	avionRepository.save(a);
	}
	
	@Test
	public void testDeleteAvion()
	{
	avionRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousAvion()
	{
	List<Avion> avs = avionRepository.findAll();
	for (Avion a : avs)
	{
	System.out.println(a);
	}
	}
	
	@Test
	public void testFindAvionByNom()
	{
	List<Avion> avs = avionRepository.findByNomAvion("Atlas");
	for (Avion a : avs)
	{
	System.out.println(a);
	}
	
	}
	
	@Test
	public void testFindAvionByNomContains()
	{
	List<Avion> avs = avionRepository.findByNomAvionContains("A");
	for (Avion a : avs)
	{
	System.out.println(a);
	}
	
	}
	
	@Test
	public void testfindByNomCapacite()
	{
	List<Avion> avs = avionRepository.findByNomCapacite("Atlas", 850L);
		for (Avion a : avs)
			{
				System.out.println(a);
			}
	
	}
	
	@Test
	public void testfindByDestination()
	{
	Destination dest = new Destination();
	dest.setIdDestination(1L);
	List<Avion> avs = avionRepository.findByDestination(dest);
	for (Avion a : avs)
	{
	System.out.println(a);
	}
	}
	
	@Test
	public void findByDestinationIdDestination()
	{
	List<Avion> avs = avionRepository.findByDestinationIdDestination(1L);
	for (Avion a : avs)
	{
	System.out.println(a);
	}
	}
	
	
	@Test
	public void testfindByOrderByNomAvionAsc()
	{
	List<Avion> avs =
	avionRepository.findByOrderByNomAvionAsc();
		for (Avion a : avs)
			{
				System.out.println(a);
			}
	}
	
	@Test
	public void testTrierAvionsNomsCapacite()
	{
		List<Avion> avs =avionRepository.trierAvionsNomsCapacite();
					for (Avion a : avs)
			{
				System.out.println(a);
			}
	}
	
	
	}
	
	
	
	
	

