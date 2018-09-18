/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handleevent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author kaiyan
 */
public class HandleEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox(20);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10, 30, 10, 30));
        Button btOK = new Button("OK");
        OKHandlerClass handler1 = new OKHandlerClass();
        btOK.setOnAction(handler1);
        
        Button btCancel = new Button("Cancel");
        CancelHandlerClass handler2 = new CancelHandlerClass();
        btCancel.setOnAction(handler2);
        
        hBox.getChildren().addAll(btOK, btCancel);
        Scene scene = new Scene(hBox);
        
        primaryStage.setTitle("HandleEvent");
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

class OKHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e){
        System.out.println("OK button Clicked");
    }
}

class CancelHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e){
        System.out.println("Cancel Button clicked");
    }
}