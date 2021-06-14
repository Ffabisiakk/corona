package pl.fraktal;

import pl.fraktal.model.CommunicationType;
import pl.fraktal.scene.difficulty.DifficultyLevel;

public final class Configuration {
    private static DifficultyLevel difficultyLevel;

    private static volatile Configuration instance;

    private Configuration() {
    }

    public static Configuration getInstance() {
        Configuration result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Configuration.class) {
            if (instance == null) {
                instance = new Configuration();
            }
            return instance;
        }
    }

    public static void setDifficulty(DifficultyLevel difficultyLevel) {
        Configuration.difficultyLevel = difficultyLevel;
    }

    public double getFrequency(CommunicationType type) {
        return switch (type) {
            case CAR -> 0.5;
            case PLANE -> 0.1;
            case SHIP -> 0.15;
            case TRAIN -> 0.25;
        };
    }

    public double getInfectedRatio(CommunicationType type) {
        double result = switch (type) {
            case CAR -> 0.01;
            case PLANE, TRAIN -> 0.3;
            case SHIP -> 0.2;
        };
        result = switch (difficultyLevel) {
            case EASY -> result * 1;
            case MEDIUM -> result * 1.25;
            case HARD -> result * 1.5;
            case HELL -> result * 2;
        };
        return result;
    }
}
