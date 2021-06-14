package pl.fraktal.model;

import pl.fraktal.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Communication {

    private final CommunicationType type;
    private boolean allowed;
    private double frequency;
    private double infectRatio;

    public void setAllowed(boolean allowed) {
        this.allowed = allowed;
    }

    public boolean isAllowed() {
        return allowed;
    }

    public Communication(CommunicationType type) {
        final Configuration instance = Configuration.getInstance();
        this.type = type;
        this.frequency = instance.getFrequency(type);
        this.infectRatio = instance.getInfectedRatio(type);
    }

    static List<Communication> island() {
        List<Communication> result = new ArrayList<>();
        result.add(new Communication(CommunicationType.PLANE));
        result.add(new Communication(CommunicationType.SHIP));
        return result;
    }

    static List<Communication> inland() {
        List<Communication> result = new ArrayList<>();
        result.add(new Communication(CommunicationType.PLANE));
        result.add(new Communication(CommunicationType.CAR));
        result.add(new Communication(CommunicationType.TRAIN));
        return result;
    }

    static List<Communication> seaside() {
        List<Communication> result = new ArrayList<>();
        result.add(new Communication(CommunicationType.PLANE));
        result.add(new Communication(CommunicationType.SHIP));
        result.add(new Communication(CommunicationType.CAR));
        result.add(new Communication(CommunicationType.TRAIN));
        return result;
    }
    
}
