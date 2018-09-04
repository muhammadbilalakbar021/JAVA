package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Fx15ListView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        ListView listView = new ListView();
        listView.getItems().add("BSCS");
        listView.getItems().add("MSCS");
        listView.getItems().add("PhD. CS");

        FlowPane flowPane = new FlowPane(20, 20);
        flowPane.getChildren().add(listView);

        primaryStage.setScene(new Scene(flowPane, 500, 250));
        primaryStage.show();
    }
}
