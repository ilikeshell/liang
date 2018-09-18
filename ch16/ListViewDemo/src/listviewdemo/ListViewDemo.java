/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listviewdemo;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author kaiyan
 */
public class ListViewDemo extends Application {
    private String[] flagTitiles = {"Canada", "China", "Denmark",
        "France", "Germany", "India", "Norway", "United Kingdom",
        "United States of America"
    };
    
    private ImageView[] imageViews = {
        new ImageView("image/ca.gif"),
        new ImageView("image/china.gif"),
        new ImageView("image/denmark.gif"),
        new ImageView("image/fr.gif"),
        new ImageView("image/germany.gif"),
        new ImageView("image/india.gif"),
        new ImageView("image/norway.gif"),
        new ImageView("image/uk.gif"),
        new ImageView("image/us.gif")
    };
    
    @Override
    public void start(Stage primaryStage) {
        //Create a ListView
        ListView<String> lv = new ListView<>();
        ObservableList<String> items = 
                FXCollections.observableArrayList(flagTitiles);
        lv.getItems().addAll(items);
        //lv.setPrefSize(150, 400);
        //lv.setPrefWidth(150);
        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        
        
        //Create A flow pane to hold images
        FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL, 10, 10);
        ScrollPane scrollPane = new ScrollPane(lv);
        BorderPane root = new BorderPane();
        root.setLeft(scrollPane);
        root.setCenter(flowPane);
        
        lv.getSelectionModel().selectedItemProperty().addListener(
            new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("Selected indices: " + 
                        lv.getSelectionModel().getSelectedIndices());
                System.out.println("Selected items: " + 
                        lv.getSelectionModel().getSelectedItem());
                
                flowPane.getChildren().clear();
                for (Integer i : lv.getSelectionModel().getSelectedIndices()) {
                    flowPane.getChildren().add(imageViews[i]);
                }
            }
        });
        
        Scene scene = new Scene(root, 450, 170);
        
        primaryStage.setTitle("ListViewDemo");
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
