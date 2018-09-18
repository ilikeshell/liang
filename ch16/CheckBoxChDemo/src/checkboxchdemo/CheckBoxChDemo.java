/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkboxchdemo;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
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
public class CheckBoxChDemo extends Application {
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
        
        VBox paneForChkBox = new VBox(20);
        CheckBox chkBold = new CheckBox("Bold");
        CheckBox chkItalic = new CheckBox("Italic");
        chkBold.setSelected(true);
        chkItalic.setSelected(true);
        paneForChkBox.getChildren().addAll(chkBold, chkItalic);
        paneForChkBox.setAlignment(Pos.CENTER);
        paneForChkBox.setStyle("-fx-border-color: green");
        paneForChkBox.setPadding(new Insets(5, 5, 5, 5));
        pane.setRight(paneForChkBox);
        
        Font fontBoldItalic = Font.font("Times New Roman", FontWeight.BOLD, 
                FontPosture.ITALIC, 20);
        Font fontBold = Font.font("Times New Roman", FontWeight.BOLD, 
                FontPosture.REGULAR, 20);
        Font fontItalic = Font.font("Times New Roman", FontWeight.NORMAL, 
                FontPosture.ITALIC, 20);
        Font fontNormal = Font.font("Times New Roman", FontWeight.NORMAL, 
                FontPosture.REGULAR, 20);
        
        EventHandler<ActionEvent> handler = e -> {
            if(chkBold.isSelected() && chkItalic.isSelected())
                text.setFont(fontBoldItalic);
            else if(chkBold.isSelected())
                text.setFont(fontBold);
            else if(chkItalic.isSelected())
                text.setFont(fontItalic);
            else 
                text.setFont(fontNormal);
        };
        
        text.setFont(fontBoldItalic);
        chkBold.setOnAction(handler);
        chkItalic.setOnAction(handler);
        
        
        //RadioButton
        VBox paneForRadioBtn = new VBox(20);
        paneForRadioBtn.setAlignment(Pos.CENTER_LEFT);
        paneForRadioBtn.setStyle("-fx-border-color: green");
        paneForRadioBtn.setPadding(new Insets(5, 5, 5, 5));
        
        //create radio buttons
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue = new RadioButton("Blue");
        
        //Join a group
        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbBlue.setToggleGroup(group);
        paneForRadioBtn.getChildren().addAll(rbRed,rbGreen,rbBlue);
        pane.setLeft(paneForRadioBtn);
        
        //
        rbRed.setOnAction(e -> {
            if(rbRed.isSelected())
                text.setFill(Color.RED);
        });
        
        rbGreen.setOnAction(e -> {
            if(rbGreen.isSelected())
                text.setFill(Color.GREEN);
        });
        
        rbBlue.setOnAction(e -> {
            if(rbBlue.isSelected())
                text.setFill(Color.BLUE);
        });
        
        return pane;
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        Scene scene = new Scene(getPane(), 450, 200);
        
        primaryStage.setTitle("CheckBoxDemo");
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
