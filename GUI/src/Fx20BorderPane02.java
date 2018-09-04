package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

class MyLabel extends Label {

    public MyLabel(String text) {
        super(text);
        setAlignment(Pos.BASELINE_CENTER);
    }
}

public class Fx20BorderPane02 extends Application {

    private BorderPane borderPane;
    private final int SIZE = 60;

    @Override
    public void start(Stage stage) {
        initUI(stage);
    }

    private void initUI(Stage stage) {
        borderPane = new BorderPane();

        borderPane.setTop(getTopLabel());
        borderPane.setBottom(getBottomLabel());
        borderPane.setLeft(getLeftLabel());
        borderPane.setRight(getRightLabel());
        borderPane.setCenter(getCenterLabel());

        Scene scene = new Scene(borderPane, 350, 300);

        stage.setTitle("BorderPane");
        stage.setScene(scene);
        stage.show();
    }

    private Label getTopLabel() {

        Label lbl = new MyLabel("Top");
        lbl.setPrefHeight(SIZE);
        lbl.prefWidthProperty().bind(borderPane.widthProperty());
        lbl.setStyle("-fx-border-style: dotted; -fx-border-width: 0 0 1 0;"
                + "-fx-border-color: gray; -fx-font-weight: bold");
        return lbl;
    }

    private Label getBottomLabel() {

        Label lbl = new MyLabel("Bottom");
        lbl.setPrefHeight(SIZE);
        lbl.prefWidthProperty().bind(borderPane.widthProperty());
        lbl.setStyle("-fx-border-style: dotted; -fx-border-width: 1 0 0 0;"
                + "-fx-border-color: gray; -fx-font-weight: bold");
        return lbl;
    }

    private Label getLeftLabel() {
        Label lbl = new MyLabel("Left");
        lbl.setPrefWidth(SIZE);
        lbl.prefHeightProperty().bind(borderPane.heightProperty().subtract(2*SIZE));
        lbl.setStyle("-fx-border-style: dotted; -fx-border-width: 0 1 0 0;"
                + "-fx-border-color: gray; -fx-font-weight: bold");
        return lbl;
    }


    private Label getRightLabel() {

        Label lbl = new MyLabel("Right");
        lbl.setPrefWidth(SIZE);
        lbl.prefHeightProperty().bind(borderPane.heightProperty().subtract(2*SIZE));
        lbl.setStyle("-fx-border-style: dotted; -fx-border-width: 0 0 0 1;"
                + "-fx-border-color: gray; -fx-font-weight: bold");

        return lbl;
    }

    private Label getCenterLabel() {

        Label lbl = new MyLabel("Center");
        lbl.setStyle("-fx-font-weight: bold");
        lbl.prefHeightProperty().bind(borderPane.heightProperty().subtract(2*SIZE));
        lbl.prefWidthProperty().bind(borderPane.widthProperty().subtract(2*SIZE));

        return lbl;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

