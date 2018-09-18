import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

public class ShowCircle extends Application{
    @Override
    public void start(Stage prStage){
        Pane pane = new Pane();
        
        Circle c = new Circle();
        //c.setCenterX(100);
        //c.setCenterY(100);
        c.centerXProperty().bind(pane.widthProperty().divide(2));
        c.centerYProperty().bind(pane.heightProperty().divide(2));
        c.setRadius(50);
        //c.setStroke(Color.RED);
        //c.setFill(Color.WHITE);
        c.setStyle("-fx-stroke: black; -fx-fill: red;");
        
        
        pane.getChildren().add(c);
        Scene scene = new Scene(pane, 200, 200);
        
        prStage.setTitle("Button in a pane!");
        prStage.setScene(scene);
        prStage.show();
    }
}