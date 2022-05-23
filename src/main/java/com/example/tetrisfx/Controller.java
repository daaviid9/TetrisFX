package com.example.tetrisfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
//nigerr
public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("TetrisFX");
    }
}