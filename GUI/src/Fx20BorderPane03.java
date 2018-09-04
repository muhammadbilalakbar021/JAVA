package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Fx20BorderPane03 extends Application {

    private BorderPane borderPane;
    private final int SIZE = 60;

    @Override
    public void start(Stage stage) {
        initUI(stage);
    }

    private void initUI(Stage stage) {
        borderPane = new BorderPane();


        borderPane.setTop(getTopBar());


        borderPane.setBottom(getBottomLabel());

        ListView listView = new ListView();
        listView.getItems().add("BSCS");
        listView.getItems().add("MSCS");
        listView.getItems().add("PhD. CS");
        listView.setMaxWidth(100);
        borderPane.setLeft(listView);
        borderPane.setRight(getRightLabel());
        borderPane.setCenter(getForm());

        Scene scene = new Scene(borderPane, 450, 400);

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

    public GridPane getForm(){
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.TOP_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        return grid;
    }

    public HBox getTopBar(){

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");

        button1.setPrefHeight(SIZE);
        button2.setPrefHeight(SIZE);
        button3.setPrefHeight(SIZE);
        button4.setPrefHeight(SIZE);

        HBox hbox = new HBox(button1, button2, button3, button4);

        hbox.setPrefHeight(SIZE);
        hbox.prefWidthProperty().bind(borderPane.widthProperty());
        hbox.setStyle("-fx-border-style: dotted; -fx-border-width: 0 0 1 0;"
                + "-fx-border-color: gray; -fx-font-weight: bold");
        return hbox;
    }

    public static void main(String[] args) {
        launch(args);
    }

}

