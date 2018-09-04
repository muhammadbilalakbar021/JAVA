package com.bitspedia.guiwithfx.fxbasics;

/**
 * Created by SYSTEM on 12/27/2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.time.LocalDate;

public class Fx16DatePicker extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("DatePicker Experiment 1");

        DatePicker datePicker = new DatePicker();
       // datePicker.setValue(LocalDate.now());

        Button button = new Button("Read Date");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LocalDate value = datePicker.getValue();
                System.out.println(value);
            }
        });

        HBox hbox = new HBox(datePicker);
        hbox.getChildren().add(button);

        Scene scene = new Scene(hbox, 300, 240);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}


