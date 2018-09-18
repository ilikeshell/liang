/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierpinskitriangle;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 *
 * @author kaiyan
 */
public class SierpinskiTriangle extends Application{
        
    @Override
    public void start(Stage primaryStage){
        SierpinskiTrianglePane pane = new SierpinskiTrianglePane();
        TextField tfOrder = new TextField("0");
        tfOrder.setOnAction(
         e -> pane.setOrder(Integer.parseInt(tfOrder.getText())));
        
        tfOrder.setPrefColumnCount(4);
        tfOrder.setAlignment(Pos.BOTTOM_RIGHT);
        
        //Pane to hold label, text field, and a button
        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(new Label("Enter a order: "), tfOrder);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(5, 0, 5, 0));
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);
        
        //create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 200, 210);
        primaryStage.setTitle("SierpinskiTriangle");
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.paint();
        
        pane.widthProperty().addListener(ov -> pane.paint());
        pane.heightProperty().addListener(ov -> pane.paint());
    }
    
    /** Pane for displaying triangles */
    class SierpinskiTrianglePane extends Pane{
    private int order = 0;
    
    /** set a new order */
    public void setOrder(int order){
        this.order = order;
        paint();
    }
    
    SierpinskiTrianglePane(){}
    
    protected void paint(){
        
        Point2D p1 = new Point2D(getWidth() / 2, 10);
        Point2D p2 = new Point2D(10, getHeight() - 10);
        Point2D p3 = new Point2D(getWidth() - 10 , getHeight() - 10);
        
        this.getChildren().clear();
        displayTriangles(order, p1, p2, p3);
    }
    
    private void displayTriangles(int order, Point2D p1, Point2D p2, Point2D p3){
        if (order == 0) {
            Polygon triangle = new Polygon();
            triangle.getPoints().addAll(p1.getX(), p1.getY(), 
                    p2.getX(), p2.getY(), p3.getX(), p3.getY());
            triangle.setStroke(Color.BLACK);
            triangle.setFill(Color.WHITE);
            this.getChildren().add(triangle);
        } 
        else {
            Point2D p12 = p1.midpoint(p2);
            Point2D p23 = p2.midpoint(p3);
            Point2D p31 = p3.midpoint(p1);
            
            displayTriangles(order - 1, p1, p12, p31);
            displayTriangles(order - 1, p12, p2, p23);
            displayTriangles(order - 1, p31, p23, p3);
        }
    }
}

}


