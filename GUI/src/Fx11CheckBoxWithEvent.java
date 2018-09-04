package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Fx11CheckBoxWithEvent extends Application {

    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");

        checkBox1 = new CheckBox("OOP");
        checkBox2 = new CheckBox("DB");
        checkBox3 = new CheckBox("Web");
        checkBox4 = new CheckBox("Android");

        FlowPane flowPane = new FlowPane(20, 20);

        flowPane.getChildren().add(checkBox1);
        flowPane.getChildren().add(checkBox2);
        flowPane.getChildren().add(checkBox3);
        flowPane.getChildren().add(checkBox4);

        Text text = new Text();
        Button btn = new Button(" Click Here ");

        flowPane.getChildren().add(btn);
        flowPane.getChildren().add(text);

        checkBox1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (checkBox1.isSelected())
                    text.setText("OOP");
                else text.setText("");
            }
        });

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (checkBox2.isSelected())
                    text.setText("DB");
                else text.setText("");
            }
        });

        primaryStage.setScene(new Scene(flowPane, 500, 250));
        primaryStage.show();
    }
}
