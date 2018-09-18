/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediademo;

import java.io.File;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author kaiyan
 */
public class MediaDemo extends Application {
    private static final String MEDIA_URL = "test.mp4";
    
    @Override
    public void start(Stage primaryStage) {
        File file = new File(MEDIA_URL);
        System.out.println(file.toURI().toString());
        Media media = new Media(file.toURI().toString());
        MediaPlayer  mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaView.fitHeightProperty().bind(media.widthProperty());
        mediaView.fitWidthProperty().bind(media.heightProperty());
        
        
        Button btnPlayer = new Button(">");
        btnPlayer.setOnAction(e -> {
            if(btnPlayer.getText().equals(">")){
                mediaPlayer.play();
                btnPlayer.setText("||");
            }else{
                mediaPlayer.pause();
                btnPlayer.setText(">");
            }
        });
        
        Button btnRewind = new Button("<<");
        btnRewind.setOnAction(e -> mediaPlayer.seek(Duration.ZERO));
        Slider slVolume = new Slider();
        slVolume.setPrefWidth(150);
        slVolume.setMaxWidth(Region.USE_PREF_SIZE);
        slVolume.setMinWidth(30);
        slVolume.setValue(0);
        mediaPlayer.volumeProperty().bind(slVolume.valueProperty().divide(100));
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(btnPlayer, btnRewind, new Label("Volume"), slVolume);
        
        BorderPane root = new BorderPane();
        //root.widthProperty().bind(media.widthProperty());
        
        root.prefWidthProperty().bind(media.widthProperty());
        root.prefHeightProperty().bind(media.heightProperty().add(20));
        root.setCenter(mediaView);
        root.setBottom(hBox);
        
        System.out.println(media.getWidth() + "   " + media.getHeight());
        
        Scene scene = new Scene(root, 300, 200);
        //Scene scene = new Scene(root, mediaView.getFitWidth()+10, mediaView.getFitHeight()+30);
        //scene.widthProperty().bind(media.widthProperty());
        
        primaryStage.setTitle("MediaDemo!");
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
