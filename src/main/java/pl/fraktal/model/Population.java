package pl.fraktal.model;

import java.math.BigInteger;

public class Population {
    private BigInteger total;
    private BigInteger neverInfected;
    private BigInteger infected;
    private BigInteger cured;
    private BigInteger died;

    public Population(BigInteger total) {
        this.total = total;
        neverInfected = total;
        infected = new BigInteger("0");
        cured = new BigInteger("0");
        died = new BigInteger("0");
    }

    private void cure(BigInteger amount) {
        cured = cured.add(amount);
        infected = infected.subtract(amount);
    }

    private void infect(BigInteger amount) {
        infected = infected.add(amount);
        neverInfected = neverInfected.subtract(amount);
    }

    private void die(BigInteger amount) {
        total = total.subtract(amount);
        died = died.subtract(amount);
    }

    private void born(BigInteger amount) {
        total = total.add(amount);
    }
}
