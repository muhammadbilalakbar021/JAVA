package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Fx13ComboBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        ComboBox comboBox = new ComboBox();
        comboBox.getItems().add("Lahore");
        comboBox.getItems().add("Islamabad");
        comboBox.getItems().add("Karachi");
        comboBox.getItems().add("Multan");

        FlowPane flowPane = new FlowPane(20, 20);
        flowPane.getChildren().add(comboBox);

        primaryStage.setScene(new Scene(flowPane, 500, 250));
        primaryStage.show();
    }
}
