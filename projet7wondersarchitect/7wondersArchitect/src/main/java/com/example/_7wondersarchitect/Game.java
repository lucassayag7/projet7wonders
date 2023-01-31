package com.example._7wondersarchitect;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class Game implements Initializable {

    @FXML
    public Label Player1Name, Player2Name, Player3Name, Player4Name, Player5Name, Player6Name, Player7Name;

    @FXML
    public Label Player1Wonder, Player2Wonder, Player3Wonder, Player4Wonder, Player5Wonder, Player6Wonder, Player7Wonder;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Player1Name.setText(PlayersController.Names[0]);
        Player2Name.setText(PlayersController.Names[1]);
        Player3Name.setText(PlayersController.Names[2]);
        Player4Name.setText(PlayersController.Names[3]);
        Player5Name.setText(PlayersController.Names[4]);
        Player6Name.setText(PlayersController.Names[5]);
        Player7Name.setText(PlayersController.Names[6]);
        Player1Wonder.setText(PlayersController.Wonders[0]);
        Player2Wonder.setText(PlayersController.Wonders[1]);
        Player3Wonder.setText(PlayersController.Wonders[2]);
        Player4Wonder.setText(PlayersController.Wonders[3]);
        Player5Wonder.setText(PlayersController.Wonders[4]);
        Player6Wonder.setText(PlayersController.Wonders[5]);
        Player7Wonder.setText(PlayersController.Wonders[6]);

    }
}
