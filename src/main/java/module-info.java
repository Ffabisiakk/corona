module pl.fraktal {
    requires javafx.controls;
    requires javafx.fxml;
    opens pl.fraktal;
    exports pl.fraktal.scene.difficulty;
    exports pl.fraktal.scene.game;
    exports pl.fraktal.scene.menu;
    exports pl.fraktal.scene.score;
    exports pl.fraktal.util;
    opens pl.fraktal.scene.difficulty;
    opens pl.fraktal.scene.game;
    opens pl.fraktal.scene.menu;
    opens pl.fraktal.scene.score;
    opens pl.fraktal.util;
    opens pl.fraktal.model;
}
