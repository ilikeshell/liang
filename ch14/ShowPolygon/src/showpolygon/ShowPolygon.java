/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showpolygon;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

/**
 *
 * @author kaiyan
 */
public class ShowPolygon extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Polyline p = new Polyline();
        p.setFill(Color.WHITE);
        p.setStroke(Color.BLACK);
        ObservableList list = p.getPoints();
        
        double centerX = 150;
        double centerY = 125;
        double radius = 100;
        
        for (int i = 0; i < 6; i++) {
            list.add(centerX + radius * Math.cos(Math.PI * 2 / 6 * i));
            list.add(centerY - radius * Math.sin(Math.PI * 2 / 6 * i));
        }
        
        Group group = new Group(p);
        Scene scene = new Scene(new BorderPane(group), 300, 250);
        
        primaryStage.setTitle("ShowPolygon");
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
