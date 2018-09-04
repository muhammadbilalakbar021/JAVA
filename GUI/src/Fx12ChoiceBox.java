package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Fx12ChoiceBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.getItems().add("Lahore");
        choiceBox.getItems().add("Islamabad");
        choiceBox.getItems().add("Karachi");
        choiceBox.getItems().add("Multan");

        FlowPane flowPane = new FlowPane(20, 20);
        flowPane.getChildren().add(choiceBox);

        primaryStage.setScene(new Scene(flowPane, 500, 250));
        primaryStage.show();
    }
}
