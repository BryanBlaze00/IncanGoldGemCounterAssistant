package com.example.incangoldcounter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GemCounter extends Application {
    GridPane root;
    Player player;
    @Override
    public void start(Stage stage) {
        root = new GridPane();

        


        Scene scene = new Scene(root , 500 , 800);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}