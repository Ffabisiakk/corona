package pl.fraktal.model;

import java.util.List;

public class Country {
    private String name;
    private Population population;
    private List<Communication> communications;

    public Country(String name, Population population, List<Communication> communications) {
        this.name = name;
        this.population = population;
        this.communications = communications;
    }
}
