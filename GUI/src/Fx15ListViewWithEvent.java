//package com.leadingtutorials.guiwithfx.fxbasics;
//
//import javafx.application.Application;
//import javafx.collections.ObservableList;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.ListView;
//import javafx.scene.layout.FlowPane;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//public class Fx15ListViewWithEvent extends Application {
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Hello World!");
//
//        ListView listView = new ListView();
//        listView.getItems().add("BSCS");
//        listView.getItems().add("MSCS");
//        listView.getItems().add("PhD. CS");
//
//        Button button = new Button("Read Selected Value");
//
//        button.setOnAction(event -> {
//            ObservableList selectedIndices = listView.getSelectionModel().getSelectedIndices();
//
//            for(Object o : selectedIndices){
//                System.out.println("o = " + o + " (" + o.getClass() + ")");
//            }
//        });
//
//        VBox vBox = new VBox(listView, button);
//
//        FlowPane flowPane = new FlowPane(20, 20);
//        flowPane.getChildren().add(vBox);
//
//        primaryStage.setScene(new Scene(flowPane, 500, 250));
//        primaryStage.show();
//    }
//}
