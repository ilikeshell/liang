/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textareademo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author kaiyan
 */
public class TextAreaDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        DescriptionPane descriptionPane = new DescriptionPane();
        
        //Set title, text and image in the description pane
        descriptionPane.setTittle("Canada");
        String description = new String("The Canadian national flag ...");
        descriptionPane.setImageView(new ImageView("image/ca.gif"));
        descriptionPane.setDescription(description);
        
        Scene scene = new Scene(descriptionPane, 450, 200);
        
        primaryStage.setTitle("TextAreaDemo");
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
