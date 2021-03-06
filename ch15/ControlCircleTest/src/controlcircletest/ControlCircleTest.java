/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlcircletest;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author kaiyan
 */
public class ControlCircleTest extends Application {
    private CirclePane cp;
    @Override
    public void start(Stage primaryStage) {
        cp = new CirclePane();
        
        HBox hb = new HBox(20);
        Button btButton1 = new Button("Enlarge");
        Button btButton2 = new Button("Shrink");
        hb.getChildren().addAll(btButton1, btButton2); 
        hb.setAlignment(Pos.CENTER);
        hb.setPadding(new Insets(5, 5, 5, 5));
        
        CirclePane.EnlargeHandler handler = cp.new EnlargeHandler();
        
       btButton1.setOnAction(handler);
       btButton2.setOnAction(cp.new ShrinkHandler());
                
        BorderPane bp = new BorderPane();
        bp.setBottom(hb);
        bp.setCenter(cp);
        Scene scene = new Scene(bp, 200, 150);
        
        primaryStage.setTitle("NewControlCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    } 
    
        
}

class CirclePane extends StackPane{
    private Circle c;
    public CirclePane() {
        c = new Circle(50);
        c.setStroke(Color.BLACK);
        c.setFill(Color.WHITE);
        getChildren().add(c);
    }
    
    public void ShrinkCircle(){
        
    }
    
    public void EnlargeCircle(){
        
    }
    
    class ShrinkHandler implements EventHandler<ActionEvent>{
            @Override
            public void handle(ActionEvent event){
                c.setRadius(c.getRadius() > 2 ?
                c.getRadius() - 2 : c.getRadius());
            }
        }

        
        class EnlargeHandler implements EventHandler<ActionEvent>{
            @Override
            public void handle(ActionEvent event){
                c.setRadius(c.getRadius() + 2);
            }
        }
}