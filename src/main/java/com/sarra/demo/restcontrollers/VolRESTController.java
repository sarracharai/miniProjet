package com.sarra.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sarra.demo.entities.Vol;
import com.sarra.demo.repos.VolRepository;

@RestController
@RequestMapping("/api/v")
@CrossOrigin("*")
public class VolRESTController {
	
	@Autowired
	VolRepository volRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Vol> getAllVols()
	{
		return volRepository.findAll();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Vol getVolById(@PathVariable("id") Long id) {
		return volRepository.findById(id).get();
	}
	
	
	
	

}
