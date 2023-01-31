package com.example._7wondersarchitect;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class PlayersController {
    @FXML
    private ChoiceBox<String> Wonder1, Wonder2, Wonder3, Wonder4, Wonder5, Wonder6, Wonder7;

    @FXML
    private TextField Name1, Name2, Name3, Name4, Name5, Name6, Name7;

    @FXML
    private Label CanLaunch;
    public static String[] Names;
    public static String[] Wonders;

    public void initialize() {
        if (MenuController.nbPlayers == 2) {
            Name3.setDisable(true);
            Name4.setDisable(true);
            Name5.setDisable(true);
            Name6.setDisable(true);
            Name7.setDisable(true);
            Wonder3.setDisable(true);
            Wonder4.setDisable(true);
            Wonder5.setDisable(true);
            Wonder6.setDisable(true);
            Wonder7.setDisable(true);
        } else if (MenuController.nbPlayers == 3) {
            Name4.setDisable(true);
            Name5.setDisable(true);
            Name6.setDisable(true);
            Name7.setDisable(true);
            Wonder4.setDisable(true);
            Wonder5.setDisable(true);
            Wonder6.setDisable(true);
            Wonder7.setDisable(true);
        } else if (MenuController.nbPlayers == 4) {
            Name5.setDisable(true);
            Name6.setDisable(true);
            Name7.setDisable(true);
            Wonder5.setDisable(true);
            Wonder6.setDisable(true);
            Wonder7.setDisable(true);
        } else if (MenuController.nbPlayers == 5) {
            Name6.setDisable(true);
            Name7.setDisable(true);
            Wonder6.setDisable(true);
            Wonder7.setDisable(true);
        } else if (MenuController.nbPlayers == 6) {
            Name7.setDisable(true);
            Wonder7.setDisable(true);
        }
        Wonder1.getItems().addAll("alexandrie", "babylon", "ephese", "giseh", "halicarnasse", "olympe", "rhodes");
        Wonder2.getItems().addAll("alexandrie", "babylon", "ephese", "giseh", "halicarnasse", "olympe", "rhodes");
        Wonder3.getItems().addAll("alexandrie", "babylon", "ephese", "giseh", "halicarnasse", "olympe", "rhodes");
        Wonder4.getItems().addAll("alexandrie", "babylon", "ephese", "giseh", "halicarnasse", "olympe", "rhodes");
        Wonder5.getItems().addAll("alexandrie", "babylon", "ephese", "giseh", "halicarnasse", "olympe", "rhodes");
        Wonder6.getItems().addAll("alexandrie", "babylon", "ephese", "giseh", "halicarnasse", "olympe", "rhodes");
        Wonder7.getItems().addAll("alexandrie", "babylon", "ephese", "giseh", "halicarnasse", "olympe", "rhodes");

    }

    @FXML
    void StartClicked(ActionEvent event) {
        Wonders = new String[]{Wonder1.getValue(), Wonder2.getValue(), Wonder3.getValue(), Wonder4.getValue(), Wonder5.getValue(), Wonder6.getValue(), Wonder7.getValue()};
        Names = new String[]{Name1.getText(), Name2.getText(), Name3.getText(), Name4.getText(), Name5.getText(), Name6.getText(), Name7.getText()};

        int nbWonder = 0;
        int nbName = 0;
        for (int i = 0; i < MenuController.nbPlayers; i++) {
            if (Wonders[i] != null) {
                nbWonder = nbWonder + 1;
            }
        }

        if (nbWonder == MenuController.nbPlayers) {
            for (int i = 0; i < MenuController.nbPlayers; i++) {
                if (Names[i].isEmpty() == false) {
                    nbName = nbName + 1;
                }
            }
            if (nbName == MenuController.nbPlayers) {
                try {
                    Stage stage = new Stage();
                    FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("Game.fxml"));
                    Scene scene1 = new Scene(fxmlLoader1.load(), 1004, 502);
                    stage.setTitle("7WONDERS");
                    stage.setScene(scene1);
                    stage.show();
                    ((Node) (event.getSource())).getScene().getWindow().hide();

                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                CanLaunch.setText("Vous devez rentrer un nom pour chaque joueur");
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        CanLaunch.setVisible(false);
                    }
                }, 1500);
                CanLaunch.setVisible(true);
            }
        } else {
            CanLaunch.setText("Vous n'avez pas choisi de marveille pour tous les joueurs");
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    CanLaunch.setVisible(false);
                }
            }, 1500);
            CanLaunch.setVisible(true);
        }

    }
}
