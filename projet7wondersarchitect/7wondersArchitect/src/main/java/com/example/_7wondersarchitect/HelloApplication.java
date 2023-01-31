package com.example._7wondersarchitect;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

// Projet Réalisé par Sujinthran PARAMESWARAN, Djamil ILLA ADO et Lucas SAYAG


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader0 = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene0 = new Scene(fxmlLoader0.load(), 1004, 502);
        stage.setTitle("7WONDERS");
        stage.setScene(scene0);
        stage.show();

    }

}