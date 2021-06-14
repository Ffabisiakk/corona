package pl.fraktal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.fraktal.model.World;
import pl.fraktal.util.SceneLocation;

import java.io.File;
import java.io.IOException;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        showMenu(stage);
    }

    private void showMenu(Stage stage) {
        FXMLLoader loader = new FXMLLoader();
        try {
            loader.setLocation(new File(SceneLocation.MAIN_MENU.location).toURI().toURL());
            Parent root = loader.load();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("ERROR: " + ioe.getMessage());
        }

    }

}
