package com.example.a2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.Objects;

public class next {

    @FXML
    void gotohome(MouseEvent event) throws IOException {
        switchpg sw = new switchpg();

        Parent root = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("hello-view.fxml")));
        sw.switch_scene(root,event);
    }

}
