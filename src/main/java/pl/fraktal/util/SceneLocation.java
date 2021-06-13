package pl.fraktal.util;

public enum SceneLocation {
    GAME("src/main/java/pl/fraktal/scene/game/game.fxml"),
    HIGH_SCORE("src/main/java/pl/fraktal/scene/score/high_score.fxml"),
    MAIN_MENU("src/main/java/pl/fraktal/scene/menu/menu.fxml"),
    DIFFICULTY("src/main/java/pl/fraktal/scene/difficulty/difficulty.fxml");

    public final String location;

    SceneLocation(String location) {
        this.location = location;
    }
}
