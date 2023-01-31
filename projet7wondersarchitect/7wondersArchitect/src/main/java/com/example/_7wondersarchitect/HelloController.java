package com.example._7wondersarchitect;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloController {

    @FXML

    public void onHelloButtonClick(ActionEvent event) {
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
            Scene scene1 = new Scene(fxmlLoader1.load(), 1004, 502);
            stage.setTitle("7WONDERS");
            stage.setScene(scene1);
            stage.show();
            ((Node) (event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}