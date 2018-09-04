package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Fx10Checkbox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        CheckBox checkBox = new CheckBox("OOP");
       // checkBox.setSelected(true);

        Text text = new Text();

        if (checkBox.isSelected())
            text.setText("SELECTED");
        else
            text.setText("NOT SELECTED");

        FlowPane flowPane = new FlowPane(20, 20);
        flowPane.getChildren().add(checkBox);
        flowPane.getChildren().add(text);

        primaryStage.setScene(new Scene(flowPane, 500, 250));
        primaryStage.show();
    }
}
