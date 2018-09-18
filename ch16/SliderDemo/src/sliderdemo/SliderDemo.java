/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sliderdemo;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author kaiyan
 */
public class SliderDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text text = new Text(20, 20, "JavaFX programming is fun");
        
        Slider hSlider = new Slider();
        hSlider.setShowTickLabels(true);
        hSlider.setShowTickMarks(true);
        hSlider.setMajorTickUnit(10);
        hSlider.setMinorTickCount(10);
        
        Slider vSlider = new Slider();
        vSlider.setOrientation(Orientation.VERTICAL);
        vSlider.setShowTickLabels(true);
        vSlider.setShowTickMarks(true);
        //vSlider.setValue(100);
        
        Pane pane = new Pane(text);
        BorderPane root = new BorderPane(pane);
        root.setBottom(hSlider);
        root.setRight(vSlider);
        
        hSlider.valueProperty().addListener(ov -> {
            text.setX(hSlider.getValue() * pane.getWidth() / hSlider.getMax());
            });
        
        vSlider.valueProperty().addListener(ov -> {
            text.setY((vSlider.getMax() - vSlider.getValue()) * pane.getHeight() / vSlider.getMax());
        });
        
        Scene scene = new Scene(root, 450, 170);
        
        primaryStage.setTitle("SliderDemo");
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
