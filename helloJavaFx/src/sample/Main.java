package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Label myLabel;
    private TextField nameTextField;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello JavaFx");
        Button button=new Button();
        button.setText("Click Me!");
        myLabel=new Label();
        myLabel.setText("This is my Label!");

        nameTextField=new TextField();
        nameTextField.setPromptText("Enter your name");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String name=nameTextField.getText().trim();
                button.setText("Button Clicked!");
                myLabel.setText(name);
                //System.out.println("Hello JavaFx");
            }
        });

        FlowPane flowPaneRoot=new FlowPane(10,10);
        flowPaneRoot.setAlignment(Pos.BASELINE_CENTER);

       // StackPane root=new StackPane();
        flowPaneRoot.getChildren().add(button);
        flowPaneRoot.getChildren().add(myLabel);
        flowPaneRoot.getChildren().add(nameTextField);
        Scene scene=new Scene(flowPaneRoot,250,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
