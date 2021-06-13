package pl.fraktal.scene.menu;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import pl.fraktal.util.SceneLocation;

import java.io.File;
import java.io.IOException;

public class MainMenu {

    private final FXMLLoader loader = new FXMLLoader();

    @FXML
    private AnchorPane menuAnchorPane;

    @FXML
    private void chooseDifficulty() {
        Stage stage = (Stage) menuAnchorPane.getScene().getWindow();
        stage.close();
        try {
            loader.setLocation(new File(SceneLocation.DIFFICULTY.location).toURI().toURL());
            Parent root = loader.load();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException ioe) {
            System.out.println("ERROR: " + ioe.getMessage());
        }
    }

    @FXML
    private void highScore() {
        Stage stage = (Stage) menuAnchorPane.getScene().getWindow();
        stage.close();
        try {
            loader.setLocation(new File(SceneLocation.HIGH_SCORE.location).toURI().toURL());
            Parent root = loader.load();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException ioe) {
            System.out.println("ERROR: " + ioe.getMessage());
        }
    }

    @FXML
    private void exit() {
        Stage stage = (Stage) menuAnchorPane.getScene().getWindow();
        stage.close();
    }
}
