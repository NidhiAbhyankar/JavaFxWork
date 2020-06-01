package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler {
    private Label title;
    private Label response;
    private Label selected;

    private CheckBox bananaCB;
    private CheckBox mangoCB;
    private CheckBox papayaCB;
    private CheckBox grapeCB;
    private String fruits;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Favourite Fruit");
        title = new Label("What fruits do you like?");
        response = new Label("");
        selected = new Label("");

        bananaCB = new CheckBox("Banana");
        mangoCB = new CheckBox("Mango");
        papayaCB = new CheckBox("Papaya");
        grapeCB = new CheckBox("Grapes");

        //Register all our Checkboxs
        bananaCB.setOnAction(this);
        mangoCB.setOnAction(this);
        papayaCB.setOnAction(this);
        grapeCB.setOnAction(this);

        //Setup stage and Scene
        FlowPane flowPaneRoot = new FlowPane(Orientation.VERTICAL, 5, 5);
        flowPaneRoot.setAlignment(Pos.CENTER);

        flowPaneRoot.getChildren().add(title);
        flowPaneRoot.getChildren().addAll(bananaCB, mangoCB, papayaCB, grapeCB, response, selected);

        //Attach eventListener

        Scene scene = new Scene(flowPaneRoot, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

        showAll();


    }

    void showAll() {
        fruits = "";
        if(bananaCB.isSelected()) fruits+=" Banana";
        if(mangoCB.isSelected()) fruits+=" Mango";
        if(papayaCB.isSelected()) fruits+=" Papaya";
        if(grapeCB.isSelected()) fruits+=" Grapes";
        selected.setText("Fruits Slected:"+ fruits);
        

    }


    public static void main(String[] args) {
        launch(args);
    }

   @Override
    public void handle(Event event) {
        Object fruitChecked = event.getSource();
        if (bananaCB.equals(fruitChecked)) {
            if (bananaCB.isSelected()) {
                response.setText("Banana Selected!");
            } else response.setText("Banana Cleared!");
            showAll();
        }
        if (mangoCB.equals(fruitChecked)) {
            if (mangoCB.isSelected()) {
                response.setText("Mango Selected!");
            } else response.setText("Mango Cleared");
            showAll();
        }

        if (papayaCB.equals(fruitChecked)) {
            if (papayaCB.isSelected()) {
                response.setText("Papaya Selected!");
            } else response.setText("Papaya Cleared");
            showAll();
        }
        if (grapeCB.equals(fruitChecked)) {
            if (grapeCB.isSelected()) {
                response.setText("Grapes Selected!");
            } else response.setText("Grapes Cleared");
            showAll();
        }
    }   
}