package com.project.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.model.Planet;
import com.project.repo.PlanetRepository;

@RestController
@RequestMapping("/solarsystem")
public class BackendOurSolarSystemController {
	
	@Autowired private PlanetRepository planetRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(BackendOurSolarSystemController.class);
	List<Planet> planets;
	@PostConstruct
	public void init() {
		if (planetRepository.count() == 0) {
			logger.info("Database is empty, initializing...");
			
			Planet p1 = new Planet("Mercury", 0.0341,400,88,0.000011,0.000174,"Mercury is the smallest planet in the Solar System and the closest to the Sun.");
			Planet p2 = new Planet("Venus", 0.0847,737,224,0.000004,0.00257,"Venus is the second planet from the Sun and the hottest planet in the Solar System.");
			Planet p3 = new Planet("Earth", 0.0892,288,365,0,0.00315,"Earth is the third planet from the Sun and the only known planet to support life.");
			Planet p4 = new Planet("Mars", 0.0488,210,687,0.000037,0.000338,"Mars is the fourth planet from the Sun and the second-smallest planet in the Solar System.");
			Planet p5 = new Planet("Jupiter",1,165,4331,0.000088,1,"Jupiter is the fifth planet from the Sun and the largest planet in the Solar System.");
			Planet p6 = new Planet("Saturn",0.843,134,10747,0.00017,0.299,"Saturn is the sixth planet from the Sun and the second-largest planet in the Solar System, after Jupiter.");
			Planet p7 = new Planet("Uranus",0.358,76,30589,0.000304,0.0457,"Uranus is the seventh planet from the Sun. It has the third-largest planetary radius and fourth-largest planetary mass in the Solar System.");
			Planet p8 = new Planet("Neptune",0.346,72,59800,0.000478,0.0537,"Neptune is the eighth and farthest known planet from the Sun in the Solar System.");		
			
			planetRepository.save(p1);
			planetRepository.save(p2);
			planetRepository.save(p3);
			planetRepository.save(p4);
			planetRepository.save(p5);
			planetRepository.save(p6);
			planetRepository.save(p7);
			planetRepository.save(p8);
			
			planets = planetRepository.findAll();
			
			logger.info("All sample data saved!");
		}
	}
	
	@GetMapping("/planets")
	public List<Planet> planets() {
		return planets;
	}
	
	@PostMapping("/planets/save")
	public Planet savePlanet(@RequestBody Planet planet) {
		Planet plaSaved = planetRepository.save(planet);
		return plaSaved;
	}
}
