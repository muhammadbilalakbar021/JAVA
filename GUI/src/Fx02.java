package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fx02 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Login Form");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);  // wrt. to stage ... or container.
        grid.setHgap(20);
        grid.setVgap(20);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 0);

        TextField userTextField = new TextField();

        grid.add(userTextField, 1, 0);
        grid.setGridLinesVisible(true);

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
