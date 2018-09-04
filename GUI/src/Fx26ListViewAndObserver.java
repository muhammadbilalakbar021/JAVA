package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.collections.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Fx26ListViewAndObserver extends Application {

    private final ObservableList<String> countries;
    private final ObservableList<String> capitals;

    private final ListView<String> countriesListView;
    private final ListView<String> capitalsListView;

    private final Button leftButton;
    private final Button rightButton;

    public Fx26ListViewAndObserver() {
        countries = FXCollections.observableArrayList("Australia",
                "Vienna", "Canberra", "Austria", "Belgium", "Santiago",
                "Chile", "Brussels", "San Jose", "Finland", "India");
        countriesListView = new ListView<>(countries);

        capitals = FXCollections.observableArrayList("Costa Rica",
                "New Delhi", "Washington DC", "USA", "UK", "London",
                "Helsinki", "Taiwan", "Taipei", "Sweden", "Stockholm");
        capitalsListView = new ListView<>(capitals);

        leftButton = new Button(" < ");
        leftButton.setOnAction(new ButtonHandler());

        rightButton = new Button(" > ");
        rightButton.setOnAction(new ButtonHandler());
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Arrange Countries and Capitals");
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 700, 450);

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(5));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Label countriesLabel = new Label("Countries");
        GridPane.setHalignment(countriesLabel, HPos.CENTER);
        gridPane.add(countriesLabel, 0, 0);

        Label capitalsLabel = new Label("Capitals");
        GridPane.setHalignment(capitalsLabel, HPos.CENTER);
        gridPane.add(capitalsLabel, 2, 0);

        gridPane.add(countriesListView, 0, 1);
        gridPane.add(capitalsListView, 2, 1);

        VBox vbox = new VBox();
        vbox.getChildren().addAll(rightButton, leftButton);
        gridPane.add(vbox, 1, 1);

        borderPane.setCenter(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private class ButtonHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {

            if (event.getSource().equals(leftButton)) {
                String str = capitalsListView.getSelectionModel().getSelectedItem();
                if (str != null) {
                    capitals.remove(str);
                    countries.add(str);
                }

            } else if (event.getSource().equals(rightButton)) {
                String str = countriesListView.getSelectionModel().getSelectedItem();

                if (str != null) {
                    countriesListView.getSelectionModel().clearSelection();
                    countries.remove(str);
                    capitals.add(str);
                }
            }
        }
    }
}



