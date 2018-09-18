/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showrectangle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowRectangle extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Rectangle r1 = new Rectangle(25, 10, 60, 30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);
        
        Rectangle r2 = new Rectangle(25, 50, 60, 30);
        Rectangle r3 = new Rectangle(25, 90, 60, 30);
        r3.setArcWidth(15);
        r3.setArcHeight(25);
        
        //Create a group
        Group group = new Group();
        //Pane group = new Pane();
        group.getChildren().addAll(new Text(10, 30, "r1"), r1,
                new Text(10, 70, "r2"), r2, new Text(10, 110, "r3"), r3);
        
        for (int i = 0; i < 4; i++) {
            Rectangle r = new Rectangle(100, 50, 100, 30);
            r.setRotate(i * 360 / 8);
            r.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            //r.setFill(Color.WHITE);
            r.setFill(null);
            group.getChildren().add(r);
        }
        
        group.setScaleX(2);
        group.setScaleY(2);
        
        Scene scene = new Scene(new BorderPane(group), 500, 300);
        
        primaryStage.setTitle("ShowRectangle");
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
