package pl.fraktal.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Country> countries;

    public World() {
        countries = new ArrayList<>() {{
            new Country("Russia", new Population(new BigInteger("145934462")), Communication.island());
            new Country("Germany", new Population(new BigInteger("83783942")), Communication.inland());
            new Country("United Kingdom", new Population(new BigInteger("67886011")), Communication.inland());
            new Country("France", new Population(new BigInteger("65273511")), Communication.inland());
            new Country("Italy", new Population(new BigInteger("60461826")), Communication.inland());
            new Country("Spain", new Population(new BigInteger("46754778")), Communication.inland());
            new Country("Ukraine", new Population(new BigInteger("43733762")), Communication.inland());
            new Country("Poland", new Population(new BigInteger("37846611")), Communication.inland());
            new Country("Romania", new Population(new BigInteger("19237691")), Communication.inland());
            new Country("Netherlands", new Population(new BigInteger("17134872")), Communication.inland());
        }};
    }
}
