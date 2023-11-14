package com.sarra.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import com.sarra.demo.entities.Avion;
import com.sarra.demo.entities.Vol;
import com.sarra.demo.repos.AvionRepository;
@SpringBootTest
class AvionsApplicationTests {
	@Autowired
	private AvionRepository avionRepository;
	

	@Test
	public void testCreateAvion() {
		Avion av = new Avion("Atlas", 500L, "Nouvelair");
		avionRepository.save(av);
		}
	
	@Test
	public void testFindAvion()
	{
	Avion a = avionRepository.findById(3L).get();
	System.out.println(a);
	}

	
	
	@Test
	public void testUpdateAvion()
	{
	Avion a = avionRepository.findById(3L).get();
	a.setCapacite(800L);
	avionRepository.save(a);
	}
	
	
	
	
	@Test
	public void testDeleteAvion()
	{
	avionRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousAvions()
	{
	List<Avion> avs = avionRepository.findAll();
	for (Avion a : avs)
	{
	System.out.println(a);
	}
}
	
	@Test
	public void testFindByNomAvion()
	{
	List<Avion> av = avionRepository.findByNomAvion("Atlas");
	for (Avion a : av)
	{
	System.out.println(a);
	}
	}
	
	
	@Test
	public void testFindByNomAvionContains ()
	{
	List<Avion> av=avionRepository.findByNomAvionContains("Atlas");
	for (Avion a : av)
	{
	System.out.println(a);
	} }
	
	@Test
	public void testfindByNomCapacite()
	{
	List<Avion> av = avionRepository.findByNomCapacite("Atlas", 800L);
	for (Avion a : av)
	{
	System.out.println(a);
	}
	}
	
	@Test
	public void testfindByVol()
	{
		Vol v = new Vol();
	v.setIdV(3L);
	List<Avion> av = avionRepository.findByVol(v);
	for (Avion a : av)
	{
	System.out.println(a);
	}
	}
	
	
	@Test
	public void findByVolIdV()
	{
	List<Avion> av = avionRepository.findByVolIdV(1L);
	for (Avion a : av)
	{
	System.out.println(a);
	}
	 }
	
	@Test
	public void testfindByOrderByNomAvionAsc()
	{
	List<Avion> av =avionRepository.findByOrderByNomAvionAsc();
	for (Avion a : av)
	{
	System.out.println(a);
	}
	}
	
	
	
	@Test
	public void testTrierAvionsNomsCapacite()
	{
	List<Avion> av = avionRepository.trierAvionsNomsCapacite();
	for (Avion a : av)
	{
	System.out.println(a);
	}
	}

	

}
