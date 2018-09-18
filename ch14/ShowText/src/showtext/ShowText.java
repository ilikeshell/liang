/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showtext;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author kaiyan
 */
public class ShowText extends Application {
    
    @Override
    public void start(Stage primaryStage) {       
        Pane root = new Pane();
        root.setPadding(new Insets(5, 5, 5, 5));
        
        Text text1 = new Text(20, 20, "Programming is fun");
        text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
        root.getChildren().add(text1);
        
        Text text2 = new Text(60, 60, "Programming is fun\nDisplay text");
        root.getChildren().add(text2);
        
        Text text3 = new Text(10, 100, "Programming is fun\nDisplay text");
        text3.setFill(Color.RED);
        text3.setStrikethrough(true);
        text3.setUnderline(true);
        root.getChildren().add(text3);
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("ShowText");
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
