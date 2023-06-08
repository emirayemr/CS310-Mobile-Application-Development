package com.project.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.model.Planet;

public interface PlanetRepository extends MongoRepository<Planet, String> {
	// public Planet findByName(String name);
}