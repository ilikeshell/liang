/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaiyan
 */
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ButtonInPane extends Application{
    @Override
    public void start(Stage prStage){
        Button btButton = new Button("OK");
        btButton.setStyle("-fx-border-color: blue;");
        StackPane pane = new StackPane();
        pane.getChildren().add(btButton);
        pane.setRotate(45);
        pane.setStyle("-fx-border-color: red; -fx-backgroud-color: lightgray;");
        pane.setScaleX(1);
        pane.setScaleY(2);
        
        Scene scene = new Scene(pane, 300, 250);
        
        prStage.setTitle("Button in a pane!");
        prStage.setScene(scene);
        prStage.show();
    }
}
