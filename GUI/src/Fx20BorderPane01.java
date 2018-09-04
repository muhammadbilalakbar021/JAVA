package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Fx20BorderPane01 extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();

        borderPane.setTop(new Label("Top"));
        borderPane.setBottom(new Label("Bottom"));
        borderPane.setLeft(new Label("Left"));
        borderPane.setRight(new Label("Right"));
        borderPane.setCenter(new Label("Center"));

        Scene scene = new Scene(borderPane, 350, 300);

        stage.setTitle("BorderPane");
        stage.setScene(scene);
        stage.show();
    }
}