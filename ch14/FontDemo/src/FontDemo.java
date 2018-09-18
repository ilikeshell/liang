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
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

public class FontDemo extends Application{

    @Override
    public void start(Stage prStage){
        Pane pane = new StackPane();
        
        Circle c = new Circle();
        c.centerXProperty().bind(pane.widthProperty().divide(2));
        c.centerYProperty().bind(pane.heightProperty().divide(2));
        c.setRadius(100);
        c.setStroke(Color.RED);
        c.setFill(new Color(0.5, 0, 0, 0.1));
        pane.getChildren().add(c);
        
        Label label = new Label("JavaFX");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, 
                FontPosture.ITALIC, 48));
        pane.getChildren().add(label);
        
    
        
        Scene scene = new Scene(pane);
        prStage.setTitle("FontDemo");
        prStage.setScene(scene);
        prStage.show();
    }
}
