package com.example.demo2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Exmaple extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Hello World!");
        StackPane root = new StackPane();
        root.getChildren().add(label);
        Scene scene = new Scene(root,250,50);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }
}
