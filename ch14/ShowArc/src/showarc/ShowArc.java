/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showarc;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowArc extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Arc arc1 = new Arc(150, 100, 80, 80, 30, 35);
        arc1.setFill(Color.RED);
        arc1.setType(ArcType.ROUND);
        
        Arc arc2 = new Arc(150, 100, 80, 80, 30+90, 35);
        arc2.setFill(Color.WHITE);
        arc2.setType(ArcType.OPEN);
        arc2.setStroke(Color.BLACK);
        
        Arc arc3 = new Arc(150, 100, 80, 80, 30+180, 35);
        arc3.setFill(Color.WHITE);
        arc3.setType(ArcType.CHORD);
        arc3.setStroke(Color.BLACK);
        
        Arc arc4 = new Arc(150, 100, 80, 80, 30+270, 35);
        arc4.setFill(Color.GREEN);
        arc4.setType(ArcType.CHORD);
        arc4.setStroke(Color.BLACK);
        
        Group group = new Group();
        group.getChildren().addAll(new Text(210, 40, "Arc1: round"), arc1,
                new Text(20, 40, "Arc2: open"), arc2,
                new Text(20, 170, "Arc3: chord"), arc3, 
                new Text(210, 170, "Arc4: chord"), arc4);
        
        
        Scene scene = new Scene(new BorderPane(group), 300, 250);
        
        primaryStage.setTitle("ShowArc");
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
