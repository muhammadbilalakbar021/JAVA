package com.bitspedia.guiwithfx.fxbasics;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Fx23FormCodeStructure extends Application {
    UserService userService = new UserService();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Delete Record");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label userName = new Label("User ID:");
        grid.add(userName, 0, 0);

        TextField userIdTextField = new TextField();
        grid.add(userIdTextField, 1, 0);

        Button btn = new Button("Delete Record");
        grid.add(btn, 0, 2);

        Text output = new Text();
        grid.add(output, 1, 2);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                boolean status = userService.delete(Integer.parseInt(userIdTextField.getText()));
                if (status)
                    output.setText("Record Deleted ... ");
                else
                    output.setText("Record Not Deleted ... ");
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
