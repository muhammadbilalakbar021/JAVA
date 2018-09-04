package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Fx01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    // Understand the concept of component and container aka. panes in JavaFX

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        Button btn = new Button();
        btn.setText("Say 'Hello World'");

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(btn);

        Scene scene = new Scene(stackPane, 500, 250);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
