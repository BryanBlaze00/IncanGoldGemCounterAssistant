package com.example.incangoldcounter;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Player {
    private Label totalGems;
    private Label totalArtifact;
    private Label roundGems;
    private TextField nameText;
    private Button btnAdd1gem;
    private Button btnAdd5gems;
    private Button btnArtifact;
    private Button btnBust;

    public Player( ) {
        this.totalGems = new Label("0");
        this.totalGems = new Label("0");
        this.roundGems = new Label("0");
    }


}
