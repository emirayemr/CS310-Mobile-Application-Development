package com.project.model;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Planet {
	@Id private String id;
	
	private String name;
	private double radius;
	private double temp;
	private int period;
	private double disToEarth;
	private double mass;
	private String des;
	
	public Planet() {
		
	}
	
	public Planet(String name, double radius, double temp, int period, double disToEarth, double mass, String des) {
		super();
		this.name = name;
		this.radius = radius;
		this.temp = temp;
		this.period = period;
		this.disToEarth = disToEarth;
		this.mass = mass;
		this.des = des;
	}
	
	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", radius=" + radius + ", avg. temperature=" + temp + ", period=" + period + ",distance To Earth=" + disToEarth +", mass="+mass + " ,Planet description="+des+"]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public double getDisToEarth() {
		return disToEarth;
	}

	public void setDisToEarth(double disToEarth) {
		this.disToEarth = disToEarth;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
	
	
}
