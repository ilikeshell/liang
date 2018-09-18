/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bounceball;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

/**
 *
 * @author kaiyan
 */
public class BounceBall extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BallPane ballPane = new BallPane();
        
        //pause and resume animation
        ballPane.setOnMousePressed(e -> ballPane.pause());
        ballPane.setOnMouseReleased(e -> ballPane.play());
        
        //increase and decrease animation
        ballPane.setOnKeyPressed( e -> {
            if(e.getCode() == KeyCode.UP)
                ballPane.increaseSpeeed();
            else if(e.getCode() == KeyCode.DOWN)
                ballPane.decreaseSpeed();
        });
        
        Scene scene = new Scene(ballPane, 250, 150);
        
        primaryStage.setTitle("Bounce Ball Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //
        ballPane.requestFocus();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
