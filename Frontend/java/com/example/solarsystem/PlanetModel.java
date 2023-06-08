package com.example.solarsystem;

public class PlanetModel {
    String planetName;
    int image;
    String radius;
    String temp;
    String period;
    String mass;


    public PlanetModel(String planetName, int image) {
        this.planetName = planetName;
        this.image = image;
    }

    public PlanetModel(String planetName, int image, String radius, String temp, String period, String mass) {
        this.planetName = planetName;
        this.image = image;
        this.radius = radius;
        this.temp = temp;
        this.period = period;
        this.mass = mass;
    }

    public String getPlanetName() {
        return planetName;
    }

    public int getImage() {
        return image;
    }

    public String getRadius() {
        return radius;
    }

    public String getTemp() {
        return temp;
    }

    public String getPeriod() {
        return period;
    }

    public String getMass() {
        return mass;
    }
}
