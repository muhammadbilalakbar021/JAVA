package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Fx23GListViewEvents extends Application {

    private BorderPane borderPane;
    private final int SIZE = 60;
    private Text output;

    @Override
    public void start(Stage stage) {
        initUI(stage);
    }

    private void initUI(Stage stage) {
        borderPane = new BorderPane();

        VBox vBox = new VBox(10, getListView());
        borderPane.setLeft(vBox);

        output = new Text("Output Text ... ");
        borderPane.setCenter(output);

        Scene scene = new Scene(borderPane, 600, 500);
        stage.setTitle("Users Management System");
        stage.setScene(scene);
        stage.show();
    }

    private ListView getListView() {
        ListView listView = new ListView();
        listView.getItems().add("Alice");
        listView.getItems().add("Bob");
        listView.getItems().add("Oracle");

        listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ObservableList<String> observableList =
                        listView.getSelectionModel().getSelectedItems();
                for(String selectedItem : observableList){
                    output.setText(selectedItem);
                }
            }
        });

        listView.setMaxWidth(100);
        return listView;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

