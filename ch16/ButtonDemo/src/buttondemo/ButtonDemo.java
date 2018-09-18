/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttondemo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author kaiyan
 */
public class ButtonDemo extends Application {
    protected Text text = new Text(50, 50, "JavaFX Programming");
    
    protected BorderPane getPane(){
        HBox hBox = new HBox(20);
        Button btLeft = new Button("Left", new ImageView("image/left.gif"));
        Button btRight = new Button("Right", new ImageView("image/right.gif"));
        
        hBox.getChildren().addAll(btLeft, btRight);
        hBox.setAlignment(Pos.CENTER);
        hBox.setStyle("-fx-border-color: green");
        
        BorderPane pane = new BorderPane();
        pane.setBottom(hBox);
        
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);
        
        btLeft.setOnAction(e -> text.setX(text.getX() - 10));
        btRight.setOnAction(e -> text.setX(text.getX() + 10));
        
        return pane;
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        Scene scene = new Scene(getPane(), 450, 200);
        
        primaryStage.setTitle("ButtonDemo");
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
