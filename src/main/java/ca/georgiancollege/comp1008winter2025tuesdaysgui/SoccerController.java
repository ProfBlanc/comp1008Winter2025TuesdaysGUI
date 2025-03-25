package ca.georgiancollege.comp1008winter2025tuesdaysgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class SoccerController {

    @FXML
    private Circle ball;

    @FXML
    private Rectangle field;

    @FXML
    private Label info;

    @FXML
    void initialize(){
        ball.setVisible(false);
        info.setVisible(false);
    }

    @FXML
    void playingGame(MouseEvent event) {
        ball.setVisible(true);
        info.setVisible(true);

        int x = (int)event.getSceneX();
        int y = (int)event.getSceneY();

        info.setText(x + ", " + y);

        ball.setLayoutX(x);
        ball.setLayoutY(y);

    }

}
