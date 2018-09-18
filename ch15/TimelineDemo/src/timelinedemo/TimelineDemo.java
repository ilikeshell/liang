/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timelinedemo;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author kaiyan
 */
public class TimelineDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Text text = new Text(20, 50, "Programming is fun");
        text.setFill(Color.RED);
        Text text2 = new Text(20, 150, "Just a test");
        
        text2.setFill(Color.GREENYELLOW);
        pane.getChildren().add(text);
        pane.getChildren().add(text2);
        
        //
        EventHandler<ActionEvent> eventHandler = e -> {
            if(text.getText().length() !=0 )
                text.setText("");
            else
                text.setText("Programming is fun");
        };
        
        EventHandler<ActionEvent> eventHandler2 = e -> {
            if(text.getText().length() !=0 )
                text2.setText("");
            else
                text2.setText("Just a test");
        };
        
        //
        Timeline animation = new Timeline(
                new KeyFrame(Duration.millis(500), eventHandler),
                new KeyFrame(Duration.millis(500), eventHandler2));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
        
        //
        text.setOnMouseClicked(e -> {
            if(animation.getStatus() == Animation.Status.PAUSED)
                animation.play();
            else
                animation.pause();
        });
        
        Scene scene = new Scene(pane, 250, 250);
        
        primaryStage.setTitle("TimelineDemo");
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
