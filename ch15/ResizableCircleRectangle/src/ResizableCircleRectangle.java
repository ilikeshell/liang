

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class ResizableCircleRectangle extends Application{
    private StackPane stackPane = new StackPane();
    private Circle circle = new Circle(60);
    private Rectangle rectangle = new Rectangle(120, 120);
    @Override
    public void start(Stage priStage){ 
        circle.setFill(Color.GRAY);
        circle.setStroke(Color.BLUE);
        rectangle.setFill(Color.TRANSPARENT);
        rectangle.setStroke(Color.BLACK);
        
        stackPane.getChildren().addAll(circle, rectangle);
        
        Scene scene = new Scene(stackPane, 250, 140);
        priStage.setScene(scene);
        priStage.setTitle("Resizable Circle and rectangle");
        priStage.show();
        
        priStage.widthProperty().addListener((ov) -> resize());
        priStage.heightProperty().addListener(ov -> resize());
    }
    
    private void resize(){
        double length = Math.min(stackPane.getWidth(), stackPane.getHeight());
        circle.setRadius(length/2 -15);
        rectangle.setWidth(length - 30);
        rectangle.setHeight(length - 30);
    }
}
