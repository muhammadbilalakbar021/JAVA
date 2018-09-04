package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Fx08RadioButtonGroupWithEvent extends Application {

    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        radioButton1 = new RadioButton("OOP");
        radioButton2 = new RadioButton("DB");
        radioButton3 = new RadioButton("Web");
        radioButton4 = new RadioButton("Android");

        ToggleGroup radioGroup = new ToggleGroup();

        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
        radioButton3.setToggleGroup(radioGroup);
        radioButton4.setToggleGroup(radioGroup);

        FlowPane flowPane = new FlowPane(20, 20);

        flowPane.getChildren().add(radioButton1);
        flowPane.getChildren().add(radioButton2);
        flowPane.getChildren().add(radioButton3);
        flowPane.getChildren().add(radioButton4);

        Text text = new Text();
        Button btn = new Button(" Click Here ");

        flowPane.getChildren().add(btn);
        flowPane.getChildren().add(text);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (radioButton1.isSelected())
                    text.setText("OOP");
                else if (radioButton2.isSelected())
                    text.setText("DB");
                else if (radioButton3.isSelected())
                    text.setText("Web");
                else if (radioButton4.isSelected())
                    text.setText("Android");
            }
        });

        primaryStage.setScene(new Scene(flowPane, 500, 250));
        primaryStage.show();
    }
}
