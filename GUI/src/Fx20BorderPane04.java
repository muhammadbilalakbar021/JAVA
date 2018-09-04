package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Fx20BorderPane04 extends Application {

    private BorderPane borderPane;
    private final int SIZE = 60;

    @Override
    public void start(Stage stage) {
        initUI(stage);
    }

    private void initUI(Stage stage) {

        borderPane = new BorderPane();

        borderPane.setTop(getTopBar());

        Text text = new Text("Current Users");
        text.minHeight(20);

        ListView listView = new ListView();
        listView.getItems().add("Alice");
        listView.getItems().add("Bob");
        listView.getItems().add("Oracle");
        listView.setMaxWidth(100);
        VBox vBox = new VBox(10, text, listView);

        borderPane.setLeft(vBox);
        borderPane.setCenter(getForm());

        Scene scene = new Scene(borderPane, 600, 500);

        stage.setTitle("Users Management System");
        stage.setScene(scene);
        stage.show();
    }

    public GridPane getForm() {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Add New User ");
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

        Label email = new Label("Email:");
        grid.add(email, 0, 3);
        TextField emailTextField = new TextField();
        grid.add(emailTextField, 1, 3);

        Label addressLabel = new Label("Address :");
        grid.add(addressLabel, 0, 4);
        TextField addressTextField = new TextField();
        grid.add(addressTextField, 1, 4);

        Label subjects = new Label("Subjects :");
        grid.add(subjects, 0, 5);
        grid.add(getCheckBoxes(), 1, 5);

        Label gender = new Label("Gender :");
        grid.add(gender, 0, 6);

        RadioButton radioButton1 = new RadioButton("Male");
        RadioButton radioButton2 = new RadioButton("Female");
        ToggleGroup radioGroup = new ToggleGroup();
        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
        HBox hBox = new HBox(radioButton1, radioButton2);
        grid.add(hBox, 1, 6);

        Label cities = new Label("City :");
        grid.add(cities, 0, 7);
        ComboBox comboBox = new ComboBox();
        comboBox.getItems().add("Lahore");
        comboBox.getItems().add("Islamabad");
        comboBox.getItems().add("Karachi");
        comboBox.getItems().add("Multan");
        grid.add(comboBox, 1, 7);

        Button btn = new Button("Add User");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.TOP_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 8);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        return grid;
    }

    public HBox getCheckBoxes() {
        HBox hBox = new HBox(10);

        CheckBox radioButton1 = new CheckBox("OOP");
        CheckBox radioButton2 = new CheckBox("DB");
        CheckBox radioButton3 = new CheckBox("Web");
        CheckBox radioButton4 = new CheckBox("Android");

        hBox.getChildren().add(radioButton1);
        hBox.getChildren().add(radioButton2);
        hBox.getChildren().add(radioButton3);
        hBox.getChildren().add(radioButton4);

        return hBox;
    }

    public HBox getTopBar() {
        Button button1 = new Button("Add New");
        Button button2 = new Button("Update");
        Button button3 = new Button("Delete");
        Button button4 = new Button("Show/Hide List");

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

