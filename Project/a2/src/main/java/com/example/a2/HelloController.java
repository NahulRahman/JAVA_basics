package com.example.a2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.Objects;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    void onHelloButtonClick(ActionEvent event) throws IOException {
        switchpg sw = new switchpg();

        Parent root = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("next.fxml")));
        sw.switch_scene(root,event);
    }

}
