package pl.fraktal.scene.difficulty;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import pl.fraktal.Configuration;
import pl.fraktal.util.SceneLocation;

import java.io.File;
import java.io.IOException;

public class Difficulty {
    private final FXMLLoader loader = new FXMLLoader();

    @FXML
    private AnchorPane difficultyAnchorPane;

    @FXML
    private void newGame(ActionEvent event) {
        final Button source = (Button) event.getSource();

        switch (source.getId()) {
            case "easy" -> Configuration.setDifficulty(DifficultyLevel.EASY);
            case "medium" -> Configuration.setDifficulty(DifficultyLevel.MEDIUM);
            case "hard" -> Configuration.setDifficulty(DifficultyLevel.HARD);
            case "hell" -> Configuration.setDifficulty(DifficultyLevel.HELL);
        }

        Stage stage = (Stage) difficultyAnchorPane.getScene().getWindow();
        stage.close();
        try {
            loader.setLocation(new File(SceneLocation.GAME.location).toURI().toURL());
            Parent root = loader.load();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException ioe) {
            System.out.println("ERROR: " + ioe.getMessage());
            ioe.printStackTrace();
        }
    }

}
