package pl.fraktal.scene.game;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import pl.fraktal.model.World;

public class Game {
    @FXML
    private AnchorPane gameAnchorPane;

    public Game() {
        new World();
    }
}
