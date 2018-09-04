

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.ArrayList;


public class FxForm extends Application {
    Label welcome, nameLabel, dobLabel, genderLabel, bloodGroup,
            heightLabel, vehicleTypeLabel, nicLabel;
    Label notificationLabel = new Label("");

    RadioButton maleButton, femaleButton;
    TextField name, height, nic;

    Slider heightSlider;
    DatePicker dob;

    ArrayList<CheckBox> vehicles = new ArrayList<CheckBox>();
    Button submit, print, exit;

    @Override
    public void start(Stage primaryStage) {
        welcome = new Label("City Traffic Police");
        welcome.setFont(Font.font("Verdana", FontWeight.BOLD, 30));

        nameLabel = new Label("Name");
        name = new TextField();

        dobLabel = new Label("Date of Birth");
        dob = new DatePicker();

        nicLabel = new Label("NIC ");
        nic = new TextField();

        genderLabel = new Label("Gender");
        maleButton = new RadioButton("Male");
        femaleButton = new RadioButton("Female");
        ToggleGroup btnGroup = new ToggleGroup();
        maleButton.setToggleGroup(btnGroup);
        femaleButton.setToggleGroup(btnGroup);

        HBox genderGroup = new HBox();
        genderGroup.getChildren().addAll(maleButton, femaleButton);

        bloodGroup = new Label("Blood Group");
        ObservableList<String> options = FXCollections.observableArrayList(
                "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-");

        final ComboBox bloodGroupCombo = new ComboBox(options);
        bloodGroupCombo.setPromptText("Blood Group");
        bloodGroupCombo.setVisibleRowCount(4);

        heightLabel = new Label("Height");
        height = new TextField();

        heightSlider = new Slider(1.2, 2.4, 1.5);
        heightSlider.setShowTickLabels(true);
        heightSlider.setShowTickMarks(true);
        heightSlider.setMajorTickUnit(1);

        vehicleTypeLabel = new Label("Vehicle Name");

        HBox vehicleBox = new HBox(4);
        vehicles.add((new CheckBox("Bike")));
        vehicles.add(new CheckBox("Car"));
        vehicles.add(new CheckBox("Bus"));
        vehicles.add(new CheckBox("Truck"));
        vehicleBox.getChildren().addAll(vehicles);

        genderGroup.setPadding(Insets.EMPTY);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(25));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(welcome, 0, 0, 3, 1);
        grid.add(nameLabel, 0, 1);
        grid.add(name, 1, 1);
        grid.add(nicLabel, 0, 2);
        grid.add(nic, 1, 2);

        grid.add(dobLabel, 0, 3);
        grid.add(dob, 1, 3);
        grid.add(genderLabel, 0, 4);
        grid.add(genderGroup, 1, 4);
        grid.add(bloodGroup, 0, 5);
        grid.add(bloodGroupCombo, 1, 5);
        grid.add(heightLabel, 0, 6);
        grid.add(heightSlider, 1, 6);
        grid.add(vehicleTypeLabel, 0, 7);
        grid.add(vehicleBox, 1, 7);
        grid.add(notificationLabel, 1, 9);

        submit = new Button("Submit");
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Adding driver ... ");
                notificationLabel.setText("Driver added successfully");
            }
        });
        print = new Button("Print");

        print.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Print button handler code here ... ");
            }
        });

        exit = new Button("Exit");
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
                System.exit(0);
            }
        });

        HBox buttonBox = new HBox(3);
        buttonBox.setSpacing(15);
        buttonBox.getChildren().addAll(submit, print, exit);

        grid.add(buttonBox, 1, 8);

        Scene scene = new Scene(grid, 500, 400);
        scene.getStylesheets().add(this.getClass().getResource("Style.css").toExternalForm());

        primaryStage.setTitle("City Traffic Police!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public MenuBar menu() {
        MenuBar mainMenu = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem newMenu = new MenuItem("New");
        return mainMenu;
    }
}
