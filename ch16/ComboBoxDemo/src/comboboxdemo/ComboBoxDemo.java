/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comboboxdemo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author kaiyan
 */
public class ComboBoxDemo extends Application {
    private String[] flagTitles = {"Canada", "China", "Denmark",
        "France", "Germany", "India", "Norway", "United Kingdom",
        "United States of America"};
    
    private ImageView[] flagImage = {new ImageView("image/ca.gif"),
      new ImageView("image/china.gif"),
      new ImageView("image/denmark.gif"),
      new ImageView("image/fr.gif"),
      new ImageView("image/germany.gif"),
      new ImageView("image/india.gif"),
      new ImageView("image/norway.gif"),
      new ImageView("image/uk.gif"),
      new ImageView("image/us.gif")
    };
    
    private String[] flagDescription = {
        "The Canadian national flag ...",
        "Description for China ...",
        "Description for Denmark ...",
        "Description for France ...",
        "Description for Germany ...",
        "Description for India ...",
        "Description for Norway ...",
        "Description for UK ...",
        "Description for US ..."
    };
    
    private DescriptionPane descriptionPane = new DescriptionPane();
    
    private ComboBox<String> cbo = new ComboBox<>();
    
    @Override
    public void start(Stage primaryStage) {
        setDisplay(0);
        
        BorderPane pane = new BorderPane();
        
        BorderPane paneForComboBox = new BorderPane();
        paneForComboBox.setLeft(new Label("Select a country: "));
        paneForComboBox.setCenter(cbo);
        pane.setTop(paneForComboBox);
        cbo.setPrefWidth(400);
        cbo.setValue("Canada");
        
        ObservableList<String> items = 
                FXCollections.observableArrayList(flagTitles);
        cbo.getItems().addAll(items);
        pane.setCenter(descriptionPane);
        //descriptionPane.setTop(paneForComboBox);
        
        //
        cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));
        
        Scene scene = new Scene(pane, 450, 170);
        //Scene scene = new Scene(descriptionPane, 450, 170);
        
        primaryStage.setTitle("ComboBoxDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void setDisplay(int index){
        descriptionPane.setTittle(flagTitles[index]);
        descriptionPane.setImageView(flagImage[index]);
        descriptionPane.setDescription(flagDescription[index]);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
