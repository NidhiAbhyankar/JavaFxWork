package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import javax.xml.soap.SOAPPart;

public class Main extends Application implements EventHandler {
    private Button rotateButton;
    private Button blurButton;
    private Button scaleButton;

    private Rotate rotate;
    private double angle;
    private BoxBlur blur;
    private double blurVal;
    private Scale scale;
    private double scaleFactor;


    @Override
    public void start(Stage primaryStage) throws  Exception{

        primaryStage.setTitle("Life Cycle");
        angle=0.0;
        blurVal=1.0;
        scaleFactor=0.4;

        rotateButton=new Button("Rotate");
        blurButton=new Button("Blur off");
        scaleButton=new Button("Scale");
        scale=new Scale(scaleFactor,scaleFactor);

        rotate=new Rotate();
        blur=new BoxBlur(1.0,1.0,1);

        rotateButton.setOnAction(this);
        blurButton.setOnAction(this);
        scaleButton.setOnAction(this);

        Label reflect=new Label("Reflection adds Visual Sparkle");

        FlowPane root=new FlowPane(15,15);
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(rotateButton,blurButton,scaleButton,reflect);
        primaryStage.setScene(new Scene(root, 300, 120));
        primaryStage.show();

        rotateButton.getTransforms().add(rotate);
        scaleButton.getTransforms().add(scale);
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(Event event) {
            if(event.getSource().equals(rotateButton)){
                angle+=15.0;
                rotate.setAngle(angle);
                rotate.setPivotX(rotateButton.getWidth()/2);
                rotate.setPivotY(rotateButton.getHeight()/2);

                //System.out.println("Rotate Button Clicked");
            }

            if(event.getSource().equals(blurButton)){
                if(blurVal==10.0){
                    blurVal=1.0;
                    blurButton.setEffect(null);
                    blurButton.setText("Blur off");
                }else{
                    blurVal++;
                    blurButton.setEffect(blur);
                    blurButton.setText("Blur on");
                }
                blur.setWidth(blurVal);
                blur.setHeight(blurVal);

            }
            if(event.getSource().equals(scaleButton)){
                scaleFactor+=0.1;
                if(scaleFactor > 2.0) scaleFactor=0.4;
                scale.setX(scaleFactor);
                scale.setY(scaleFactor);
            }

    }

}
