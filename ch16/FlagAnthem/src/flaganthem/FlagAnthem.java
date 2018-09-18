/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flaganthem;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 *
 * @author kaiyan
 */
public class FlagAnthem extends Application {
    private final static int NUMBER_OF_NATIONS = 7;
    private final static String URLBase = 
            "http://liveexample.pearsoncmg.com/common";
    private int index = 0;
    private Image[] flagsImage = new Image[NUMBER_OF_NATIONS];
    private MediaPlayer[] mps = new MediaPlayer[NUMBER_OF_NATIONS];
    
    @Override
    public void start(Stage primaryStage) {
        
        //Load images and audio
        for (int i = 0; i < NUMBER_OF_NATIONS; i++) {
            flagsImage[i] = new Image(URLBase + "/image/flag" + i + ".gif");
            mps[i] = new MediaPlayer(
                    new Media(URLBase + "/audio/anthem/anthem" + i + ".mp3"));
        }
        
        Button btnPlayPause = new Button("||");
        btnPlayPause.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(btnPlayPause.getText().equals(">")){
                    btnPlayPause.setText("||");
                    mps[index].play();
                }
                else{
                    btnPlayPause.setText(">");
                    mps[index].pause();
                }      
            }
        });
        
        ImageView imageView = new ImageView(flagsImage[index]);
        ComboBox<String> cboNation = new ComboBox<>();
        ObservableList<String> items = FXCollections.observableArrayList(
            "Denmark", "Germany", "China", "India", "Norway", "UK", "US");
        cboNation.getItems().addAll(items);
        cboNation.setValue(items.get(0));
        cboNation.setOnAction(e -> {
            mps[index].stop();
            index = items.indexOf(cboNation.getValue());
            imageView.setImage(flagsImage[index]);
            mps[index].play();
            btnPlayPause.setText("||");
        });
        
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(btnPlayPause, new Label("Select a nation: "),
                cboNation);
        hBox.setPadding(new Insets(5, 5, 5, 5));
        hBox.setAlignment(Pos.CENTER);
        
        BorderPane root = new BorderPane(imageView);
        root.setBottom(hBox);
        
        Scene scene = new Scene(root, 350, 270);
        
        primaryStage.setTitle("FlagAnthem");
        primaryStage.setScene(scene);
        primaryStage.show();
        mps[index].play();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
