package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Fx07RadioButtonGroup extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

//        RadioButton[] radioButtons = new RadioButton[5];
//        for(RadioButton rb: radioButtons){
//            rb.setText("");
//        }

        RadioButton radioButton1 = new RadioButton("OOP");
        RadioButton radioButton2 = new RadioButton("DB");
        RadioButton radioButton3 = new RadioButton("Web");
        RadioButton radioButton4 = new RadioButton("Android");

        ToggleGroup radioGroup = new ToggleGroup();

        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
        radioButton3.setToggleGroup(radioGroup);
        radioButton4.setToggleGroup(radioGroup);

        FlowPane flowPane = new FlowPane();

        flowPane.getChildren().add(radioButton1);
        flowPane.getChildren().add(radioButton2);
        flowPane.getChildren().add(radioButton3);
        flowPane.getChildren().add(radioButton4);

        primaryStage.setScene(new Scene(flowPane, 500, 250));
        primaryStage.show();
    }
}
