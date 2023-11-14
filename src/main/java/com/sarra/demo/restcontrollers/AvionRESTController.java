<<<<<<< HEAD
package com.sarra.demo.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sarra.demo.entities.Avion;
import com.sarra.demo.service.AvionService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AvionRESTController {
	@Autowired
	AvionService avionService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Avion> getAllAvions() {
	return avionService.getAllAvions();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Avion getAvionById(@PathVariable("id") Long id) {
	return avionService.getAvion(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Avion createAvion(@RequestBody Avion avion) {
	return avionService.saveAvion(avion);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Avion updateAvion(@RequestBody Avion avion) {
	return avionService.updateAvion(avion);
	}

	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteAvion(@PathVariable("id") Long id)
	{
		avionService.deleteAvionById(id);
	}

	@RequestMapping(value="/avv/{idV}",method = RequestMethod.GET)
	public List<Avion> getAvionsByVId(@PathVariable("idV") Long idV) {
		return avionService.findByVolIdV(idV);
	}
	
	@RequestMapping(value="/avsByName/{nom}",method = RequestMethod.GET)
	public List<Avion> findByNomAvionContains(@PathVariable("nom") String nom) {
	return avionService.findByNomAvionContains(nom);
	}

}
=======
package com.sarra.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sarra.demo.entities.Avion;
import com.sarra.demo.service.AvionService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AvionRESTController {
	
	@Autowired 
	AvionService avionService;
	
	@RequestMapping(method=RequestMethod.GET)
	List<Avion> getAllAvions()
	{
		return avionService.getAllAvions();
		
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Avion getAvionById(@PathVariable("id") Long id) {
	return avionService.getAvion(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Avion createAvion(@RequestBody Avion avion) {
	return avionService.saveAvion(avion);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Avion updateAvion(@RequestBody Avion avion) {
	return avionService.updateAvion(avion);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteAvion(@PathVariable("id") Long id)
	{
	avionService.deleteAvionById(id);
	}
	
	@RequestMapping(value="/avsdest/{idDest}",method = RequestMethod.GET)
	public List<Avion> getAvionsByCatId(@PathVariable("idDest") Long idDest) {
	return avionService.findByDestinationIdDest(idDest);
	}

}
>>>>>>> 5ac019e9f3e38adb64c6212ca89703128a2443c6
