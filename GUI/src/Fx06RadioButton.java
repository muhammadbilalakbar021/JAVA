package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Fx06RadioButton extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        RadioButton radioButton = new RadioButton("OOP");
        //radioButton.setSelected(true);
        radioButton.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        radioButton.setSelected(true);

        Text text = new Text();
        text.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        if (radioButton.isSelected())
            text.setText("SELECTED");
        else
            text.setText("NOT SELECTED");

        FlowPane flowPane = new FlowPane(20, 20);
        flowPane.getChildren().add(radioButton);
        flowPane.getChildren().add(text);

        primaryStage.setScene(new Scene(flowPane, 500, 250));
        primaryStage.show();
    }
}
