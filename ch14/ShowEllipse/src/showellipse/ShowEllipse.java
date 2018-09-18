/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showellipse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 *
 * @author kaiyan
 */
public class ShowEllipse extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        Scene scene = new Scene(new EllipsePane(), 300, 200);
        
        primaryStage.setTitle("ShowEllipse");
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

class EllipsePane extends Pane{

    private void paint(){
        //getChildren().clear();
        for (int i = 0; i < 16; i++) {
            Ellipse e = new Ellipse(getWidth()/2, getHeight()/2,
                    getWidth()/2 - 50, getHeight()/2 - 50);
           
            e.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            //e.setFill(Color.WHITE);
            e.setFill(null);
            e.setRotate(i * 180 / 16);
            getChildren().add(e);
        }
    }
    
    @Override
    public void setWidth(double width){
        super.setWidth(width);
        paint();
    }
    
    @Override
    public void setHeight(double height){
        super.setHeight(height);
        paint();
    }
}