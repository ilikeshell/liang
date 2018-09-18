/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrollbardemo;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author kaiyan
 */
public class ScrollBarDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text text = new Text(20, 20, "JavaFX programming is fun");
        
        ScrollBar hScrollBar = new ScrollBar();
        ScrollBar vScrollBar = new ScrollBar();
        vScrollBar.setOrientation(Orientation.VERTICAL);
        hScrollBar.setVisibleAmount(15);
        
        Pane pane = new Pane(text);
        BorderPane root = new BorderPane(pane);
        root.setBottom(hScrollBar);
        root.setRight(vScrollBar);
        
        hScrollBar.valueProperty().addListener(ov -> {
            text.setX(hScrollBar.getValue() * pane.getWidth() / hScrollBar.getMax());
            System.out.print("hScrollBar.getValue() is: " + hScrollBar.getValue());
            System.out.print("  pane.getWidth() is: " + pane.getWidth());
            System.out.print("  hScrollBar.getMax() is: " + hScrollBar.getMax());
            System.out.println("  VisibleAmount: " + hScrollBar.getVisibleAmount());
            
        });
        
        vScrollBar.valueProperty().addListener(ov -> {
            text.setY(vScrollBar.getValue() * pane.getHeight() / vScrollBar.getMax());
        });
        
        Scene scene = new Scene(root, 450, 170);
        
        primaryStage.setTitle("Hello World!");
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
