
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ShowHBoxVBox extends Application{
    @Override
    public void start(Stage priStage){
        BorderPane bp = new BorderPane();
        
        bp.setTop(getHBox());
        bp.setLeft(getVBox());
        
        Scene scene = new Scene(bp);
        priStage.setScene(scene);
        priStage.setTitle("Show HBox and VBox demo");
        priStage.show();
    }
    
    private HBox getHBox(){
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setStyle("-fx-background-color: gold");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
        //Image image = new Image("image/us.gif");
        hBox.getChildren().add(new ImageView("image/us.gif"));
        
        return hBox;
    }
    
    private VBox getVBox(){
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 15, 15, 15));
        vBox.getChildren().add(new Label("Courses"));
        
        Label[] courses = {new Label("Java"), new Label("C++"), new Label("Math"),
            new Label("Data Structure")};
        
        for (Label course : courses) {
            VBox.setMargin(course, new Insets(0, 0, 0, 25));
            vBox.getChildren().add(course);
            //vBox.setAlignment(Pos.CENTER_RIGHT);
        }
        return vBox;
    }
}
