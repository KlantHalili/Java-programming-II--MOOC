package textstatistics;

import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{

    public void start(Stage stage){
        HBox fundi = new HBox();
        fundi.setSpacing(10);
        fundi.getChildren().add(new Label("Letters: 0"));
        fundi.getChildren().add(new Label("Words: 0"));
        fundi.getChildren().add(new Label("The longest word is:"));
        
        TextArea fusha = new TextArea();
        
        BorderPane pane = new BorderPane();
        pane.setCenter(fusha);
        pane.setBottom(fundi);
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
    }

}
